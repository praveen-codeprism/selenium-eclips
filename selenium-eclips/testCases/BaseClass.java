package com.website_codeprism.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseurl="https://heartintune-admin-dev.web.app/#/login";
	public String useremail="admin-heartintune@gmail.com";
	public String userpassword="admin@123";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver");
		driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}

