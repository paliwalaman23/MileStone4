package com.mindtree.StepDefinitions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.ReusableComponent.WebdriverHelper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LandingPageSD {
	static WebDriver driver;
   

    
    @Given("User Launching the Chrome Browser")
    public void user_launching_the_chrome_browser() throws IOException {

    	WebdriverHelper.LaunchingBrowser();
		driver = WebdriverHelper.getDriver();
		System.out.print("Browser has been opened");
    }
    @Then("Hitting the URL {string}")
    public void hitting_the_url(String url) {
    	driver.get(url);
    }
    
    public static WebDriver getDriver() {
		return driver;
	}

}