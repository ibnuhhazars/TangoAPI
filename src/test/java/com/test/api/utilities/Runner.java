package com.test.api.utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "html:target//cucumber-pretty","json:target//cucumber.json" }, 
		features = { "Feature" }, 
		glue = { "com.test.api.stepdef", "com.test.api.utilities" })
public class Runner {

}
