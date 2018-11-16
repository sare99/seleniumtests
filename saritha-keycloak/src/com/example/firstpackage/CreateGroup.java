package com.example.firstpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateGroup {
	
	
	public CreateGroup (WebDriver driver) {
//		//this.driver = driver;
//		// Initialise Elements
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="createGroup")
	private WebElement New_Button;
	
	public void clickonNewButton()
	{
		New_Button.click();
	}
	@FindBy(id="name")
	private WebElement GroupName;
	
public void enter_groupName(String name) {
	GroupName.sendKeys(name);
}
	
@FindBy(className="ng-binding btn btn-primary")
private WebElement SaveButton;

public void clickonSaveButton()
{
	SaveButton.click();
}


}
