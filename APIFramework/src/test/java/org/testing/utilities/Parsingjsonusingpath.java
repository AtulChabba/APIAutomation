package org.testing.utilities;

import io.restassured.response.Response;

public class Parsingjsonusingpath {

	public static String jsonpath(Response res , String jsonpath)
	{
		return res.jsonPath().get(jsonpath);
		 
	}
}
