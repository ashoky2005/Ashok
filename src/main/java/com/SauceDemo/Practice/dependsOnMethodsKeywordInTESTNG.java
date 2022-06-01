package com.SauceDemo.Practice;

import org.testng.annotations.Test;

import graphql.Assert;

public class dependsOnMethodsKeywordInTESTNG {
	
	
@Test(priority = 2)



public void loginTest()
{
	System.out.println("Login Test");
	
	
Assert.assertTrue(false);	 // 2nd Tc is dependent on 1st TC so if 1st TC is failed then 2nd TC will not run
	
	
}
	

	
	@Test (dependsOnMethods = { "loginTest"}, priority = 1) 
	
	// Note:- When we using "dependsOnMethods" then one test case is dependent on another TC so first that TC will run after that dependent 
	// TC will run even if we set first priority to dependent TC
	
	public void singlepdtTest()
	{
		System.out.println("Single pdt selection");
	}
	
	
	
	
	
	
	
	

}
