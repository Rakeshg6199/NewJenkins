package com.step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass {
	
	Scenario sc;
	
	@Before
	private void beforeClass(Scenario scenario) {
		sc = scenario;
	}
	
	@After
	private void afterClass() {
		if (sc.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) StepDef.driver;
			byte[] screenshotAs = tk.getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshotAs, "image/png", sc.getName());
			
		}
	}
	

}
