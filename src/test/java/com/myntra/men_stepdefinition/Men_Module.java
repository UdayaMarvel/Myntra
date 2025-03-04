package com.myntra.men_stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.http.HttpConnection;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;

import com.myntra.commonaction.CommonFunction;
import com.myntra.menlocators.MenLocators;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class Men_Module extends CommonFunction {
	MenLocators ml = new MenLocators();
	CommonFunction co = new CommonFunction();
	
	@Given("user search for mens clothing")
	public void user_search_for_mens_clothing() throws FileNotFoundException {
//	   WebElement search = co.driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
	   co.sendValue(ml.getSearch(), "men's clothing");
	   File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Myntra.Cucumber\\src\\test\\resources\\cred.property");
	   FileInputStream f1 = new FileInputStream(f);
	   Properties p = new Properties();
	   String username = p.getProperty("user");
	   String password = p.getProperty("password");
	   System.out.println(username+" "+password);
//	   search.sendKeys("men's clothing");
	}
	
	@Given("user search for mens clothing with one dim list")
	public void user_search_for_mens_clothing_with_one_dim_list(DataTable datatable) {
		List<String> clothing = datatable.asList();
//		WebElement search = co.driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		co.sendValue(ml.getSearch(), clothing.get(2));
//		   search.sendKeys(clothing.get(2));
	}
	
	@Given("user search for mens clothing with one dim map")
	public void user_search_for_mens_clothing_with_one_dim_map(DataTable dataTable) throws IOException {
		List<WebElement> links = co.driver.findElements(By.tagName("link"));
		int size = links.size();
		System.out.println(size);
		Iterator<WebElement> link = links.iterator();
		String attribute = null;
		while (link.hasNext()) {
			attribute = link.next().getAttribute("href");
			if(attribute==null||attribute.isEmpty()) {
				System.out.println("No links specified"+attribute);
			}
			else if(!attribute.startsWith("https://www.myntra.com")) {
				System.out.println("Link is not related to home website :"+attribute);
			}
			else {
				HttpURLConnection http = (HttpURLConnection) (new URL(attribute).openConnection());
				http.setRequestMethod("HEAD");
				http.connect();
				int statusCode = http.getResponseCode();
				if(statusCode==200) {
					System.out.println("Valid Link :"+attribute);
				}
				else {
					System.out.println("Broken Link :"+ attribute);
				}
			}
		}
//		WebElement search = co.driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		String first = asMap.get("first search");
		co.sendValue(ml.getSearch(), first);
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Myntra.Cucumber\\src\\test\\resources\\cred.property");
		   FileReader f1 = new FileReader(f);
		   Properties p = new Properties();
		   p.load(f1);
		   String username = p.getProperty("user");
		   String password = p.getProperty("password");
		   System.out.println(username+" "+password);
		   p.setProperty("user", "marvel");
		   FileWriter f2 = new FileWriter(f);
		   p.store(f2, "updated");
		   
		File dest = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Myntra.Cucumber\\src\\test\\resources\\ss.png");
		co.ss(dest);
		
//		search.sendKeys(first);
	}
	
	@Given("user search for mens clothing {string}")
	public void user_search_for_mens_clothing(String string) throws IOException {
//		WebElement search = co.driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		co.sendValue(ml.getSearch(), string);
		File dest = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Myntra.Cucumber\\src\\test\\resources\\ss1.png");
		co.ss(dest);
	}

	@Given("user launch the browser")
	public void user_launch_the_browser() {
		
//	    options.addArguments("--headless");
	 System.out.println("launched");
	    
	}

//	@And("user gets the myntra url")
//	public void user_gets_the_myntra_url() {
//	   co.driver.get("https://www.myntra.com");
//	}
	@Given("user gets the myntra url {string}")
	public void user_gets_the_myntra_url(String url) throws MalformedURLException, IOException {
		co.driver.get(url);
		
			
		
	}

	@When("user clicks on men")
	public void user_clicks_on_men() {
//	   co.driver.findElement(By.xpath("(//a[text()='Men'])[1]")).click();
		co.touch(ml.getMens());
	}

	@Then("validate the deals displayed")
	public void validate_the_deals_displayed() {
		
		
		
		String deals = ml.getDeals().getText();
//		 String deals = co.driver.findElement(By.xpath("//h4[text()='Biggest Deals On Top Brands']")).getText();
		  String expDeals ="Biggest Deals On Top Brands";
		  Assert.assertEquals(expDeals.toUpperCase(), deals);
//		  List<WebElement> brands = co.driver.findElements(By.xpath("//img[contains(@src,'https://assets.myntassets.com/w_245,c_limit,fl_progressive,dpr_2.0/assets/images/2020/8/31')]"));
		 ml.getBrands();
		  for (int i = 0; i < ml.getBrands().size(); i++) {
			  boolean brandsName = ml.getBrands().get(i).isDisplayed();
			  System.out.println(brandsName);
		}
		  boolean displayed = ml.getBrands().get(0).isDisplayed();
		  if(displayed==true) {
			  ml.getBrands().get(0).click();
		  }else {
			  System.out.println("webelement is not displayed");
		  }
//		Alert alert = co.driver.switchTo().alert();
//		alert.dismiss();
	}

	@Then("validate the categories diplayed")
	public void validate_the_categories_diplayed() {
//	    String categories = co.driver.findElement(By.xpath("//h4[text()='Categories To Bag']")).getText();
		String categories = ml.getCategories().getText();
		
	    System.out.println(categories);
	    
	}

	@Then("validate the Explore top brands diplayed")
	public void validate_the_Explore_top_brands_diplayed() {
//	    String explore = co.driver.findElement(By.xpath("//h4[text()='Explore Top Brands']")).getText();
		
		String explore = ml.getExplore().getText();
	    System.out.println(explore);
	}

	@Then("verify the myntra luxe displayed")
	public void verify_the_myntra_luxe_displayed() {
//		String luxe = co.driver.findElement(By.xpath("//h4[text()='Myntra Luxe']")).getText();
		String luxe = ml.getLuxe().getText();
		System.out.println(luxe);
	}
}
