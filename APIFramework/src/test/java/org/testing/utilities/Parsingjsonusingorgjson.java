package org.testing.utilities;

import org.json.JSONObject;

public class Parsingjsonusingorgjson {
	
	public static String parsejson(String Responsedata, String Keyname)
	{
		JSONObject j = new JSONObject(Responsedata);
		return j.getString(Keyname);
		
	
}
}