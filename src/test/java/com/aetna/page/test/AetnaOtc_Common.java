package com.aetna.page.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AetnaOtc_Common {
	WebDriver driver;
	    @BeforeTest
	    public void setup() { 
	    	
	    	System.setProperty("webdriver.chrome.driver","/Users/fatemakhaleda/eclipse-workspace/SeleniumProject/Driver/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();  
			driver.manage().window().fullscreen();  
			driver.manage().deleteAllCookies();  
			driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
			driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
			driver.get("https://www.cvs.com/otchs/myorder");
	    }
	    

@AfterTest
public void tearup() {
driver.close();
}
		
	}
//hi