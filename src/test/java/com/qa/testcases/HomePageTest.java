package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPageRef;
	HomePage homePageRef;
	ContactsPage contactPageRef;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
	initialization();
	loginPageRef =  new LoginPage();
	homePageRef = loginPageRef.login(prop.getProperty("username"),prop.getProperty("password")); 
	
	 }
	
	
	@Test
	public void verifyClicksContactsTest() throws InterruptedException {
	contactPageRef	= homePageRef.clickonContactsLink();
	Thread.sleep(3000);		
		
	}
	
	
	@AfterMethod
	public void close() {
		driver.quit();
	}

}
