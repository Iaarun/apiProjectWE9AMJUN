package apiTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteAPiTest {
 
	@Test
	public void _deleteApiUser() {
		RestAssured.baseURI = "https://reqres.in";
		
		Response response=	given()
			.when()
			.delete("/api/users/2")
			.then()
			.extract()
			.response();
		
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
			
		}
}
