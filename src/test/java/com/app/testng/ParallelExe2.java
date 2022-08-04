package com.app.testng;

import org.testng.annotations.Test;

public class ParallelExe2 {
	
	@Test
	public void test121() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test121");
	}
	
	@Test
	public void test131() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test131");
	}
	
	
	@Test
	public void test141() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test10141");
	}
	
	@Test
	public void test15() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test115");
	}
	
	@Test
	public void test12() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test12");
	}

	
	@Test
	public void test13() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test13");
	}

	
	@Test
	public void test14() {
		System.out.println(Thread.currentThread().getId());
		System.out.println("test14");
	}


	
	

}
