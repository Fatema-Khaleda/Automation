package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Common {
	WebDriver driver;
	@Parameters({"browser","url"})
@BeforeTest	
	public void browser(String browser,String website) {
		String path = System.getProperty("user.dir");
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",path+"/Driver/chromedriver");
			 driver = new ChromeDriver();
			 driver.get(website);
			 driver.manage().window().maximize();
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver",path+"/Driver/geckodriver");
			driver = new FirefoxDriver();
			 driver.get(website);
			 driver.manage().window().maximize();
			
		}
		 
		 }
@AfterTest
public void tearup() {
	driver.close();
}

}
