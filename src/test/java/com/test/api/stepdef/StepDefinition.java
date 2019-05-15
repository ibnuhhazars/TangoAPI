package com.test.api.stepdef;

import com.test.api.eventConnector.ObjectEvent;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends ObjectEvent {

	@Before
	public void before() {
		
	}

	@When(".*?call POST.*? \"([^\"]*)\"$")
	public void callPOST(String arg1) throws Throwable {
		callPOSTEvent(arg1);
	}
	
	@When(".*?call GET.*? \"([^\"]*)\"$")
	public void callGET(String arg1) throws Throwable {
		callGETEvent(arg1);
	}
	
	@When(".*?auth.*? \"([^\"]*)\" and password \"([^\"]*)\"$") 
	public void setAuth(String arg1, String arg2) {
		setAuthEvent(arg1, arg2);
	}
	
	@When(".*?header.*? \"([^\"]*)\" is \"([^\"]*)\"$") 
	public void setHeader(String arg1, String arg2) {
		setHeaderEvent(arg1, arg2);
	}

	@When(".*?request body:$")
	public void put_body(String arg1) throws Throwable {
		put_bodyEvent(arg1);
	}

	@Then(".*?receive status code.*? (\\d+)$")
	public void receive_status_code(int arg1) throws Throwable {
		receive_status_codeEvent(arg1);	
	}
	
	@Then(".*?verify.*? \"([^\"]*)\" is \"([^\"]*)\"$")
	public void verifyBody(String arg1, String arg2) throws Throwable {
		verifyBodyEvent(arg1, arg2);
	}

	@Then("^the response should contain:$")
	public void the_response_should_contain(String arg1) throws Throwable {
		the_response_should_containEvent(arg1);
	}
	
	@After
	public void after() {
		
	}
}
