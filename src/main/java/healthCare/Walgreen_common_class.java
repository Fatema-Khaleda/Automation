package healthCare;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Walgreen_common_class {
	
	public static void main(String[] args) {
		

		WebDriver driver = new SafariDriver();
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.get("https://www.cvs.com/otchs/myorder");
	}

}
