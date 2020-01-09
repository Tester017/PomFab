package com.fab.pages;

import com.fab.testng.api.base.Annotations;

public class ConnectHome extends Annotations{

	public ConnectHome verifyWelcomePresent() 
	{
		verifyDisplayed(locateElement("xpath", "//a[contains(text(),'Welcomee')]"));
		return this;
	}


}
