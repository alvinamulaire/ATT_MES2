(function (global, factory) {
  global.$logUserSfcQty = factory();
})(this, function () {
  'use strict';

  let api = $setApi.getAjax();


  // 檢索
  let search = function (data, success, fail) {
    api.get(`/logSfc/search?site=${data.site}&operation=${data.operation}&resource=${data.resource}&sfc=${data.sfc}&user=${data.user}`, 'json', success, fail);
  };


  // 暫存
  let save = function (data, success, fail) {
    api.post(`/logSfc/save`, data, 'html', success, fail);
  };

  return {
    search,
    save
  };
});
