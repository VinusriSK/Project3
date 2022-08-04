package com.app.testng;

import org.testng.annotations.Test;

public class Priority_TestCases {
	@Test (priority=1)
	public void username() {
		System.out.println("username");
	}

	@Test(priority=2)
	public void password() {
		System.out.println("password");
	}

	@Test(priority=3)
	public void click() {
		System.out.println("click");
	}

}
