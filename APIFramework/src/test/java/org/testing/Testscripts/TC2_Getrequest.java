package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_Getrequest {

	@Test
	public void Testcase2() throws IOException {
		
		Properties pr1 = LoadFile.Loadproperties("../APIFramework/URI.properties");

		HTTPMethods ht = new HTTPMethods(pr1);
		
		Response r1 = ht.getrequest("QA_URI", TC1_PostRequest.residvalue);
		
		System.out.println("***********Testcase2***********");
		System.out.println("Status code is"+ r1.getStatusCode());
		System.out.println("Response data is");
		System.out.println(r1.asString());
		
	}
}
