package com.myntra.menlocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.myntra.commonaction.CommonFunction;

public class MenLocators extends CommonFunction {

	public MenLocators() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement search;
	
	@FindBy(xpath="(//a[text()='Men'])[1]")
	private WebElement mens;
	
	@FindBy(xpath="//h4[text()='Biggest Deals On Top Brands']")
	private WebElement deals;
	
	@FindBy(xpath="//h4[text()='Categories To Bag']")
	private WebElement categories;
	
	@FindBy(xpath="//h4[text()='Explore Top Brands']")
	private WebElement explore;
	
	@FindBy(xpath="//h4[text()='Myntra Luxe']")
	private WebElement luxe;
	
	@FindBy(xpath="//img[contains(@src,'https://assets.myntassets.com/w_245,c_limit,fl_progressive,dpr_2.0/assets/images/2020/8/31')]")
	private List<WebElement> brands;
	
	@FindBys({@FindBy(id="container"),@FindBy(className="12344")})
	private WebElement ele;

	@FindAll({@FindBy(id="container"),@FindBy(className="12344")})
	private WebElement ele1;
	
	public List<WebElement> getBrands() {
		return brands;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getMens() {
		return mens;
	}

	public WebElement getDeals() {
		return deals;
	}

	public WebElement getCategories() {
		return categories;
	}

	public WebElement getExplore() {
		return explore;
	}

	public WebElement getLuxe() {
		return luxe;
	}
	
}
