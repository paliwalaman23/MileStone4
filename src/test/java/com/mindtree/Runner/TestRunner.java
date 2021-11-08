package com.mindtree.Runner;

import org.junit.runner.RunWith;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)		//We are commenting it because we want to run it as testng
@CucumberOptions(
		
		//features ={"LandingPage.feature","LoginPage.feature","SearchPage.feature","ProductSearch.feature","CartPage.feature"},
		features="Feature",
		glue = {"com.mindtree.StepDefinitions"},
		dryRun=false)
		//plugin = {"pretty","html:target/cucumber/report.html","json:target/cucumber/report.json"}, monochrome= true)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
