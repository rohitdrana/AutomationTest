//Page class for Login Page


package com.test.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page object/ Object repository 
	
	@FindBy(name="login")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class = 'btn btn-primary btn-full-width']")
	WebElement nextBtn;
	
	@FindBy(xpath="//a[@class = 'user-nav--login user-nav--item']")
	WebElement loginBtn; 
	
	@FindBy(xpath="//button[contains(text(),'Log In')]")
	WebElement loginbtnEnd;
	
	//this is to initialize page factory 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// Actions:
	public String validateLoginPageTitle() {
	return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		loginBtn.click();
		username.sendKeys(un);
		nextBtn.click();
		password.sendKeys(pwd);
		loginbtnEnd.click();
		return new HomePage(); 
		
	}
	
}//class
