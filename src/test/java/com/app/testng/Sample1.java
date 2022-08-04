package com.app.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample1 {
	
	@Ignore
	@Test(priority = 1)
	public void test3() {
		System.out.println("test3");
	}

	@Test(priority = 2,enabled=false)
	public void test1() {
		System.out.println("test1");
	}

	@Test (invocationCount=100)
	public void test2() {
		System.out.println("test2");
	}
	
	@Test (dependsOnMethods= {"test5"})
	public void test4() {
		System.out.println("test4");
	}
	
	@Test
	public void test5() {
		System.out.println("test5");
	}
	
	
	@Test
	public void test6() {
		System.out.println("test6");
	}
	
	@Test
	public void test7() {
		System.out.println("test7");
	}

}
