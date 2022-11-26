package apiTests;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutAPITests {

	@Test
	public void _testupdateUserput() {
		RestAssured.baseURI="https://reqres.in";
		
	Response response=	given()
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"QALeader\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		.when()
		.put("/api/users/2")
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
