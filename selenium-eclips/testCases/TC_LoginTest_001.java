package com.website_codeprism.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.website_codeprism.pageObjects.loginPage;



public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest()
	{
		driver.get(baseurl);
		loginPage lp=new loginPage();
		lp.setUserName(useremail);
		lp.setPassword(userpassword);
		lp.clickSubmit();
		if(driver.getTitle().equals("HeartinTune"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
