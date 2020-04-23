package com.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// we have to define Object repository - All webelements
	//Page Factory
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")    //same as driver.findElement(By.xpath());
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement Signuplink;
	
	
	//To initialize the webelements with the help of Pagefactory by using constructor
	
	//PageFactory is a class and initElements is a method in the classs to initialize all Object repository
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String usr, String pwd) {
		username.sendKeys(usr);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();    //because after clicking on loginbtn it will move to HomePage
	}
	
	
	

}
