package com.app.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	@Parameters({ "username" })
	@Test(priority = 1)
	public void username(String user) {
		System.out.println(user);

	}

	@Parameters({ "password" })
	@Test(priority = 2)
	public void password(String pass) {
		System.out.println(pass);
	}

	@Test(priority = 3)
	public void click() {
		System.out.println("click");
	}

}
