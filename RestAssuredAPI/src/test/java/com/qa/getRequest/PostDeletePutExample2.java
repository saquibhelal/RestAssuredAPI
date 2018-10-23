package com.qa.getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostDeletePutExample2 {

	@Test
	public void test(){
		RequestSpecification request=RestAssured.given();		
		Response response=request.delete("http://localhost:3000/posts/6");
		int code=response.getStatusCode();
		Assert.assertEquals(code, 200);
		

		
	}
	
	
}
