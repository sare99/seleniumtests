package com.example.firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdministrationLogin {
	@FindBy(id= "username")
	WebElement Username;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(id="kc-login")
	WebElement login_button;
	
public AdministrationLogin(WebDriver driver) {
//		//this.driver = driver;
//		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
public void enter_username(String username) {
	Username.sendKeys(username);
}
public void enter_password(String password) {
	Password.sendKeys(password);
}
public void clickOnLogin()
{
	login_button.click();
}
}
