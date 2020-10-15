package com.cepheid.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * 
 * @author Mounika
 * 
 * This class initate the cucumber testing framwork.
 * 
 */


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/unitlists.feature", // the path of the feature files
		glue = "com.cepheid.test",
//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
// the path of the step definition files
		monochrome = true, // display the console output in a proper readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = false // to check the mapping is proper between feature file and step def file
		// tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
		
		)

public class TestRunner {
	
}
