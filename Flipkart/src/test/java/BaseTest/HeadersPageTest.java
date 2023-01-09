package BaseTest;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.v103.browser.Browser;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import ExcelReport.ExcelManager;
import HomePages.Headers;

public class HeadersPageTest extends BasePage {
	public static String sheetName = "Sheet1";

	@Test(priority = 1)
	public void headersTest() throws InterruptedException {
		Headers h = new Headers(driver);
		// driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		String testname = "headersTest";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		log.info("Header case started");

		h.click_Men();

	}

	@Test(priority = 2)
	public void electronic() throws InterruptedException {
		Headers h = new Headers(driver);
		String testname = "electronic";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);

		h.click_logo();
        log.info("clicked on Logo");
		h.click_audio();
		 log.info("clicked on audio");

	}

	@Test(priority = 3)
	public void offer() throws InterruptedException {
		Headers h = new Headers(driver);
		String testname = "offer";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		h.click_logo();
		 log.info("clicked on Logo");

		h.click_offer();
		 log.info("clicked on audio");

	}

	@Test(priority = 4)
	public void beauty() throws InterruptedException {
		Headers h = new Headers(driver);
		String testname = "beauty";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		h.click_logo();
		 log.info("clicked on Logo");

		h.click_beauty();
		 log.info("clicked on beauty");
	}

	@Test(priority = 5)
	public void TwoWhellers() throws InterruptedException {
		Headers h = new Headers(driver);
		String testname = "TwoWhellers";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		h.click_logo();
		 log.info("clicked on Logo");
		h.click_vehicel();
		 log.info("clicked on vehicel");

		h.click_logo();

	}

	@Test(priority = 6)
	public void BecameSeller() throws InterruptedException {
		Headers h = new Headers(driver);
		String testname = "BecameSeller";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		h.click_logo();
		h.click_becameASeller();
		 log.info("clicked on Became A Seller");
		
		h.click_enterNumber("9090919192");
		 log.info("Enter Number sucessfully");
		h.click_sellingbtn();
		 log.info("clicked seller Button");
		h.click_sellerEmail("admin12@gmail.com");
		 log.info("clicked on Seller Email");
		h.click_enterGst("18AABCU9603R1ZM");
		log.info("Enter Gst Number sucessfully");
		h.click_registerbtn();
		log.info("Clicked on Register Button");
		log.info("Header Test Pass");

	}

}
