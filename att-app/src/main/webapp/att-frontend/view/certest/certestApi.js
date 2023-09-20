(function (global, factory) {
  global.$certest = factory();
})(this, function () {
  'use strict';

  let api = $setApi.getAjax();

    // 檢索
   let searchLists = function (data, success, fail) {
     api.post(`/certification/info`, data, 'json', success, fail);
   };

  // 匯入
  let uploadExcel = function (data, success, fail) {
    api.post(`/certification/import`, data, 'html', success, fail);
  };

  return {
    searchLists,
    uploadExcel
  };
});
