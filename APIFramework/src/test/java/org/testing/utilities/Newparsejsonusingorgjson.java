package org.testing.utilities;

import org.json.JSONObject;

public class Newparsejsonusingorgjson {

	public static String parsenew (String Response , String keyname)
	{
		JSONObject j = new JSONObject(Response);
		return j.getString(keyname);
	}
}
