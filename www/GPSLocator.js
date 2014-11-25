function GPSLocator() {
}
GPSLocator.prototype = {
  getLocation: function (successCallback, errorCallback) {
    cordova.exec(successCallback, errorCallback, "GPSLocator", "location", []);
  }
};
GPSLocator.install = function () {
  if (!window.plugins) {
    window.plugins = {};
  }

  window.plugins.GPSLocator = new GPSLocator();
  return window.plugins.GPSLocator;
};
cordova.addConstructor(GPSLocator.install);