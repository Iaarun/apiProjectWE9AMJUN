package apiTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import apidata.POSTRequestPayload;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequestAPI {
	 POSTRequestPayload postpayload = new POSTRequestPayload();

	
	@Test
	public void _testCreateUser() {
		RestAssured.baseURI="https://reqres.in";
		
	Response response=	given()
		.body(postpayload.createUserparameterPayload("morpheus", "leader"))
		.contentType(ContentType.JSON)
		.when()
		.post("/api/users")
		.then()
		.log()
		.all()
		.extract()
		.response();
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	System.out.println(response.getHeader("Content-Type"));
	
	System.out.println(response.asPrettyString());
	}

}
