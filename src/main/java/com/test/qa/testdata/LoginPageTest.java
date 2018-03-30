package com.test.qa.testdata;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.test.qa.base.TestBase;
import com.test.qa.pages.HomePage;
import com.test.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage; 
	HomePage homePage;
	
	//Create the constructor
	public LoginPageTest() {
		super(); 
		//It will class super class constructor to initialize so that you won't get NullPointerException
	}
	
	@BeforeMethod
	public void setup() {
		
		//Call initialization method from base class
		initialization(); 
		loginPage = new LoginPage();
	}
	
	@Test(priority =1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Secure File Sharing, Storage, and Collaboration | Box");
	}
	
	@Test(priority =2)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}// class
