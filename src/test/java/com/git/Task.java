package com.git;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement drop = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		WebElement drag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		
		WebElement drag3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		a.dragAndDrop(drag1, drop1).perform();
		a.dragAndDrop(drag2, drop2).perform();
		a.dragAndDrop(drag3, drop3).perform();
			
		
	}


}
