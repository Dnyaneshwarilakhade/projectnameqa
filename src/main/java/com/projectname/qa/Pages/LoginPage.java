package com.projectname.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.collections.Lists;

public class LoginPage {
	//Declaration
	@FindBy(xpath="//img[@alt='Facebook']")private WebElement login_fblogo;
	@FindBy(xpath="//h2[contains(text(),'Facebook helps')]")private WebElement login_fbtagline;
	@FindBy(id="email")private WebElement username;
	@FindBy(id="pass")private WebElement password;
	@FindBy(name="login")private WebElement login_btn;
	@FindBy(xpath="//a[text()='Forgotten password?']")private WebElement forgottenpassword;
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")private WebElement createnewaccountbtn;
	@FindBy(xpath="//a[text()='Create a Page']")private WebElement createpagelink;
	@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']/ul/li/a")})private List<WebElement> footerlinks;

	//initialization //static elements
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//usage
	public void verifyFacebookLoginPageLogo() {
		Assert.assertTrue(login_fblogo.isDisplayed(),"fb logo is not displayed on login page");
		Reporter.log("verifyFacebookLoginPageLogo",true);
	}
	
	public void verifyFacebookLoginPageTagline() {
		Assert.assertTrue(login_fbtagline.isDisplayed(),"fb tagline is not displayed on login page");
		Reporter.log("verifyFacebookLoginPageTagline",true);
	}
	
	public void verifyFacebookLoginPageCreatenewAccount() {
		Assert.assertTrue(createnewaccountbtn.isDisplayed(),"fb new account button is not displyed on login page");
		Reporter.log("verifyFacebookLoginPageCreatenewAccount",true);
	}
	
	public void verifyFacebookLoginPagecreatepagelink() {
		Assert.assertTrue(createpagelink.isDisplayed(),"fb create a page link is not displayed");
		Reporter.log("verifyFacebookLoginPagecreatepagelink",true);
	}
	
	public void setFacebookLoginPageUsername() {
		Assert.assertTrue(username.isDisplayed(),"Fb username field is not displayed on login page");
		username.sendKeys("Paresh@12312");
		Reporter.log("setFacebookLoginPageUsername",true);
	}
	
	public void setFacebookLoginPassword() {
		Assert.assertTrue(password.isDisplayed(),"Fb username field is not displayed on login page");
		password.sendKeys("Paresh");
		Reporter.log("setFacebookLoginPagePassword",true);
	}
	
	public void clickFacebookLoginPageLoginBtn() {
		Assert.assertTrue(login_btn.isDisplayed(),"login button is not displayed on login page");
		Assert.assertTrue(login_btn.isEnabled(),"login button is not enabled on login page");
		login_btn.click();
		
		Reporter.log("clickFacebookLoginPageLoginBtn",true);
	}
	
	public void verifyFacebookLoginPagefooterlinks() {
		Assert.assertEquals(footerlinks.size(),31);
		
		for(int i=0;i<footerlinks.size();i++) {
			System.out.println(footerlinks.get(i).getText());
		}
		Reporter.log("verifyFacebookLoginPagefooterlinks",true);
	}
}
