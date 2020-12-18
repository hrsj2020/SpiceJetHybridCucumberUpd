package com.testRunners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;
import org.testng.annotations.Test;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests; Testng Run
//import io.cucumber.junit.CucumberOptions; Junit Run
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//public class SpicejetTestRunners {
//	public class TestRunners {
		//@RunWith(Cucumber.class)
		// Run should be used in JUnit only
		// features and glue is important

  	@CucumberOptions(features = "src/test/resources/Features/spicejetFlights.feature", plugin = { "pretty",
				"html:Reports/cucumber-html-report", "json:Reports/cucumber-html-report/jsonreport.json",
				"rerun:target/cucumber-reports/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				// "testng:target/testng-cucumber-reports/cuketestng.xml",
		}, glue = { "com.stepDefinitions" }
		
		// monochrome = true,
		
		// strict= true

		)
		public class SpicejetTestRunners extends AbstractTestNGCucumberTests {
			// create the report-extent-config.xml
			//@AfterClass
			public void Extentsreport() {
				Reporter.loadXMLConfig("./src/test/resources/Screenshots/Extent-config.xml");
				Reporter.setSystemInfo("user", System.getProperty("user.name"));
				Reporter.setSystemInfo("os", "Windows");
				Reporter.setTestRunnerOutput("Project Natural Report");
			}
		}
	