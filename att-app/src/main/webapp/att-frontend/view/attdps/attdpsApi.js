(function (global, factory) {
  global.$attdps = factory();
})(this, function () {
  'use strict';

  let api = $setApi.getAjax();

    // 檢索
   let searchLists = function (data, success, fail) {
     api.post(`/attdps/info`, data, 'json', success, fail);
   };

  // 匯入
  let uploadExcel = function (data, success, fail) {
    api.post(`/attdps/import`, data, 'html', success, fail);
  };

  return {
    searchLists,
    uploadExcel
  };
});
