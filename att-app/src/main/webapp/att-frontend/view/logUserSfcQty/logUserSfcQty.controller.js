sap.ui.define(
  [
    "fw/core/BaseController",
    'sap/m/MessageBox',
    "att/view/logUserSfcQty/logUserSfcQtyApi",
  ],
  function (BaseController, MessageBox) {
    "use strict";

    /**
     * BaseController不在個別的專案各自維護，統一維護在FW
     */
    return BaseController.extend("att.view.logUserSfcQty.logUserSfcQty", {
      onInit: function () {
        this.attachPatternMatched("logUserSfcQty", this.onRouteMatched);
      },
      onRouteMatched: function (oEvent) {
        var req = oEvent.getParameter("arguments")["?req"];
        var me = this;

        this.setModel({
          site: this.getSite(),
          operation: req.OPERATION,
          sfc: req.SFC,
          resource: req.RESOURCE,
          sfcQty: "",
          table: []
        });

        var oData = this.getData();
        var oView = me.getView();
        if (!oData.operation) {
          oView.setBlocked(true);
          me.error('logUserSfcQty.error1');
        }

        if (!oData.resource) {
          oView.setBlocked(true);
          me.error('logUserSfcQty.error3');
        }

        if (!oData.sfc) {
          oView.setBlocked(true);
          me.error('logUserSfcQty.error2');
        }        
        
        this.search();
      },
      // 檢索
      search: function () {
        let me = this;
        let oData = this.getData();

        $logUserSfcQty.search({
          site: oData.site,
          operation: oData.operation,
          sfc: oData.sfc,
          resource: oData.resource,
          user: oData.user
        },
          function (res) {
            oData.sfcQty = res.qty;
            oData.confirmedQty = res.confirmedQty;
            oData.canUseQty = oData.sfcQty - oData.confirmedQty;
            oData.table = res.zProductionLogList;
            oData.table.forEach(element => {
              if(!element.qty && element.qty != 0){
                element.qty = oData.canUseQty
              }
              if(!element.ngQty){
                element.ngQty = 0
              }
            });
            me.refresh();
          },
          me.showMessage
        )
      },
      // 儲存
      save: function () {
        let me = this;
        let oData = this.getData();
        var i18n = me.getI18N();

        if(oData.table.length == 0){
          me.error('logUserSfcQty.error4');
        }

        let total = 0;
        oData.table.forEach(element => {
          this.isEmpty([element.qty, element.ngQty], ['logUserSfcQty.label5', 'logUserSfcQty.label6'])

          if(Number(element.qty) + Number(element.ngQty)> Number(oData.canUseQty)){
            me.error('logUserSfcQty.error7');
          }
          total+=Number(element.qty) + Number(element.ngQty);
          element.site = oData.site;
          element.operation = oData.operation;
          element.resource = oData.resource;
          element.sfc = oData.sfc;
          element.productionQty = oData.sfcQty;
        });

        if(total > Number(oData.canUseQty)){
          me.error('logUserSfcQty.error7');
        }

        $logUserSfcQty.save(oData.table,
          function () {
            MessageBox.success(i18n.getText('g.save.success'));
            me.search();
          },
          me.showMessage
        )
      }
    });
  }
);
