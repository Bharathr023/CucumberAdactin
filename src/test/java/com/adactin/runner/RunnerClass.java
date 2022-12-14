package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\karthi\\eclipse-workspace\\Adactin_Practice_Example\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue= "com.adactin.stepdefinition",
monochrome= true,
dryRun=false,
strict= true,
plugin = {"html:BharathReport/CumberReport",
		"pretty",
		"json:BharathReport/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:BharathReport/ExtentReport.html"}
)
public class RunnerClass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void browserSetUp(){ 
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
         
	}
	@AfterClass
	public static void tearDown(){
     driver.close();
	}

}
