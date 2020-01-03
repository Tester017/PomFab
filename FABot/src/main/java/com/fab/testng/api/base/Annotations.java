package com.fab.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.fab.selenium.api.base.SeleniumBase;
import com.fab.utils.DataLibrary;

public class Annotations extends SeleniumBase {
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	startApp("chrome", "https://connect.maveric-systems.com/index.php/site/login");
	
  }

  @AfterMethod
  public void afterMethod() {
	  close();
  }

}
