package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.Newparsejsonusingorgjson;
import org.testing.utilities.Newvariablereplace;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_Createrecord {
	
//	static String newidvalue;
	@Test
	public void create() throws IOException
	{
		Properties pr1 = LoadFile.Loadproperties("../APIFramework/URI.properties");
		String Jsonbody = LoadJsonFile.JsonData("../APIFramework/src/test/java/org/testing/resources/Createrecord.json");
		
//		Random r = new Random();
//		Integer r1 = r.nextInt();
//		Jsonbody = Newvariablereplace.newreplace(Jsonbody, "oid", r1.toString());

		HTTPMethods ht = new HTTPMethods(pr1);
	Response res = 	ht.createrecord(Jsonbody, "Createrecord");
	
	System.out.println("***********Testcase6***********");
	System.out.println("Status code is" +res.getStatusCode());
	System.out.println("Response is");
	System.out.println(res.asString());
	
//	 newidvalue = Newparsejsonusingorgjson.parsenew(res.asString(),"id");
		
	}
}
