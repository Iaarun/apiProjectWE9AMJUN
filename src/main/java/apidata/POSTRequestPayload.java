package apidata;

import java.util.HashMap;
import java.util.Map;

public class POSTRequestPayload {
	public String createUserPayload() {
		return "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
	}
	
	public String createUserparameterPayload(String name, String job) {
		return "{\r\n"
				+ "    \"name\": \""+name+"\",\r\n"
				+ "    \"job\": \""+job+"\"\r\n"
				+ "}";
	}
	
	
	
}
