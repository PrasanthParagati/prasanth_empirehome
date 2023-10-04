package com.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;

public class Logintest extends Basetest {
	
	Loginfunctionality lf;
	
	public Logintest() {
		super();                       // load the file
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();              // browser initialization
		
		lf = new Loginfunctionality();
	}
	
	@Test
	public void loginvalidation() {
		lf.verifylogin();                // validate the credentials
		
		String urltest=driver.getCurrentUrl();
		assertEquals(urltest, "http://empirehome.myprojectsonline.co.in/EmpireHome/Dashboard");
	}
	
	@AfterMethod
	public void teardown() {
		//driver.close();
	}

}
