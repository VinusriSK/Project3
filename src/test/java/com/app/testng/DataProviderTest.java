package com.app.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	/*@Test(dataProvider = "data")
	public void test1(String data1,String data2) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\eclipse-workspace\\Proect_Class_Apr\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(data1);
		driver.findElement(By.id("password")).sendKeys(data2);

	}*/
	
	@Test(dataProvider="data",dataProviderClass=DP.class)
	public void test1(String data1,String data2) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\eclipse-workspace\\Proect_Class_Apr\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(data1);
		driver.findElement(By.id("password")).sendKeys(data2);

	}

	/*@DataProvider(name = "data")
	public Object[][] data() {
		return new Object[][] { { "Aiite", "12345" }, { "Tech", "12345" } };

	}*/

}
