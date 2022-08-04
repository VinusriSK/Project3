package com.app.testng;

import org.testng.annotations.Test;

public class GroupTestCases1 {

	@Test(groups = { "smoke", "reg" })
	public void test2() {
		System.out.println("test2");
	}

	@Test(groups = { "Sanity", "reg" })
	public void test4() {
		System.out.println("test4");
	}

	@Test(groups = { "smoke", "reg" })
	public void test5() {
		System.out.println("test5");
	}

	@Test(groups = { "smoke", "reg" })
	public void test6() {
		System.out.println("test6");
	}

	@Test(groups = { "Sanity", "reg" })
	public void test7() {
		System.out.println("test7");
	}

}
