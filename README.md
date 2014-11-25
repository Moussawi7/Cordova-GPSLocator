# GPSLocator

> GPS Locator plugin for Android. This allows you to Obtain geolocation using **locationManager**.

## Installation:

    npm install -g cordova # if you don't have cordova
    cordova create MyProjectFolder com.my.project MyProject && cd MyProjectFolder # if you are just starting
    cordova plugin add https://github.com/Moussawi7/Cordova-GPSLocator

## Benefits:
As you know there a plugin created by apache, but it's slow to detect the geolocation and sometimes you need to restart the device in order to work.
GPSLocator user GPS/Network provider to get the device geolocation where you will get the geolocation faster and without the need to restart the device.
	
## Usage
The plugin creates the object window.plugins.GPSLocator

After onDeviceReady, create a local var and startup the plugin like so;

	function onDeviceReady() {
   	    window.plugins.GPSLocator.getLocation(function(result){
		alert(JSON.stringify(result));//result[0]:latitude,result[1]:longitude.
		},function(e){
			alert(JSON.stringify(e));//Error Message
		});
	}

## License ##

The MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.