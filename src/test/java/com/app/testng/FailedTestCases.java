package com.app.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases {

	@Test (invocationCount=10)
	public void data() {
		Assert.assertEquals("A", "a");
		System.out.println("test8");
	}

	@Test(retryAnalyzer=FailedtestcasesRerun.class)
	public void test() {
		String a = "Aiite";
		Assert.assertTrue(a.contains("a"));
		System.out.println("test9");
	}
	
	@Test
	public void app() {
		String a = "Aiite";
		Assert.assertTrue(a.contains("A"));
		System.out.println("test10");
	}


}
