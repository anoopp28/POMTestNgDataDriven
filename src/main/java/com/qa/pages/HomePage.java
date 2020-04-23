package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//span[@class='user-display']")
	WebElement usernamelabel;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement ContactsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Calendar')]")
	WebElement CalenderLink;
	
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public ContactsPage clickonContactsLink() {
		ContactsLink.click();
		return new ContactsPage();
	}
	
	public CalenderPage clickonCalenderLink() {
		ContactsLink.click();
		return new CalenderPage();
	}
	
	
}
