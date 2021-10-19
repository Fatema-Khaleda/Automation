package com.aetna.page.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AetnaOtc_creatingNewId {
	public WebDriver driver;
	
	@FindBy(xpath = "//div[@aria-label='Create account']") WebElement CreateNewAccountElement;
	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[1]") WebElement MemberId;
	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[2]") WebElement DateOfBirth;
	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[3]") WebElement ZipCode;
	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[4]") WebElement EmailAddress;
	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[5]") WebElement ReTypeEmailAddress;
	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[6]") WebElement CreatePassWord;
	@FindBy(xpath = "(//input[@class='css-11aywtz r-cqee49 r-1b43r93'])[7]") WebElement ReTypePassWord;
	@FindBy(xpath = "//div[text()='Continue']") WebElement SignUp;
	
	public AetnaOtc_creatingNewId(WebDriver Driver) {
		this.driver = Driver;
		PageFactory.initElements(Driver,this);	
	}
	public void createNewAccountElement() {
		CreateNewAccountElement.click();
	}
	public void memberId(){
		MemberId.sendKeys("123456789101");
	}
	public void dateOfBirth(){
		DateOfBirth.sendKeys("01021997");
	}
	public void zipCode(){
		ZipCode.sendKeys("12345");
	}
	public void emailAddress(){
		EmailAddress.sendKeys("automationpractice@gmail.com");
	}
	public void reTypeEmailAddress(){
		ReTypeEmailAddress.sendKeys("automationpractice@gmail.com");
	
	}
	public void createPassWord(){
		CreatePassWord.sendKeys("123456Ab");
	}
	public void reTypePassWord(){
		ReTypePassWord.sendKeys("123456Ab");
	}
	public void signUp() {
		SignUp.click();
	}


}
