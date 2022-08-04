package com.app.testng;

public class Parallel {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		b.start(); 
		a.test1(); 
								
	}

}

class A {

	public void test1() {
		System.out.println(Thread.currentThread().getId());
		for (int i = 0; i <= 3; i++) {
			System.out.println("test1");
		}
	}

}

class B  extends Thread{
	// run() start()
	
	public void run() {
		System.out.println(Thread.currentThread().getId());
		for (int i = 0; i <= 3; i++) {
			System.out.println("test2");
		}
	}

}
