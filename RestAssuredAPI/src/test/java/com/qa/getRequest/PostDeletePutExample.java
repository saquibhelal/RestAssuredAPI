package com.qa.getRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostDeletePutExample {

	//1:Post Method....
	@Test(enabled=false)
	public void test(){
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json=new JSONObject();
		json.put("id", "7");
		json.put("title", "QTP");
		json.put("author", "Testing");
		
		request.body(json.toString());
		Response response=request.post("http://localhost:3000/posts");
		int code=response.getStatusCode();
		System.out.println("Status code is..."+code);
		Assert.assertEquals(code, 201);
		
		json.put("id", "8");
		json.put("title", "UFT");
		json.put("author", "Testing");
		
		request.body(json.toString());
		Response response1=request.post("http://localhost:3000/posts");
		int code1=response.getStatusCode();
		System.out.println("Status code is..."+code);
		Assert.assertEquals(code, 201);
		

		
	}
	
	//2:Put Method....
	@Test
	public void test1(){
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		//Assert.assertEquals(content_Type, "application/json");
		JSONObject json=new JSONObject();
		json.put("id", "8");
		json.put("title", "QTP");
		json.put("author", "Test");
		
		request.body(json.toString());
		Response response=request.put("http://localhost:3000/posts/8");
		String content_type=response.header("Content-Type");
		System.out.println(content_type);
		Assert.assertEquals(content_type, "application/json");
		int code=response.getStatusCode();
		System.out.println("Status code is..."+code);
		
		Assert.assertEquals(code, 200);
	}
	
}
