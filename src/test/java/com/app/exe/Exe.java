package com.app.exe;

import org.junit.Test;

import com.app.base.BaseClass;
import com.app.pageexe.SearchHotel_PageExe;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Exe extends SearchHotel_PageExe {
	
	@Test
	public void test1() {
		ExtentTest logger = extent.createTest("Adactin Hotel Booking");
		logger.log(Status.PASS, "Login and Booking page");
	BaseClass.url("https://adactinhotelapp.com/");
	username();
	password();
	clickLoginButton();
	location();
		
	}
}
