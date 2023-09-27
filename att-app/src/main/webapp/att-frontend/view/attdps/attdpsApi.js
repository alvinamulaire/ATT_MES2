(function (global, factory) {
  global.$attdps = factory();
})(this, function () {
  'use strict';

  let api = $setApi.getAjax();

  // 物料開窗
  let getItem = function (data, success, fail) {
    api.get(`/attdps/item/get?site=${data.site}&item=${data.item}`, 'json', success, fail);
  };

    // 檢索
   let searchLists = function (data, success, fail) {
     api.post(`/attdps/info`, data, 'json', success, fail);
   };

  // 匯入
  let uploadExcel = function (data, success, fail) {
    api.post(`/attdps/import`, data, 'html', success, fail);
  };

  return {
    getItem,
    searchLists,
    uploadExcel
  };
});
