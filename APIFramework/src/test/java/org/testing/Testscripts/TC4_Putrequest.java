package org.testing.Testscripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.Variablereplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_Putrequest {

	@Test
	public void Put() throws IOException
	{

		Properties pr1 = LoadFile.Loadproperties("../APIFramework/URI.properties");
		String Jsonbody = LoadJsonFile.JsonData("../APIFramework/src/test/java/org/testing/resources/updatepayload.json");
		Random r = new Random();
		Integer t = r.nextInt();
		Jsonbody = Variablereplacement.replaceValue(Jsonbody, "newid",t.toString());

		HTTPMethods ht = new HTTPMethods(pr1);
		Response r1 = ht.Put(Jsonbody, "QA_URI" , TC1_PostRequest.residvalue);
		
		System.out.println("***********Testcase4***********");
		System.out.println("Status code is"+ r1.getStatusCode());
		System.out.println("Response data is");
		System.out.println(r1.asString());
		
	}
}
