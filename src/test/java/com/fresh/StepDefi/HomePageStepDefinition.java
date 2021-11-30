package com.fresh.StepDefi;

import org.apache.log4j.Logger;

import com.fresh.PageAction.HomePageAction;
import com.fresh.util.LogsHelpper_Loggggg;
import com.fresh.util.TestBaseFresh;
import com.fresh.util.UtilityFresh;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageStepDefinition extends TestBaseFresh {
	
	HomePageAction homePageAction = new HomePageAction();
	
	
	
	Logger logs = LogsHelpper_Loggggg.getLogss(LogsHelpper_Loggggg.class);
	@Given("^Launch application \"([^\"]*)\"$")
	public void launch_application(String URL) throws Throwable {
	launch(URL); // overriding from test base  
	
	UtilityFresh.takescreenshot(driver, "Home Page");
	logs.info("Launch URL");
	}

	@Then("^product search by iphone$")
	public void product_search_by_iphone() throws Throwable {
	
	homePageAction.Searchbyiphone();
		
	UtilityFresh.takescreenshot(driver, "Search by iphone");
	logs.info("Searh");
	}

	@Then("^click on search button$")
	public void click_on_search_button() throws Throwable {
		
	homePageAction.clicksearch();
	
	UtilityFresh.takescreenshot(driver, "Search button");
	logs.info("Searh button");
	}

	@Then("^Verify user on search result display$")
	public void verify_user_on_search_result_display() throws Throwable {
		
	homePageAction.Verifyuserdisplay();
		
	UtilityFresh.takescreenshot(driver, "Result display");
	logs.info("Display search result");
	    	}


}
