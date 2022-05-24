package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC9_Update {

	@Test
	public void putupdate() throws IOException
	{
	Properties pr1= 	LoadFile.Loadproperties("../APIFramework/URI.properties");
	String jsonbody = 	LoadJsonFile.JsonData("../APIFramework/src/test/java/org/testing/resources/Updatenew.json");
	
	HTTPMethods ht = new HTTPMethods(pr1);
	Response rs = ht.Putmethod("Put_uri",jsonbody);
	
	System.out.println("*************TC9*************");
	System.out.println("Status code is"+rs.getStatusCode());
	System.out.println("Response data is");
	System.out.println(rs.asString());
		
	}
}
