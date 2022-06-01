package com.SauceDemo.Practice;

import org.testng.annotations.Test;

public class EnabledKeywordInTestNG {
	
@Test(enabled = false)

public void testA()
{
	
	System.out.println("Test A");   // This TC is not executed
}


	
	@Test (enabled = false)
	public void testB()
	{
		System.out.println("Test B");   // This TC is not executed
	}
	
	
	@Test
	public void testC()
	{
		System.out.println("Test C ");
	}
	
	
	
	@Test
	public void testD()
	{
		System.out.println("Test D");
	}
	
	
	
	@Test (enabled = false) 
	public void testE()  // This TC is not executed
	{
		
		System.out.println("Test E");
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
