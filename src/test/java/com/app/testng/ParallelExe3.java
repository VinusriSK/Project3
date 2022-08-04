package com.app.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.base.BaseClass;

public class ParallelExe3 extends BaseClass {

	@BeforeTest
	public void beforeTest() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("BeforeTest");

	}

	@Test
	public void test121() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test121");
	}

	@AfterTest
	public void afterTest() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("AfterTest");
	}

}
