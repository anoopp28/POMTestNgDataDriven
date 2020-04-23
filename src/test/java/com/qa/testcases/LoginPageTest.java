package com.qa.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class LoginPageTest extends TestBase{
	
	LoginPage loginPageRef;
	HomePage homePageRef;
	
	public LoginPageTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
	initialization();
	loginPageRef =  new LoginPage();   //Created object of LoginPage class in BeforeMethod because to access all the LoginPage methods in this test class which are non static in their class
	 }
	
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		String title = loginPageRef.validateLoginPageTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	
	@Test
	public void loginTest() {
	
	homePageRef = loginPageRef.login(prop.getProperty("username"),prop.getProperty("password"));   //It returns the object of HomePage so it is stored in its reference
		
	}
	
	@AfterMethod
	public void close() {
		
		driver.quit();
	}

}
