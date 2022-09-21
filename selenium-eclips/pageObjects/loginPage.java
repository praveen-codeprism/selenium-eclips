package com.website_codeprism.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver ldriver;
	public void LoginPage(WebDriver rdriver)
	
	{
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	@FindBy(name="email")
	@CacheLookup
	WebElement txtUserEmail;
	@FindBy(name="password")
	@CacheLookup
	WebElement txtUserPassword;
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	public void setUserName(String uemail) 
	{
		txtUserEmail.sendKeys(uemail);
	}
	public void setPassword(String pwd) 
	{
		txtUserPassword.sendKeys(pwd);
	}
	public void clickSubmit() 
	{
		btnLogin.click();
	}
	

}
