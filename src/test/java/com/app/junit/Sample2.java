package com.app.junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.app.base.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Sample2 extends BaseClass {
	
	/*@Test @Ignore
	public void test1() {
		System.out.println("test1");
	}

	//Assert: class assertEquals() , assertTrue() assertFalse()
	@Test
	public void test2() {
		
		String s = "Aiite";
		Assert.assertEquals(s, "aiite");
		System.out.println("test2");
	}*/
	
	@Test
	public void test3() {
		String s = "Aiite";
		if (s.equals("Aiit")) {
		ExtentTest logger = extent.createTest("Failed Test CAses");
		logger.log(Status.INFO, "Failed Log Captured");
		logger.log(Status.FAIL, "Failed Test CAses");
		}
		System.out.println("test3");
	}

	@Test
	public void test4() {
		ExtentTest logger = extent.createTest("Passed TestCases");
		logger.log(Status.PASS, "Passed TestCases");
		String s = "Aiite";
		Assert.assertFalse(s.contains("a"));
		System.out.println("test4");
	}

	
}
