package com.app.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Ann {
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforesuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("aftersuite");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		System.out.println("test2");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("aftermethod");
	}

}
