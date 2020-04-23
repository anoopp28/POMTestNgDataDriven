package com.qa.testcases;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class ContactsPageTest  extends TestBase {
	LoginPage loginPageRef;
	HomePage homePageRef;
	ContactsPage contactsPageref;
	
	public ContactsPageTest() {
		super();
	}
	

	@BeforeMethod
	public void setup() {
	initialization();
	loginPageRef =  new LoginPage();
	contactsPageref = new ContactsPage();
	homePageRef = loginPageRef.login(prop.getProperty("username"),prop.getProperty("password")); 
	contactsPageref = homePageRef.clickonContactsLink();
	 }
	
	@Test
	public void verifyClickContactsByNameTest() throws InterruptedException {
		
		contactsPageref.selectContactsByName("Nithya S");
		Thread.sleep(3000);
	}
	
	
	@Test
	public void verifyClickMultipleContactsByNameTest() throws InterruptedException {

		contactsPageref.selectContactsByName("Nithya S");
		contactsPageref.selectContactsByName("Anoop Kumar");
		Thread.sleep(2000);
		
	}	

	@AfterMethod
	public void close() {
		driver.quit();
	}
}
