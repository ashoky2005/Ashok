package com.SauceDemo.Practice;

import org.testng.annotations.Test;

public class TimeoutKeywordinTestNG {
	
	
	@Test(timeOut= 2000)
	public void testA() throws InterruptedException
	{
		Thread.sleep(3000);
		
		System.out.println("Test A");
	}
	
	
	
	@Test
	public void testB()
	{
		System.out.println("Test B");
	}
	
	
	
	@Test
	public void testC()
	{
		System.out.println("Test C");
	}
	
	
	
	@Test
	public void testD()
	{
		
		System.out.println("Test D");
	}
	
	
	
	@Test
	public void testE()
	
	{
		System.out.println("Test E");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
