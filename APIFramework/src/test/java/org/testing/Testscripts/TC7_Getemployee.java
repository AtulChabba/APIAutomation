package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC7_Getemployee {

	@Test
	public void getemployee() throws IOException
	{
		Properties pr1 = LoadFile.Loadproperties("../APIFramework/URI.properties");
		HTTPMethods ht = new HTTPMethods(pr1);
	Response rs = 	ht.getemployee("Getemployee");
		
		System.out.println("***********Testcase7***********");
		System.out.println("Status code is"+ rs.getStatusCode());
		System.out.println("Response data is");
		System.out.println(rs.asString());
		
		Responsevalidate.Data(rs, "..employee_name", "Sunny");
		
	}
}
