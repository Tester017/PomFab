package com.fab.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.fab.testng.api.base.Annotations;

public class ConnectHome extends Annotations{

	public ConnectHome() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll(value = { 
			@FindBy(how=How.XPATH, using="//a[contains(text(),'Welcomee')]"), 
	        })
	List<WebElement> elementsList;
	
	public ConnectHome verifyWelcomePresent() {
		try {
			verifyDisplayed(elementsList.get(1));
		} catch (Exception e) {
			System.out.println( "not able to find the elements");		
			//e.printStackTrace();
		}
		return this;
	}


}
