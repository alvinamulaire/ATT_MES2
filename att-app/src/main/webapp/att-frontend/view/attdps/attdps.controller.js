sap.ui.define(
  [
    "fw/core/BaseController",
    "fw/fragment/TableSelectDialog",
    "sap/ui/unified/MenuItem",
    "att/view/attdps/attdpsApi",
  ],
  function (BaseController, TableSelectDialog, MenuItem) {
    "use strict";

    /**
     * BaseController不在個別的專案各自維護，統一維護在FW
     */
    return BaseController.extend("att.view.attdps.attdps", {
      onInit: function () {
        this.attachPatternMatched("attdps", this.onRouteMatched);
      },
      onRouteMatched: function () {
        this.setModel({
          site: this.getSite(),
          item:"",
          itemBo: "",
          operationBo:"",
          dpsObject:"",
          mpsObject:"",
          productDay:"",
          startDate: moment().subtract(6, 'days').format('YYYY/MM/DD'),
          filter: ""
        });

        // 檢查螢幕寬度, 調整欄位尺寸
        let oTable = this.byId("table")
        let cols = oTable.getColumns()
        let screenWidth = window.innerWidth
        if (screenWidth > "1200") {
          cols[0].setWidth("8%")
          cols[1].setWidth("8%")
        }
      },
            // 開窗
      openDialog: function (oEvent) {
         let me = this;
         let oSource = oEvent.getSource();
         let id = oSource.sId.split("__xmlview1--")[1];
         let oData = this.getData();
         let i18n = this.getI18N()

         switch (id) {
                // 物料
                case "item":
                  $attdps.getItem(
                    oData,
                    function (data) {
                      new TableSelectDialog().open(oSource, data, function (data) {
                        oData.item = data.item
                      });
                    },
                    me.showMessage
                  )
                  break;
              }
            },
         // 檢索
            search: function () {
              let me = this;
              let oData = this.getData();
              let i18n = this.getI18N()
              let oTable = this.byId("table")
            if (!oData.item) {
                    this.error(i18n.getText("att.dps.warning1"))
                 } else{
             $attdps.searchLists({
                  site: oData.site,
                  item: oData.item,
                  productDay: oData.productDay
                },
                  function (data) {

                    oData.tableInfo = data

                    me.refresh()

                    if (!oTable.getEnableGrouping()) {
                      oTable.setEnableGrouping(true)
                    }
                  },
                  me.showMessage
                )
               }
            },
      // 匯入 excel
      uploadExcel: function (oEvent) {
        let me = this
        let i18n = this.getI18N()
        let oData = this.getData()
        let file = oEvent.getParameter("files") && oEvent.getParameter("files")[0];
        oData.excelData = []

        if (file && window.FileReader) {
          // 檔案閱讀器讀取 excel 檔案
          let reader = new FileReader();

          reader.onload = function (event) {
            // 檔案內容
            let data = event.target.result;
            // fw-api 已經引用, new Excel JS
            let workbook = new ExcelJS.Workbook()

            // Load Excel
            workbook.xlsx
              .load(data)
              .then(function () {
                // 取得 sheet
                let worksheet = workbook.getWorksheet('CONFIGDPS');
                if (!worksheet) {
                  me.error('att.yieldMaintain.warning4');
                }


                 worksheet.eachRow({
                   includeEmpty: true
                   },
                     function (row, rowNumber) {
                        if (rowNumber > 2) {
                              // 判斷值是否為數字
                              let pDay = worksheet.getRow(1)
                              for(let i=3 ;i<=60;i=i+2){
                                let n=0
                                if(!pDay.values[i]){
                                    break;
                                }else
                                  {

                                    oData.excelData.push(
                                            {
                                               itemBo: row.values[1],
                                               operationBo: row.values[2],
                                               dpsObject: row.values[3+n],
                                               mpsObject: row.values[4+n],
                                               productDay: pDay.values[i]
                                            }
                                      )
                                  }
                                  n =n+2
                                     }
                                    }
                                  }
                                )


                // 取得每一列資料
//                worksheet.eachRow({
//                  includeEmpty: true
//                },
//                  function (row, rowNumber) {
//                    if (rowNumber > 1) {
//                      // 判斷值是否為數字
//                        oData.excelData.push(
//                          {
//                            itemBo: row.values[1],
//                            operationBo: row.values[2],
//                            dpsObject: row.values[3],
//                            mpsObject: row.values[4],
//                            productDay: row.values[5]
//
//                          }
//                        )
//                    }
//                  }
//                )

                // 上傳系統
                $attdps.uploadExcel({
                  site: oData.site,
                  detailInfoList: oData.excelData
                },
                  function () {
                    //me.search()
                    me.messageBox({
                      key: "att.cerupload.success1",
                      type: "SUCCESS"
                    })
                  },
                  me.showMessage
                )
              })
          };
          // read & execute onload
          reader.readAsArrayBuffer(file);
        }
      },
      // 匯出 excel
      exportExcel: function () {
        let me = this
        let oData = this.getData()
        let i18n = this.getI18N()

        // 文字垂直置中
        let alignment = {
          vertical: 'middle',
          horizontal: 'center',
          wrapText: true
        };
        // 一般外框
        let thin_border = {
          top: { style: 'thin' },
          left: { style: 'thin' },
          bottom: { style: 'thin' },
          right: { style: 'thin' }
        }
        // 粗外框
        let thick_border = {
          top: { style: 'medium' },
          left: { style: 'medium' },
          bottom: { style: 'medium' },
          right: { style: 'medium' }
        }
        // 填充背景顏色
        let fill = {
          // 橘色
          orange: {
            fgColor: { argb: 'FF9D6F' },
            bgColor: { argb: '000000' },
            type: 'pattern',
            pattern: 'solid',
          },
          // 淺橘
          lightOrange: {
            fgColor: { argb: 'FFDAC8' },
            bgColor: { argb: '000000' },
            type: 'pattern',
            pattern: 'solid',
          },
          // 淺灰
          grey: {
            fgColor: { argb: 'BEBEBE' },
            bgColor: { argb: '000000' },
            type: 'pattern',
            pattern: 'solid',
          },
        }
        // 字體: 新細明體
        const MingLiu = i18n.getText('att.yieldMaintain.excelFont');
        // 建立 excel 物件
        let wb = new ExcelJS.Workbook();
        // 新增工作表
        let ws = wb.addWorksheet(i18n.getText('CONFIGDPS'), {
          // 不顯示網格
          views: [{ showGridLines: false }],
          // 預設寬度
          properties: { defaultColWidth: 23 }
        });
        // 合併儲存格標題
         ws.mergeCells('A1:B1');
        ws.mergeCells('C1:D1');

        // 取得標題路徑
        let dayname = ws.getCell('A1');
        let daydata = ws.getCell('C1')
        let titleitem = ws.getCell('A2');
        let titleoperation = ws.getCell('B2');
        let titledpsobject = ws.getCell('C2');
        let titlempsobject = ws.getCell('D2');

        // 設定標題文字
        dayname.value= i18n.getText('att.dps.label9');
        daydata.value= oData.tableInfo[0].productDay;
        titleitem.value = i18n.getText('att.dps.label2');
        titleoperation.value = i18n.getText('att.dps.label3');
        titledpsobject.value = i18n.getText('att.dps.label4');
        titlempsobject.value = i18n.getText('att.dps.label5');

        //第一列樣式
        dayname.border = thin_border;
        dayname.alignment = alignment;
        daydata.border = thin_border;
        daydata.alignment = alignment;

        // 設定標題欄位樣式
        let colArray = [titleitem,titleoperation,titledpsobject,titlempsobject]
        colArray.forEach(item => {
          item.fill = fill.lightOrange
          item.border = thin_border
          item.alignment = alignment;
        })

        // 新增 row 資料
        oData.tableInfo.forEach(item => {
          ws.addRow([item.item, item.operation,item.dpsobject,item.mpsobject])
        })

        // 每 row 樣式設定
        ws.eachRow(function (row, rowNumber) {
          if (rowNumber > 1) {
            row.alignment = alignment;
            row.font = {
              name: MingLiu,
              size: 12,
              bold: false
            };
            row.eachCell({
              includeEmpty: true
            },
              function (cell, colNumber) {
                cell.border = thin_border
              });
          }
        });

        // 匯出 excel
        doExport(oData.item + "_CONFIGDPS");

        async function doExport(name) {
          const buffer = await wb.xlsx.writeBuffer();
          const fileType = 'application/vnd.openxmlformats-officedocument.spreadsheetml.sheet';
          const blob = new Blob([buffer], { type: fileType });
          saveAs(blob, name + '.xlsx');
        }
      },
    });
  }
);
