package com.keyclock.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.example.firstpackage.AdministrationLogin;
import com.example.firstpackage.CreateGroup;
import com.example.firstpackage.KeyClockHomePage;

public class KeyClockTests {
	public WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\testlib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void loginasAdminstration() {
		KeyClockHomePage home = new KeyClockHomePage(driver);
		home.clickOnAdministrationButton();
		AdministrationLogin login = new AdministrationLogin(driver);
		login.enter_username("admin");
		login.enter_password("admin");
		login.clickOnLogin();
		//home.clickonGroupButton();
			home.clickonGroupButton();

		CreateGroup group= new CreateGroup(driver);
		group.enter_groupName("Tester");
		group.clickonNewButton();
		group.clickonSaveButton();


	}
	
// @After
	
//public void close() {
//	driver.close();
//}
}
