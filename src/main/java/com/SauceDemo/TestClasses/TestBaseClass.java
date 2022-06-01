package com.SauceDemo.TestClasses;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import com.SauceDemo.PomClasses.LoginPagePomClass;

public class TestBaseClass {
	
 WebDriver driver;
 Logger log = Logger.getLogger("12FebBatchMovenProjectV1");
	
	@Parameters("browserName") // By using this annotation we can decide which browser is used to open the url
	@BeforeMethod
	
	public void setUp(String browserName )
	
	{ 
		
		if(browserName.equals("chrome"))
		
		{
			
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
	driver = new ChromeDriver();
		
	
		}
		
		
		else
			
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		
		
	
	// Remaining Codes will reamain same	
		
		
		//remaining code will stay as it is
		log.info("browser open");
		PropertyConfigurator.configure("log4j.properties");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//log.info("URL is opened");
		log.info("URL is opened");
		
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	
	// Login
		
		LoginPagePomClass lp = new LoginPagePomClass (driver);
		lp.sendUsername();
		System.out.println("UserName Entered");
		
		lp.sendPassword();
		System.out.println("Password is entered");
		
		lp.clickloginButton();
		System.out.println("Clicked on Login Button");
		
		
		
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws IOException
	{
		
	driver.quit();	
	System.out.println("Browser is closed");	
		
	
		}
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
