package com.fab.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.fab.pages.ConnectLogin;
import com.fab.testng.api.base.Annotations;


public class testclass extends Annotations{
	
	
	@Test(dataProvider="fetchDatatest")
	public void testdata(String test123) {
		System.out.println(test123);

	}
	
	@Test(dataProvider="fetchDatatest")
	public void testdata1(String test123) {
		System.out.println(test123);

	}
	

}
