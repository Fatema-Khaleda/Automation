package healthCare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AetnaOtc_Common {
	public static WebDriver driver;

	@Parameters({ "browser" })
	@BeforeMethod
	public void setup(String browser) {

		System.setProperty("webdriver.chrome.driver",
				"/Users/fatemakhaleda/eclipse-workspace/Automation/Driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://www.cvs.com/otchs/myorder");
	}

	@AfterMethod
	public void tearup() {
		driver.close();
	}

}