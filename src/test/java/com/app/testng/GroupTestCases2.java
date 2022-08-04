package com.app.testng;

import org.testng.annotations.Test;

public class GroupTestCases2 {
	@Test(groups = { "Sanity", "reg" })
	public void test8() {
		System.out.println("test8");
	}

	@Test(groups = { "smoke", "reg" })
	public void test9() {
		System.out.println("test9");
	}

	@Test(groups = { "Sanity", "reg" })
	public void test10() {
		System.out.println("test10");
	}

	@Test(groups = { "smoke", "reg" })
	public void test11() {
		System.out.println("test11");
	}

}
