package com.SauceDemo.UtilityClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass {
	
public static void takesScreenShot(WebDriver driver) throws IOException	
{
	
	TakesScreenshot ts =  (TakesScreenshot)driver;
	File SourceFile = ts.getScreenshotAs(OutputType.FILE);
	File DestFile = new File("./ScreenShot/ saucedemo.jpg");
	FileHandler.copy(SourceFile, DestFile);
	System.out.println("SS is taken ");
	
	
	
	

}
}