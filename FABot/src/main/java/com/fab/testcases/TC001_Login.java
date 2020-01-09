package com.fab.testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.fab.pages.ConnectLogin;
import com.fab.testng.api.base.Annotations;
import com.fab.utils.TestListener;

@Listeners(TestListener.class)
public class TC001_Login extends Annotations{
	
	/*@BeforeTest
	public void setData() {
		testcaseName = "TC001_Login";
		testcaseDec = "Login and Verify";
		author = "Daniel";
		category = "smoke";
		excelFileName = "TC001";
		
	} */

	@Test(priority=0)
	public void connectLoginPositive() throws IOException {
		
		testcaseId = "TC001";
		testcaseName = "ConnectLogin";
		testcaseDec = "Valid User name and Valid password";
		author = "Daniel";
		category = "smoke";
		report();
		
		new ConnectLogin()
		.enterUserName("danielf")
		.enterPassword("Mavdec@123")
		.clickLogin()
		.verifyWelcomePresent();

	}
	
	@Test(priority=1)
	public void connectLoginNegative() throws IOException {
		
		testcaseId = "TC002";
		testcaseName = "ConnectLogin";
		testcaseDec = "Valid User Name and Invalid Password";
		author = "Daniel";
		category = "SIT";
		report();
		
		new ConnectLogin()
		.enterUserName("danielf")
		.enterPassword("temp")
		.clickLogin();
		new ConnectLogin().verifyInvalidPasswordError();

	}
	


}
