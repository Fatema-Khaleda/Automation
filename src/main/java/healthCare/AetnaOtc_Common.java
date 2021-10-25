package healthCare;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AetnaOtc_Common {
	public static WebDriver driver;
	@Parameters({"browser"})
	    @BeforeMethod
	    public void setup(String browser) { 
	    	
	    	System.setProperty("webdriver.chrome.driver","/Users/fatemakhaleda/eclipse-workspace/Automation/Driver/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();  
			driver.manage().window().fullscreen();  
			driver.manage().deleteAllCookies();  
			driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
			driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
			driver.get("https://www.cvs.com/otchs/myorder");
	    }
	    

@AfterMethod
public void tearup() {
driver.close();
}
		
	}