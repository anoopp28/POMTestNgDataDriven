package com.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.utilities.TimeOuts;



public class TestBase {
	
	//All Basic initializations which will be common for all the pages
	
	//WebDriver Properties
	public static WebDriver driver;
	public static Properties prop;
	
	//Constructor to initialize properties
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\52001551\\eclipse-workspace\\POMTestNgDataDriven\\src\\main\\java\\com\\qa\\configprop\\config.properties");
			
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
			
		}
	
	//Initialization common for all the pages
	public static void initialization() {
		
		String BrowserName = prop.getProperty("Browser");
		
		if(BrowserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		String url = prop.getProperty("URL");
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TimeOuts.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);   
		driver.manage().timeouts().implicitlyWait(TimeOuts.IMPLICIT_WAIT, TimeUnit.SECONDS); 
		
		
	
	}

}
