package health_care_test;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import healthCare.AetnaOtc_Common;
import healthCare.AetnaOtc_creatingNewId;

public class AetnaOtcTestClass extends AetnaOtc_Common {

@Test(priority = 1)

public void aetnaotctestclass() throws InterruptedException {
	PageFactory.initElements(driver, AetnaOtc_creatingNewId.class);
	AetnaOtc_creatingNewId.CreateNewAccount.click();
	AetnaOtc_creatingNewId.MemberId.sendKeys("123456789");
	AetnaOtc_creatingNewId.DateOfBirth.sendKeys("01022021");
	AetnaOtc_creatingNewId.ZipCode.sendKeys("11218");
	AetnaOtc_creatingNewId.EmailAddress.sendKeys("testng@gmail.com");
	AetnaOtc_creatingNewId.ReTypeEmailAddress.sendKeys("testng@gmail.com");
	AetnaOtc_creatingNewId.CreatePassWord.sendKeys("123456");
	AetnaOtc_creatingNewId.ReTypePassWord.sendKeys("123456");
	AetnaOtc_creatingNewId.SignUp.click();
	

}

}
