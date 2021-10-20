package com.page_object_model;

import org.testng.annotations.Test;

public class FaceBookTest extends Common{
	
	@Test(priority = 1)
	public void facebooktest() throws InterruptedException {
		Facebook facebook = new Facebook(driver);
		Thread.sleep(2000);
		facebook.createNewaccount();
		Thread.sleep(2000);
		facebook.firstName();
		Thread.sleep(2000);
		facebook.lastName();
		Thread.sleep(2000);
		facebook.mobileNumber();
		Thread.sleep(2000);
		facebook.passWord();
		Thread.sleep(2000);
		facebook.birthMonth();
		Thread.sleep(2000);
		facebook.birthDay();
		Thread.sleep(2000);
		facebook.birthYear();
		Thread.sleep(2000);
		facebook.genderSecelect();
		Thread.sleep(2000);
		facebook.signUp();
		Thread.sleep(2000);
	}
		
	
	@Test(priority = 2)
	public void uhc() throws InterruptedException {
		Uhc uhc = new Uhc(driver);
		uhc.findADoctor();
		Thread.sleep(2000);
		uhc.signIn();
		Thread.sleep(5000);
		uhc.medicarePlan();
		Thread.sleep(5000);
		uhc.registerNow();
		Thread.sleep(2000);
		uhc.firstName();
		uhc.lastName();
		uhc.dateOfBirth();
		uhc.zipCode();
		uhc.planMemberId();
		uhc.continueButton();
	}

}
