package com.example.firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyClass {


public static void main(String[] args) {
    // declaration and instantiation of objects/variables
	
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.16.1-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://localhost:8080");
	driver.findElement(By.linkText("Administration Console")).click();
	//driver.findElement(By.class("form-control")).sendKeys("admin");
//	 WebElement Searchbox = driver.findElement(By.id("username"));
//	 Searchbox.sendKeys("admin");
	//WebElement Searchbox = driver.findElement(By.id("password"));
	// Searchbox.sendKeys("admin");
	
	driver.close();
	//username.sendKeys("admin");
	//driver.get("https://www.google.com.au/");
	//WebElement usertext=driver.findElement((( By.id("lst-ib")).click());
	//usertext.sendKeys("Melbourne");
//	 WebElement bNext = driver.findElement(By.id("gs_sc0"));//	bNext.click();
//	

    
}
}