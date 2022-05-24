package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC8_Alldataget {

	@Test
	public void ALLDATA() throws IOException {
		
	Properties pr1 = 	LoadFile.Loadproperties("../APIFramework/URI.properties");
	HTTPMethods ht = new HTTPMethods(pr1);
	Response rs = 	ht.getallemployees("Allemployees");
	
	System.out.println("*************Test case 8***********");
	System.out.println("Status code is" + rs.getStatusCode());
	System.out.println("Response is");
	System.out.println(rs.asString());
	}
}
