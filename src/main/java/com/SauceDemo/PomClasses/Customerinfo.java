package com.SauceDemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customerinfo {
	
	
private	WebDriver driver;

//:- First Name

@FindBy(xpath = "//input[@id='first-name']")

private WebElement FirstName;

public void 	FirstNameSendkeys()
{
	FirstName.sendKeys("Ashok");
}
	
	
	


//2:- LastName


@FindBy(xpath = "//input[@id='last-name']")

private WebElement LastName;

public void 	LastNameSendkeys()
{
	FirstName.sendKeys("Ashok");
}


//:- Postal Code


@FindBy(xpath = "//input[@id='postal-code']")

private WebElement postalcode;

public void 	postalcodeSendkeys()
{
	postalcode.sendKeys("Ashok");
}


// 4:- Cancel Button

@FindBy(xpath = "//button[@id='cancel']")
private WebElement cancel;

public void cancelclick()
{
	cancel.click();
}



//5:- continue

@FindBy(xpath = "//button[@id='continue']")
private WebElement continueButton;

public void continueButtonclick()
{
	continueButton.click();
}





}
