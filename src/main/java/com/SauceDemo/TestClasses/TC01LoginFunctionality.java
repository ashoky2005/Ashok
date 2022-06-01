 package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.PomClasses.HomePagePOMClass;
import com.SauceDemo.PomClasses.HomePagePOMClass;
import com.SauceDemo.PomClasses.LoginPagePomClass;
import com.SauceDemo.UtilityClass.ScreenShotClass;

public class TC01LoginFunctionality extends TestBaseClass{
	
//public static void main(String[] args)  
//{
	
	
	@Test
	public void loginFunctionalityTest() throws IOException 
	{
	       String expectedTitle = "Swag Labs";
	       String actualTitle = driver.getTitle();
	       log.info("Verify the test case");
	       Assert.assertEquals(actualTitle, expectedTitle); 
	       
// Logout

ScreenShotClass.takesScreenShot(driver);       
	       
	       
HomePagePOMClass hp = new HomePagePOMClass(driver);
hp.clickMenuButton();
log.info("Clicked on menu button");

 hp.clickBagButton();
 log.info("Clicked on logout button");

}   
	       
	       
	       
	       
	       
	       
	       

	 
	
////	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Velocity\\Cdriver\\chromedriver_win32\\chromedriver.exe");	
//	WebDriver driver = new FirefoxDriver();
//	
//	System.out.println("Browser is Opened");
//	
//	driver.get("https://www.saucedemo.com/");
//	driver.manage().window().maximize();
//
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	
//	
//	// Login Functionalities
//	
//	LoginPagePomClass lp = new LoginPagePomClass(driver);
//	
//	// UserNmae
//	
//	lp.sendUsername();		
//	
//	System.out.println("Enter The UserNmae");
//	
//	// Password
//	lp.sendPassword();
//	
//	System.out.println("Enter the Pasword");
//	
//	
//	// Login
//	
//	lp.clickloginButton();
//	System.out.println("Click on Login Button");
//	
//	
//	
//// Validation
//	
//	
//    String expectedTitle = "Swag Labs";
//    String actualTitle = driver.getTitle();
//    
//if(expectedTitle.equals(actualTitle))
//{
//	   System.out.println("Test case is passed");
//}
//else
//{
//	   System.out.println("Test case is failed");
//}
//
//System.out.println("Verify the Test");
//	
//	
//	
//// Logout
//
//	driver.quit();
//	System.out.println("Browser is closed");
//	
//
//}	
//	
}


