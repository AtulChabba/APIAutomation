package org.testing.Testscripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.apache.http.protocol.HTTP;
import org.testing.responsevalidation.Responsevalidate;
import org.testing.teststeps.HTTPMethods;
import org.testing.utilities.LoadFile;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.Parsingjsonusingorgjson;
import org.testing.utilities.Variablereplacement;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class TC1_PostRequest {

	 static String residvalue;
	 @Test
	public void Testcase1() throws IOException {
		
		Properties pr1 = LoadFile.Loadproperties("../APIFramework/URI.properties");
		String Jsonbody = LoadJsonFile.JsonData("../APIFramework/src/test/java/org/testing/resources/requestpayload.json");
		Random r = new Random();
		Integer t = r.nextInt();
		Jsonbody = Variablereplacement.replaceValue(Jsonbody, "newid",t.toString());
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter firstname");
		String firsname = s.next();
		Jsonbody = Variablereplacement.replaceValue(Jsonbody, "name", firsname);

		HTTPMethods ht = new HTTPMethods(pr1);
		Response r1 = ht.Post(Jsonbody, "QA_URI");
		
		System.out.println("***********Testcase1***********");
		System.out.println("Status code is"+ r1.getStatusCode());
		System.out.println("Response data is");
		System.out.println(r1.asString());
		residvalue = Parsingjsonusingorgjson.parsejson(r1.asString(),"id");
		
		Responsevalidate.Statuscodevalidate(r1, 200);
		
		
	}
}
