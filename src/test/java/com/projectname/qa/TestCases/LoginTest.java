package com.projectname.qa.TestCases;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
//import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.LoginPage;

public class LoginTest extends TestBase {

	//setup
	@BeforeClass
	public void setup() {
		Crossbrowser("chrome");
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
	@Test
	public void FacebookLoginPageTest(){
		
		LoginPage lp=new LoginPage(driver);
		
		lp.verifyFacebookLoginPageLogo();
		lp.verifyFacebookLoginPageTagline();
		lp.verifyFacebookLoginPageCreatenewAccount();
		lp.verifyFacebookLoginPagecreatepagelink();
		lp.verifyFacebookLoginPagefooterlinks();
		lp.setFacebookLoginPageUsername();
		lp.setFacebookLoginPassword();
		lp.clickFacebookLoginPageLoginBtn();
		
	
		
	}
	

}
