package com.SauceDemo.Practice;

import org.testng.annotations.Test;

public class InvocationCountKeywordinTestNG {
	
	
	
	
	
	public class Practice4 
	{
		@Test(invocationCount=5)
		public void testA()
		{
			System.out.println("Test A");
		}
		
		@Test(priority=1, invocationCount =0)  // Skip this TC
		public void testB()
		{
			System.out.println("Test B");
		}
		
		@Test                // invocationCount is by default 1
		public void testC()
		{
			System.out.println("Test C");
		}
		
		@Test (invocationCount=0)         //will not be executed
		public void testD()
		{
			System.out.println("Test D");
		}

		@Test(invocationCount=-1)       //will not be executed
		public void testE()
		{
			System.out.println("Test E");
		}

	}


}
