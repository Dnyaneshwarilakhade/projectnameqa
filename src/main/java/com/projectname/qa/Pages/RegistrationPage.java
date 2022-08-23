package com.projectname.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.projectname.qa.Base.TestBase;

public class RegistrationPage extends TestBase{  //POM class
	//Declaration ==>webelements
	//initialization==>pagefactory
	//usage==>validation==>methods
	
	//Declaration
	
	//object Repository
	
	@FindBy (xpath="//img[@alt='Facebook']")private WebElement reg_fblogo;
	@FindBy (xpath="//a[text()='Already have an account?']")private WebElement already_acc;
	@FindBy (xpath="//a[@title='Sign up for Facebook']")private WebElement signuplink;
	@FindBy (name="firstname")private WebElement firstname;
	@FindBy (name="lastname")private WebElement surname;
	@FindBy (name="reg_email__")private WebElement mob_email;
	@FindBy (name="reg_passwd__")private WebElement password;
	@FindBy (name="birthday_day")private WebElement birthday;
	@FindBy (name="birthday_month")private WebElement birthmonth;
	@FindBy (name="birthday_year")private WebElement birthyear;
	@FindBy (xpath="//label[text()='Male']") private WebElement gender_male;
	@FindBy (xpath="//label[text()='Female']") private WebElement gender_female;
	@FindBy (name="websubmit") private WebElement signupbtn;
	

	//initialization
	
	public RegistrationPage(WebDriver driver) {
       PageFactory.initElements(driver,this);
	}

	//usage
	
	public void clickFacebookSignupLink() {
		signuplink.click();
	}
	
	public void verifyFacebookRegistrationPagefblogo() {
		Assert.assertTrue(reg_fblogo.isDisplayed(),"the fb logo is not displayed on registration page");
	}
	
	public void verifyFacebookRegistrationPageAlreadyAccount() {
		Assert.assertTrue(already_acc.isDisplayed(),"the fb Already have an account option is not displayed on registration page");
		
		Assert.assertEquals(already_acc.getText(),"Already have an account?");
	}
	
	public void setFacebookRegistrationPageFirstName() {
		firstname.sendKeys("paresh");
	}
	
	public void setFacebookRegistrationPageLastName() {
		surname.sendKeys("abcdefgh");
	}
	
	public void setFacebookResgistrationPageMob_Email() {
		mob_email.sendKeys("1234567894");
	}
	
	public void setFacebookRegistrationPagePassword() {
		password.sendKeys("ABC@123456");
	}
	
	public void setFacebookRegistrationPageBirthDay() {
		Select bday=new Select(birthday);
		
		Assert.assertTrue(birthday.isDisplayed(),"the birthday option is not displayed on registration page");
		Assert.assertFalse(birthday.isSelected());
		bday.selectByVisibleText("19");
	}
	
	public void setFacebookRegistrationPageBirthMonth() {
		Select bmonth=new Select(birthmonth);
		
		Assert.assertTrue(birthmonth.isDisplayed(),"the birthmonth option is not displayed on registration page");
		Assert.assertFalse(birthmonth.isSelected());
		bmonth.selectByVisibleText("Mar");
	}
	
	public void setFacebookRegistrationPageBirthYear() {
		Select byear=new Select(birthyear);
		
		Assert.assertTrue(birthyear.isDisplayed(),"the birthyear option is not displayed on registration page");
		Assert.assertFalse(birthyear.isSelected());
		byear.selectByVisibleText("1955");
	}
	
	public void setFacebookRegistrationPageGender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			gender_male.click();
		}else if(gender.equalsIgnoreCase("female")) {
			gender_female.click();
	}else {
		System.out.println("user has provided the wrong input");
	}
	}
	
	public void clickFacebookRegistrationPageSubmitBtn() {
		signupbtn.click();
	}
}
	
	
	
	
	
	
	
	
	
	
	

	


