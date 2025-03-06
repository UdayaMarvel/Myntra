package com.git;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources",
					glue="com.myntra.men_stepdefinition",
					plugin={"html:target","json:target/reports.json"},
					
					dryRun=false,
					monochrome=true)
public class Test {
public static void main(String[] args) {
	System.out.println("Test");
	System.out.println("New Test");
	
}
}
