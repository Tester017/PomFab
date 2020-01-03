package com.fab.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.fab.testng.api.base.Annotations;

public class ConnectLogin extends Annotations{

	public ConnectLogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID, using="LoginForm_username")  WebElement eleUserNameField;
	@FindBy(how=How.ID, using="LoginForm_password")  WebElement elePasswordField;
	@FindBy(how=How.XPATH, using="//input[@type='submit']") WebElement eleLoginButton;

	public ConnectLogin enterUserName(String dUserName) {
		clearAndType(eleUserNameField,dUserName);
		return this;
	}
	
	public ConnectLogin enterPassword(String dPassword) {
		clearAndType(elePasswordField,dPassword);
		return this;
	}
	
	public ConnectHome clickLogin() {
		click(eleLoginButton);
		return new ConnectHome();
	}

	
	}
