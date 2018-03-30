// Page class for Home Page Class


package com.test.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.qa.base.TestBase;

public class HomePage extends TestBase{
	
	// Page factory/Object Repository 
	@FindBy(xpath="//a[text()='Login']")
	WebElement LoginBtn; 
	
	
	
	// Initialize elements with page factory 
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	 
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	//Mouse movements
	
	/*
	 public void clickOnNewContactList(){
	 Actions actions = new Actions();
	 actions.moveToElement(contactsLink).build().perform(); //compulsory to use this
	 newContctLink.click(); 
	 }
	 
	 
	 */
	
	
	
	
	
	
	
	
	
	

} //class end
