package com.qa.getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRaceTrack {
	
	@Test
	public void racingRegistration(){
		//RequestSpecification resp=(RequestSpecification) RestAssured.post("http://restapi.demoqa.com/customer");
		
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();
		JSONObject requestParam= new JSONObject();
		requestParam.put("FirstName", "Rehan");
		requestParam.put("LastName", "Abrahim");
		requestParam.put("UserName", "rehan007");
		requestParam.put("Password", "password1");
		requestParam.put("Email", "rehan@gmail.com");
		request.body(requestParam.toJSONString());
		
		Response response=request.post("/register");
		int code=response.getStatusCode();
		//Assert.assertEquals(code, 201);
		String sucessCde=response.jsonPath().get("SuccessCode");
		Assert.assertEquals(sucessCde, "OPERATION_SUCCESS");
	}
	
	

}
