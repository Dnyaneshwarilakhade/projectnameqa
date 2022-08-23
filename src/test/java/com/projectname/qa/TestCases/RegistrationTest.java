package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.RegistrationPage;

public class RegistrationTest extends TestBase{ //Test case ==>These are your navigational steps
	

	
	@BeforeClass
	public void setup() {
		Crossbrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FacebookRegistrationPageTest() {
		
		RegistrationPage rgpage=new RegistrationPage(driver);
		
		rgpage.clickFacebookSignupLink();
		rgpage.verifyFacebookRegistrationPageAlreadyAccount();
		rgpage.verifyFacebookRegistrationPagefblogo();
		rgpage.setFacebookRegistrationPageFirstName();
		rgpage.setFacebookRegistrationPageLastName();
		rgpage.setFacebookResgistrationPageMob_Email();
		rgpage.setFacebookRegistrationPageBirthDay();
		rgpage.setFacebookRegistrationPageBirthMonth();
		rgpage.setFacebookRegistrationPageBirthMonth();
		rgpage.setFacebookRegistrationPageBirthYear();
		
		rgpage.setFacebookRegistrationPageGender("female");
		
		rgpage.clickFacebookRegistrationPageSubmitBtn();
	}
	
	
}
