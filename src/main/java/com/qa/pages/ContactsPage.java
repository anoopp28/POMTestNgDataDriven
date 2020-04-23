package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class ContactsPage extends TestBase {
	
	//@FindBy(xpath = "//td[contains(text(),'Nithya S')]//parent::td//preceding-sibling::td//input[@name='id']")
		//above is not good one bcoz there is Hard Code value nithya so create constructor
	    // if i need to select 10 contacts then we cant write 10 xpaths with @FindBy 
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	

	public void selectContactsByName(String name)  {
		driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]")).click();
		}
	
}