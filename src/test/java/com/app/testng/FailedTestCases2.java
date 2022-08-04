package com.app.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCases2 {

	@Test 
	public void username() {
		Assert.assertEquals("A", "a");
		System.out.println("test8");
	}

	@Test
	public void password() {
		String a = "Aiite";
		Assert.assertTrue(a.contains("a"));
		System.out.println("test15");
	}


}
