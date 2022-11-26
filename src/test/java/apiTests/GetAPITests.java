package apiTests;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetAPITests {
	
	@Test
	public void _testListUsersAPI() {
		
		RestAssured.baseURI = "https://reqres.in";
		
	Response response=	given()
		.when()
		.get("/api/users?page=2")
		.then()
		.extract()
		.response();
	
	System.out.println(response.getStatusCode());
	System.out.println(response.getStatusLine());
	
	System.out.println(response.getHeader("Transfer-Encoding"));
	
	Headers headers= response.getHeaders();
	
	for(Header h : headers) {
		System.out.println(h.getName()+" | "+h.getValue());
	}
	
	System.out.println("===============");
	
	System.out.println(response.getTime());
	
	System.out.println(response.asPrettyString());
		
	}

}
