package com.app.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	public static ExtentHtmlReporter reporter; 
	public static ExtentReports extent;

	public static WebDriver driver;
	@BeforeClass
	public static void brwserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yuvaraj\\eclipse-workspace\\Proect_Class_Apr\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		reporter = new ExtentHtmlReporter("./automationreprt.html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
	
	@Before
	public void before() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void after() {
		extent.flush();
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static WebElement findElementById(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement findElementByname(String name) {
		return driver.findElement(By.name(name));
	}

	public static WebElement findElementByxpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	// abstract method
	public static WebElement findElementBy(By by) {
		return driver.findElement(by);
	}

	public static void typeData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void press(WebElement element) {
		element.click();
	}

	public static void dropDownindex(WebElement element, int values) {
		Select s = new Select(element);
		s.selectByIndex(values);
	}

	public static void dropDownvalue(WebElement element, String values) {
		Select s = new Select(element);
		s.selectByValue(values);
	}

	public static void movetoElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static String getAttribute(WebElement element, String... attribute) {
		String text = attribute.length < 1 ? "value" : attribute[0];
		String attributevalue = null;
		try {
			attributevalue = text;
		} catch (NullPointerException e) {
			throw new RuntimeException("Warning : Failure detected when requesting the element property:value");
		}
		return attributevalue;
	}
	@AfterClass
	public static void screenShot() {

		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,
					new File("location" + new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date()) + ".jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void impwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static void expwait(WebElement element) {
		WebDriverWait exp = new WebDriverWait(driver, 10);
		exp.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void exetime() {
		Date date = new Date();
		System.out.println(date);
	}

	public void afterreport() {

	}

	public static String excelRead(int r, int c) {
		String value = null;
		try {
			File f = new File("C:\\Users\\Yuvaraj\\eclipse-workspace\\Proect_Class_Apr"
					+ "\\src\\test\\resources\\TestData\\Test_Excel.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			// excel row size
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			// System.out.println(cell);
			// to identify the testdata type
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
				System.out.println(value);
				// date and number seprate
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sc = new SimpleDateFormat("dd-MM-yyyy");
					value = sc.format(dateCellValue);
					System.out.println(value);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
					System.out.println(value);

				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}

}
