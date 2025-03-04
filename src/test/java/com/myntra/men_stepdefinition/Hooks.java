package com.myntra.men_stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.myntra.commonaction.CommonFunction;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonFunction{
	CommonFunction co = new CommonFunction();
	@Before
	public void start(Scenario scenario) {
		co.browserLaunch();
		 final byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 scenario.embed(screenshotAs, "image/png");
	}
	@After
	public void stop(Scenario scenario) {
		final byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 scenario.embed(screenshotAs, "image/png");
		co.browserClose();
	}
}
