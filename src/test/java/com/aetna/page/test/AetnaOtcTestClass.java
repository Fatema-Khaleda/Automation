package com.aetna.page.test;

import org.testng.annotations.Test;

public class AetnaOtcTestClass extends AetnaOtc_Common {

@Test(priority = 1)

public void aetnaotctestclass() throws InterruptedException {
	AetnaOtc_creatingNewId aetnaotc = new AetnaOtc_creatingNewId(driver);
	aetnaotc.createNewAccountElement();
	Thread.sleep(2000);
	aetnaotc.memberId();
	Thread.sleep(2000);
	aetnaotc.dateOfBirth();
	Thread.sleep(2000);
	aetnaotc.zipCode();
	Thread.sleep(2000);
	aetnaotc.emailAddress();
	Thread.sleep(2000);
	aetnaotc.reTypeEmailAddress();
	Thread.sleep(2000);
	aetnaotc.createPassWord();
	Thread.sleep(2000);
	aetnaotc.reTypePassWord();
	Thread.sleep(2000);
	aetnaotc.signUp();
	Thread.sleep(2000);
	}

}
