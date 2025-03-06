package java.sample;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SampleClass {
public static void main(String[]args) throws InterruptedException,IOException {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		 String url ="https://www.facebook.com/";
		 driver.navigate().to(url);
		 driver.manage().window().maximize();
		 
		 JavascriptExecutor js =(JavascriptExecutor)driver;//Downcast
		 TakesScreenshot ts =(TakesScreenshot)driver;
		 
		 WebElement user = driver.findElement(By.id("email"));
		 WebElement pass = driver.findElement(By.id("pass"));
		 WebElement login = driver.findElement(By.linkText("Log in"));
		 WebElement down = driver.findElement(By.xpath("//a[text()='Careers']"));
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].scrollIntoView(true)",down);
	     Thread.sleep(3000);
	     js.executeScript("arguments[0].scrollIntoView(false)",user);
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].setAttribute('value','Selenium')",user);
		 Thread.sleep(3000);
		 js.executeScript("arguments[0].setAttribute('style','background:Red')",user);
		 Thread.sleep(3000);
		 js.executeScript("arguments[1].setAttribute('value','Java')",user,pass);
		 Thread.sleep(3000);
	     js.executeScript("arguments[1].setAttribute('style','border:3px solid blue')",user,pass);
	     
	     File src =ts.getScreenshotAs(OutputType.FILE);
	     File destination = new File("E:\\workspace\\Arun\\Excel\\target\\Facebook.png");
	     FileUtils.copyFile(src, destination);
	     System.out.println("ScreeShot Taken and Saved Successfully");
	     
	     String CssValue= user.getCssValue("background-color");
	     System.out.println(CssValue);
	     String CssValue1 = pass.getCssValue("border-color");
	     System.out.println(CssValue1);
		 
		 Object value = js.executeScript("return arguments[0].getAttribute('value')",user);
		 Object value1 = js.executeScript("return arguments[1].getAttribute('value')",user,pass);
	     System.out.println(value);
	     System.out.println(value1);
	     Thread.sleep(5000);
	     js.executeScript("arguments[2].click()",user,pass,login);
	     Thread.sleep(3000);
	     driver.navigate().back();
	     Thread.sleep(3000);
	     //driver.close();
	     driver.quit();
	     System.out.println("Conflicts");

}}
