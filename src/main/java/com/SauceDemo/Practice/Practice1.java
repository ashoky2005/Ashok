package com.SauceDemo.Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice1 {
	
	
	
	@AfterMethod
	
	
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	

	
	@BeforeMethod
	
	public void beforeMethod()
	
	{
		System.out.println("Before Method");
	}
	
	
	@Test
	
	public void loginTest()
	{
		System.out.println("login Test Case");
	}
	
	
	
	
	

}
