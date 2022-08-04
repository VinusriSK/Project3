package com.app.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.app.base.BaseClass;

public class CrossBrowser extends BaseClass {
	@Parameters ({"browser"})
	@Test
	public void test1(String name) {
		WebDriver driver;

		if (name.equals("ff")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Yuvaraj\\eclipse-workspace\\Proect_Class_Apr\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
		} else if (name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Yuvaraj\\eclipse-workspace\\Proect_Class_Apr\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
		}else {
			System.out.println("nothing matched");
		}

	}

}
