package com.SauceDemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {
	

private	WebDriver driver;
	



// 1:- Cart Button

@FindBy(xpath= "//span[text()= '5']")	
private WebElement CartButton;

public void cartClick()

{
	CartButton.click();
}


//2:- Remove 

@FindBy(xpath= "//button[@id='remove-test.allthethings()-t-shirt-(red)']")	
private WebElement Remove;

public void RemoveClick()

{
	Remove.click();
}


//3:- 

@FindBy(xpath= "//button[@id='continue-shopping']")	
private WebElement continueShopping;

public void continueShoppingClick()

{
	continueShopping.click();
}




// 4:- Checkout

@FindBy(xpath= "//button[@id='checkout']")	
private WebElement Checkout;

public void CheckoutClick()

{
	Checkout.click();
}











	
	
	
	

}
