package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.HomePagePOMClass;
import com.SauceDemo.PomClasses.LoginPagePomClass;

public class TC04MultipleProductAddToCartFunctionality extends TestBaseClass {

	   @Test
	   public void multipleProductAddToCart()
	   {     
	        //all product select.
	        HomePagePOMClass hp = new HomePagePOMClass(driver);
	        hp.addAllProduct();
	        System.out.println("all products are added to cart");
			
	        //validation
	        System.out.println("apply the validation");
	        
	       String actualResult = hp.getTextFromCartButton();
	       String expctedResult = "6";
	       
	       Assert.assertEquals(actualResult, expctedResult);
	    
	       hp.clickMenuButton();
	       System.out.println("Clicked on menu button");
	       
	        hp.clickLogOutButton();
	        System.out.println("Clicked on logout button");
	   }
	   
	 

		
	
	
}
