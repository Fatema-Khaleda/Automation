package healthCare;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AetnaOtc_creatingNewId {

	@FindBy(xpath = "//div[@aria-label='Create account']")
	public static WebElement CreateNewAccount;

	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[1]")
	public static WebElement MemberId;

	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[2]")
	public static WebElement DateOfBirth;

	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[3]")
	public static WebElement ZipCode;

	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[4]")
	public static WebElement EmailAddress;

	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[5]")
	public static WebElement ReTypeEmailAddress;

	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[6]")
	public static WebElement CreatePassWord;

	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[7]")
	public static WebElement ReTypePassWord;

	@FindBy(xpath = "//div[text()='Continue']")
	public static WebElement SignUp;

}
