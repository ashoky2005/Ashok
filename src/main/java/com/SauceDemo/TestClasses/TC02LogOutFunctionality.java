package com.SauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.HomePagePOMClass;

import com.SauceDemo.PomClasses.LoginPagePomClass;

public class TC02LogOutFunctionality extends TestBaseClass 
{
	
    @Test
    public void logOutFunctionality() 
    {
    	//homePage
        HomePagePOMClass hp = new HomePagePOMClass(driver);
        hp.clickMenuButton();
        System.out.println("Clicked on menu button");
        
         hp.clickLogOutButton();
         System.out.println("Clicked on logout button");
         
        System.out.println("apply validation");
        
        String expectedUrl = "https://www.saucedemo.com/";
        String actualUrl = driver.getCurrentUrl();
        
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    

		
		
		
		
		
		
	}


