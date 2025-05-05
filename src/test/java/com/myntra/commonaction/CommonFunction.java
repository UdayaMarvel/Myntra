package com.myntra.commonaction;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunction extends ReusableCodes{
	SingleTon s1 = SingleTon.getInstance();
	
	
	
	public static WebDriver driver;
	public static Actions a;
	public static JavascriptExecutor javascript;
	public static WebDriverWait wait;
	public static Select s;
	public static Alert alert;
	@Override
	public void browserLaunch() {
		ChromeOptions options = new ChromeOptions();
	    WebDriverManager.chromedriver().setup();
	    options.addArguments("--disable-notifications");
	    options.addArguments("start-maximized");
	driver = new ChromeDriver(options);
	}

	@Override
	public void sendValue(WebElement e, String value) {
		e.sendKeys(value);
	}

	@Override
	public void touch(WebElement e) {
		e.click();
		
	}

	@Override
	public void sendValue(WebElement e, String value, int i) {
		a.sendKeys(e, value).build().perform();
	}

	public void newMethod() {
		System.out.println("Test Method");
	}
	
	public void newMethod2() {
		System.out.println("Test Drive");
	}

	@Override
	public void touch(WebElement e, int i) {
		a.click(e).build().perform();
		
	}



	@Override
	public void browserClose() {
		driver.quit();
		
	}

	@Override
	public void sendValue(int js, WebElement e, String value) {
		javascript = (JavascriptExecutor)driver;
		javascript.executeScript("arguments[0].setAttribute('value',"+value+")", e);
	}

	@Override
	public void handleWindows() {
		String parentUrl = driver.getWindowHandle();
		Set<String> childUrl = driver.getWindowHandles();
		for (String x : childUrl) {
			if(!parentUrl.equals(x)) {
				driver.switchTo().window(x);
			}
		}
	}

	@Override
	public void timeOut(WebElement e, ExpectedConditions ex) {
		wait = new WebDriverWait(driver, 10);
		wait.until(ex.elementToBeClickable(e));
	}

	@Override
	public void dropDown(WebElement e, String value) {
		s = new Select(e);
		s.selectByValue(value);
	}

	@Override
	public void dropDown(WebElement e, int i) {
		s.selectByIndex(i);
		
	}

	@Override
	public void popupAccept() {
		alert = driver.switchTo().alert();
		alert.accept();
		
	}

	@Override
	public void ss(File destination) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, destination);
	}

	@Override
	public void popupClose() {
		alert.dismiss();
		
	}

	@Override
	public void sendValue(String value) {
		alert.sendKeys(value);
		
	}

}
