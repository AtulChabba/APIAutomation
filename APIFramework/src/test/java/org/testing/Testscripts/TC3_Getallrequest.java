package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responsevalidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_Getallrequest {
	
	@Test
	public void TC3() throws IOException
	{
	Properties pr1 = LoadFile.Loadproperties("../APIFramework/URI.properties");
	HTTPMethods ht = new HTTPMethods(pr1);
	Response r1 = ht.getallrequest("QA_URI");
	
	System.out.println("***********Testcase3 ***********");
	System.out.println("Status code is"+ r1.getStatusCode());
	System.out.println("Response data is");
	System.out.println(r1.asString());
	
	Responsevalidate.Data(r1,"[0].lastname","chabba");
	
}
}
