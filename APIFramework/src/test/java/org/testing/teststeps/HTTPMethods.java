package org.testing.teststeps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;


public class HTTPMethods {
	Properties pr1;
	
	public HTTPMethods(Properties pr1) {
		this.pr1=pr1;
	}
	public Response Post(String jsonbodydata , String urikey)
	{
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(jsonbodydata)
		.when()
		.post(pr1.getProperty(urikey));
		return res;
	}
	
	public Response getrequest(String urikey, String idvalue)
	{
		//uri ----- Base
		//Endpoint --- idvalue
		
		String base = pr1.getProperty(urikey);
		String uri = base + "/"+idvalue;
		Response rs = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		return rs;
		
	}
	public Response getallrequest(String urikey)
	{
		//uri ----- Base
		//Endpoint --- idvalue
		
		Response rs = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr1.getProperty("QA_URI"));
		
		return rs;
		
	}
	public Response Put(String jsonbodydata , String urikey , String pathparameter)
	{
		String uri = pr1.getProperty(urikey) + "/" + pathparameter;
		Response res = 
		given()
		.contentType(ContentType.JSON)
		.body(jsonbodydata)
		.when()
		.put(uri);
	
		return res;
	}

	public Response delete(String urikey, String idvalue)
	{
		//uri ----- Base
		//Endpoint --- idvalue
		
		String base = pr1.getProperty(urikey);
		String uri = base + "/"+idvalue;
		Response rs = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(uri);
		
		return rs;
		
	}
	
	public Response createrecord(String jsonbodydata , String urikey)
	{
		Response rs = 
		given()
		.contentType(ContentType.JSON)
		.body(jsonbodydata)
		.when()
		.post(pr1.getProperty(urikey));
		
		return rs;
		
	}
	
	public Response getemployee (String urikey)
	{

		Response rs = 
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr1.getProperty(urikey));
		
		return rs;
		
	}
	
	public Response getallemployees(String urikey)
	{
		 Response rs = 
				 given()
				 .contentType(ContentType.JSON)
				 .when()
				 .get(pr1.getProperty(urikey));
		 
		 return rs;
		
	}
	
	public Response Putmethod(String urikey , String body)
	{
//		String base = pr1.getProperty("urikey");
//		String url = base +"/" + Parameter;
		Response rs = 
				given()
				.contentType(ContentType.JSON)
				.body(body)
				.when()
				.put(pr1.getProperty(urikey));
		
		return rs;
	}
	public Response Deletenew(String urikey, String idvalue)
	{
		String base = pr1.getProperty(urikey);
		String url = base + "/" + idvalue ; 
		Response rs = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(url);
				
				return rs;
		
	}

}
