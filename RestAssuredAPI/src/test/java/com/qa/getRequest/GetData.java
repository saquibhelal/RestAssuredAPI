package com.qa.getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetData {

	/*@Test
	public void weatherMessageBody(){
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest=RestAssured.given();
		Response response=httpRequest.get("/Pune");
		
		ResponseBody body= response.getBody();
		
	    body.asString();
		
		System.out.println("ResponseBody:"+body.asString());
		String bodyAsString=body.asString();
		System.out.println(bodyAsString);
		System.out.println("-----------------------------");
		Assert.assertEquals(bodyAsString.contains("Pune"), true);
		
		JsonPath jsonPath=response.jsonPath();
		
		String city=jsonPath.get("City");
		System.out.println("City recieved from response:"+city);
		Assert.assertEquals(city, "Pune","City name is correct");
		
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test()
	public void testResponseCode(){
			
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=paris,france&appid="
				+ "b6907d289e10d714a6e88b30761fae22");
		String data=resp.getBody().asString();
		System.out.println("Data is----"+data);
		Assert.assertEqual(data.contains("paris"),true);
		int status_code=resp.getStatusCode();
		System.out.println("Status code is"+status_code);
		Assert.assertEquals(status_code, 200);
		
	}
	*/
	@Test()
	public void testBody(){
		
		Response resp=RestAssured.get(/*"http://restapi.demoqa.com/utilities/weather/city/Kolkata"*/
				/*"http://apps.sainikschoolpurulia.com/webiq/student/notes/ay20182019"*/
		/*		"https://jsonplaceholder.typicode.com/todos/1"*//*"https://gorest.co.in/public-api/users?_format=json"*/
				"https://restcountries.in/rest/v2/all");
		JSONObject response= new JSONObject();
		response.get(resp);
		String data=resp.asString();
		System.out.println("Data is "+data);
		//Assert.assertEquals(data.contains("Kolkata"),true);	
		System.out.println("Assertion is passed:"+data);
		System.out.println("Response time is"+resp.getTime());
		
		/*JsonPath jsonP=resp.jsonPath();
		String temp=jsonP.get("Temperature");
		System.out.println("Temp is rec:"+temp);
		Assert.assertEquals(temp, "33 Degree celsius");*/
		
	}
	
}
