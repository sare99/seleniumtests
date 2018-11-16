package com.example.firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KeyClockHomePage {	
	private WebDriver driver;
	// Page URL
	private static String PAGE_URL = "http://localhost:8080/";
	// Locators
	// Login as Administration
	@FindBy(linkText = "Administration Console")
	private WebElement AdministrationButton;
	
	@FindBy(linkText = "#/realms/master/groups")
	private WebElement GroupButton;
	public KeyClockHomePage(WebDriver driver) {
	this.driver = driver;		
		driver.get(PAGE_URL);
////		// Initialise Elements
PageFactory.initElements(driver, this);
	}

	public void clickOnAdministrationButton() {
		AdministrationButton.click();
		// aboutUs.click()

}
	public void clickonGroupButton()
	{
		GroupButton.click();
	}
	
}