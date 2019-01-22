package com.qa.getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthAndAuthorization {
	
	@Test
	public void credentialValidation(){
		Response resp=RestAssured.get("http://restapi.demoqa.com/authentication/CheckForAuthentication.json");
		System.out.println("Status code is "+ resp.getStatusCode());
		System.out.println("Status message is "+ resp.body().asString());
		
	}
	

}
