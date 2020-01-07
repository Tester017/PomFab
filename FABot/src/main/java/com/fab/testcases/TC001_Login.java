package com.fab.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fab.pages.ConnectLogin;
import com.fab.testng.api.base.Annotations;
import com.fab.utils.TestListener;

@Listeners(TestListener.class)
public class TC001_Login extends Annotations{
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC001_Login";
		testcaseDec = "Login and Verify";
		author = "Daniel";
		category = "smoke";
		excelFileName = "TC001";
		
	} 

	@Test
	public void login() {
		new ConnectLogin()
		.enterUserName("danielf")
		.enterPassword("temp")
		.clickLogin();

	}
	

}
