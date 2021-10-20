package com.page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uhc {
	WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Find a doctor'])[1]") WebElement FindADoctor;
	@FindBy(xpath = "//button[@aria-controls='1744138300-list']") WebElement SingIn;
	@FindBy(css = ".jump-menu__link display-inlineBlock lineHeight-default position-relative color-blueDigital") WebElement MedicarePlan;
	//@FindBy(className = "uhc-tempo-link uhc-tempo-link--medium registerBtn") WebElement RegisterNow;
	@FindBy(xpath = "//input[@id='piFirstName']") WebElement FirstName;
	@FindBy(xpath = "//input[@id='piLastName']") WebElement LastName;
	@FindBy(xpath = "//input[@id='piDoB']") WebElement DateOfBirth;
	@FindBy(xpath = "//input[@id='piZipCode']") WebElement ZipCode;
	@FindBy(xpath = "//input[@id='piMemberId4Mnr']") WebElement PlanMemberId;
	@FindBy(xpath = "(//span[@class='ng-binding'])[7]") WebElement ContinueButton;
	
	public Uhc(WebDriver Driver) {
		this.driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	public void findADoctor() {
		FindADoctor.click();
	}
	public void signIn() {
		SingIn.click();
	}
	public void medicarePlan() {
		MedicarePlan.click();
	}
	public void registerNow() {
		String windowSet= driver.getWindowHandle();
		driver.switchTo().window(windowSet);
		WebElement element = driver.findElement(By.xpath("//button[normalize-space(text())='Register Now']"));
		element.click();
	}
	public void firstName() {
		FirstName.sendKeys("Fatema");
	}
	public void lastName() {
		LastName.sendKeys("Khaleda");
	}
	public void dateOfBirth() {
		DateOfBirth.sendKeys("01032011");
	}
	public void zipCode() {
		ZipCode.sendKeys("10019");
	}
	public void planMemberId() {
		PlanMemberId.sendKeys("123456789");
	}
	public void continueButton() {
		ContinueButton.click();
	}
	

}
