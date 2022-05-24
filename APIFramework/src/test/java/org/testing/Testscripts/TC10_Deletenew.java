package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC10_Deletenew {

	@Test
	public void deletenew() throws IOException
	{
Properties pr1 = LoadFile.Loadproperties("../APIFramework/URI.properties");

		
		HTTPMethods ht = new HTTPMethods(pr1);
		Response r1 = ht.Deletenew("Del_uri", "2");
		System.out.println("***********Testcase10***********");
		System.out.println("Status code is"+ r1.getStatusCode());
		System.out.println("Response data is");
		System.out.println(r1.asString());
	}
}
