package pro.moussawi7.plugins;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Context;

public class GPSLocator extends CordovaPlugin {
 
@Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {	
    try {
    	Context context=this.cordova.getActivity().getApplicationContext();
    	   GPSTracker mGPS = new GPSTracker(context);
    	    if(mGPS.canGetLocation ){
    	    mGPS.getLocation();
    	    double latitude = mGPS.getLatitude();
    	    double longitude = mGPS.getLongitude();
    	    mGPS.stopUsingGPS();
            JSONObject obj = new JSONObject();
            JSONArray result = new JSONArray();
            result.put(latitude);
            result.put(longitude);
            obj.put("locations", result);
            callbackContext.success(result);
    	    } else{
    	        callbackContext.error("UNABLE_GET_LOCATION");
    	    }
       return true;
    } catch (Exception e) {
      callbackContext.error(e.getMessage());
      return false;
    }
  }

}