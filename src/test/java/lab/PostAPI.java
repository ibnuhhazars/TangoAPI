package lab;

import java.io.UnsupportedEncodingException;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostAPI {

	@Test
	public void testPost() throws UnsupportedEncodingException {
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type", "application/json");
		
		request.body("{\"id\":5,\"title\":\"Mr\",\"firstName\":\"Ibnuh\",\"lastName\":\"Hazard\",\"phoneNumber\":\"08990677550\"}");
		
		Response response = request.get("http://10.1.77.73:7819/RTCP/examples/phonebook/api/");
		
		System.out.println(response.getBody().prettyPrint());
		
		int code = response.getStatusCode();
		
		Assert.assertEquals(code, 200);

	}

}
