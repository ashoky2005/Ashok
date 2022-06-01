package com.SauceDemo.Practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	
	@Test
	
	public void loginTest()
	
	{
		
		// Title Check
		

		String expectedTitle =  " Labs";
		String actualTitle =    "Swag Labs";
		
// Soft Assert
		
SoftAssert soft = new SoftAssert();
soft.assertEquals(actualTitle, expectedTitle);		
		
		
		// Url Check
		

String actualURL  = "www.sauceDemo.com";
	 
String expetedURL = "www.sauceDemo.com"	 ;
		
soft.assertEquals(actualURL, expetedURL);

// soft.assertAll(); 

//accurate result apply this method
//compulsory method



// If we not use this method then above assertion will 
// shown as passed if still  it's not acuurates


	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
