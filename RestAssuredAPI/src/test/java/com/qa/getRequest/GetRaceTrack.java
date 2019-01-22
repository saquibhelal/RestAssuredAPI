package com.qa.getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetRaceTrack {
	
	@Test // for get call with response body
	public void getRacingTrackDetail(){
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=paris,france&appid="
				+ "b6907d289e10d714a6e88b30761fae22");
		
		/*String Content_Type=resp.header("Content-Type");
		System.out.println("Header is "+ Content_Type);
		String servertype=resp.header("Server");
		System.out.println("Server value is "+ servertype);
		String acceptLanguage=resp.header("Content-Encoding");
		System.out.println("Content-Encoding is "+ acceptLanguage);*/
		
		/*Headers allHeaders=resp.headers();
		// Iterate over all the headers
		for(Header header:allHeaders){
			System.out.println("Keys: " + header.getName() + "Value: " + header.getValue());
		}*/
		
		/*JsonPath jsonPathEvaluator = resp.jsonPath();
		String mrData=jsonPathEvaluator.get("MRData");
		System.out.println("MRData is recieved from response" + mrData);
		Assert.assertEquals(mrData, "MRData","Correct data is recieved from response");*/// Some Hashmap issue here check later
		
	
		System.out.println("Response Body is"+resp.getBody().asString());
	    String bodyAsString=resp.asString();
		//Assert.assertEquals(bodyAsString.contains("MRData"), true);// to validate some response of the body
		int status=resp.getStatusCode();
		Assert.assertEquals(status, 200);
		System.out.println("Status code is "+ status);
		String statusline=resp.getStatusLine();
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		System.out.println("Status line also pass " + statusline);
		/*String cookiName=resp.getCookie("Cokkies");// cookies name should be correct
		System.out.println(cookiName);*/
		
		System.out.println("---------------------------------------------------");
	}
	
}
