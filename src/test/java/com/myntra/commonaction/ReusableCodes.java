package com.myntra.commonaction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public abstract class ReusableCodes {

	public abstract void sendValue(WebElement e,String value);
	public abstract void touch(WebElement e);
	public abstract void sendValue(WebElement e,String value, int i);
	public abstract void touch(WebElement e,int i);
	public abstract void browserLaunch();
	public abstract void browserClose();
	public abstract void sendValue(int js,WebElement e,String value);
	public abstract void handleWindows();
	public abstract void timeOut(WebElement e,ExpectedConditions ex);
	public abstract void dropDown(WebElement e,String value);
	public abstract void dropDown(WebElement e,int i);
	public abstract void popupAccept();
	public abstract void popupClose();
	public abstract void sendValue(String value);
	public abstract void ss(File destination)throws IOException;
	
}
