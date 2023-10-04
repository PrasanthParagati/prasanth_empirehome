package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Loginfunctionality extends Basetest {
	
	@FindBy (name = "emailid")
	WebElement userid;
	
	@FindBy (name = "pword")
	WebElement password;
	
	@FindBy (xpath = "//button[text()='Login']")
	WebElement loginbutton;
	
	public Loginfunctionality() {
		
		PageFactory.initElements(driver,this);
	}
	
	public void verifylogin() {
		
		userid.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbutton.click();
	}
	

}
