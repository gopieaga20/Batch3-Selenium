package org.testng.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");
	}
	
	@BeforeTest()
	public void beforeTest(){
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}
	
	@Test(dependsOnMethods="tc_precond")
	public void tc_1() {
		System.out.println("Test Case 01");
	}
	
	@Test(enabled=false)
	public void tc_2() {
		System.out.println("Test Case 02");
	}
	
	@Test(groups= "payment")
	public void tc_3() {
		System.out.println("Test Case 03");
	}
	
	@Test
	public void tc_precond() {
		System.out.println("tc_precond");
	}
	
	@AfterTest()
	public void afterTest(){
		System.out.println("after test");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	

}
