package com.qa.getRequest;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostDeletePutExample {

	//1:Post Method....
	@Test(enabled=true)
	public void test(){
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json=new JSONObject();
		
		json.put("note", "Final Term Exam");
		json.put("descr", "Final Term Exam will be start from 12 Dec 2018-24 Dec 2018 ");
		json.put("password", "!Q2w3e4r");
		json.put("sender", "Super   Admin()");
		json.put("dateString", "18/12/2018 12:59:35");
		json.put("academicsSession", "2018-2019");
		json.put("username", "adminwebservice@qtsin.net");
		json.put("logTime", "1541095535");
		json.put("rollwise", "99999");
		request.body(json.toString());
		
		Response response=request.post("http://apps.sainikschoolpurulia.com/api/webiq/v1/sendSchoolNote");
		int code=response.getStatusCode();
		System.out.println("Status code is..."+code);
		Assert.assertEquals(code, 201);
		
		/*json.put("id", "8");
		json.put("title", "UFT");
		json.put("author", "Testing");*/
		
		/*request.body(json.toString());
		Response response1=request.post("http://localhost:3000/posts");
		int code1=response.getStatusCode();
		System.out.println("Status code is..."+code);
		Assert.assertEquals(code, 201);*/
		

		
	}
	
	
	
	//2:Put Method....
	/*@Test
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
	*/
}
