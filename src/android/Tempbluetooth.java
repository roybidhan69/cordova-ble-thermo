package com.airdit.cordova.thermo.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;
public class Tempbluetooth extends CordovaPlugin{
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext){
		if (action.equals("bidhan")) {
               String message = "Bidhan is a gay with";//s + args.getString(0);
               this.bidmetod(message, callbackContext);
               return true;
		}
		return false;
	}
	
	private void bidmetod(String message, CallbackContext callback){
		if (message != null && message.length() > 0) {
			   callback.success(message);
		} else {
               callback.error("Bidhan Not found!!!!");
		}
	}

}
