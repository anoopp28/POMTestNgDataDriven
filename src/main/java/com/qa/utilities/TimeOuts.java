package com.qa.utilities;

import com.qa.base.TestBase;

public class TimeOuts extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	
	public void switchToFrame() {
		driver.switchTo().frame(0);
	}

}
