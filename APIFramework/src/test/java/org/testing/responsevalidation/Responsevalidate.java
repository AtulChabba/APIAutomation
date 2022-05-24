package org.testing.responsevalidation;

import org.testing.utilities.Parsingjsonusingpath;

import io.restassured.response.Response;

public class Responsevalidate {


	public static void Data(Response res,String jsonpath,String expected)
	{
		
		String actualdata = Parsingjsonusingpath.jsonpath(res, jsonpath);
		
		if(expected.equals(actualdata))
		{
			System.out.println("Data is matching");
		}
		else
		{
			System.out.println("Data is not matching");
		}
	}
	public static void Statuscodevalidate(Response res,int expectedstatuscode)
	{
		
		int actualstatuscode = res.statusCode();
		
		if(expectedstatuscode==actualstatuscode)
		{
			System.out.println("Status code is matching");
		}
		else {
			System.out.println("Status code is not matching");
		}
	}
}