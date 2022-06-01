package com.SauceDemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePomClass 
{
		
		
		//webelement find
		//actions on webelement
		
		//1. WebDriver declared  // Global var
	
	

	private	WebDriver driver;
	
	private Actions act;
		
		
		//we will not use this
	
//		WebElement userName = driver.findElement(By.xpath("----"));
//		userName.sendKeys("standard_user");
		
		//annonations --> @ --> method only-functionality
	
		
		@FindBy(xpath = "//input[@id='user-name']")
		private	WebElement userName;
		
		
		
		//Now we will perform actions on element -method
		
		
		public void sendUsername()
		{
			userName.sendKeys("standard_user");
		}
		
		
		
		
	// Find webelement for password and perform actions on it
		
		
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;	
		
// Now perform actions on Password WebElement
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");	
	}
		
		
		
//  Login Button
	
    @FindBy(xpath="//input[@id='login-button']")
	private WebElement login;
    
    public void clickloginButton()
    {
    //	login.click();
    	act.click(login).perform();
    }
		
		
	// Now We will declare the constuctor
  
	public 	LoginPagePomClass (WebDriver driver) // local Var
	{
		// Here We will map Local Driver with Global Driver
		
		this.driver = driver;
		
PageFactory.initElements(driver, this)	;	
		
	
//Instead of using click method we can also perform click action by using
//mouse action by using Actions Class

 act = new Actions(driver);

	
	}
		
		
	//1.WebDriver driver;  global
		//2.element find --> @FindBy
		//3.Method --> element action
		//4.Constructor --> this and pageFactory
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

}
