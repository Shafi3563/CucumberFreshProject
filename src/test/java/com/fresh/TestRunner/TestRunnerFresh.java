package com.fresh.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.fresh.util.TestBaseFresh;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
"json:target/cucumber.json" }, glue = "com.fresh.StepDefi", tags = {
		"@Sanity" })

public class TestRunnerFresh extends AbstractTestNGCucumberTests {
	// Hook - before test it will open URL
	@BeforeTest

	public void LaunchApplicationURL() {
		TestBaseFresh lunchh = new TestBaseFresh();
		lunchh.initilize();

	}
	// // Hook - after test it will open URL
	@AfterTest
	public void CloseApplicationURL() {
		TestBaseFresh lunchh = new TestBaseFresh();
		lunchh.driver.quit();

}
	
}
