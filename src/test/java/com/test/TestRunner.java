package com.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.GenerateJVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile\\Adactin.feature",
				glue = "com.step", dryRun=false, plugin = {"pretty","json:src/test/resources/report/cucumber.json","html:src/test/resources/report/cucumber","junit:src/test/resources/report/cucumber.xml"})
public class TestRunner {

	@AfterClass
	public static void afterCLass() {
		GenerateJVMReport.report();
	}
}
