package com.page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public WebDriver driver;
	
@FindBy(linkText = "Create New Account") WebElement CreatNewAccount;
@FindBy(xpath = "//input[@name='firstname']") WebElement FirstName;
@FindBy(xpath = "//input[@name='lastname']") WebElement LastName;
@FindBy(xpath = "//input[@name='reg_email__']") WebElement MobileNumber;
@FindBy(xpath = "//input[@id='password_step_input']") WebElement PassWord;
@FindBy(xpath = "//select[@name='birthday_month']") WebElement BirthMonth;
@FindBy(xpath = "//select[@id='day']") WebElement BirthDay;
@FindBy(xpath = "//select[@id='year']") WebElement BirthYear;
@FindBy(xpath = "(//label[@class='_58mt'])[1]") WebElement GenderSecelect;
@FindBy(name = "websubmit") WebElement SignUp;

public Facebook(WebDriver Driver) {
	this.driver= Driver;
	PageFactory.initElements(Driver,this);
}
public void createNewaccount() {
	CreatNewAccount.click();	
}
public void firstName() {
	FirstName.sendKeys("Fatema");	
}
public void lastName() {
	LastName.sendKeys("Khaleda");
}
public void mobileNumber() {
	MobileNumber.sendKeys("1234567890");
}
public void passWord() {
	PassWord.sendKeys("123456Bb@");
}
public void birthMonth() {
Select select = new Select(BirthMonth);
select.selectByVisibleText("Mar");
}
public void birthDay() {
Select select = new Select(BirthDay);
select.selectByValue("6");
}
public void birthYear() {
Select select = new Select(BirthYear);
select.selectByValue("1992");
}
public void genderSecelect() {
	GenderSecelect.click();
}
public void signUp() {
	SignUp.click();
}

}
