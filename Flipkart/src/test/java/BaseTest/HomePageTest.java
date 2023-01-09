package BaseTest;

import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import ExcelReport.ExcelManager;
import HomePages.Footers;
import HomePages.HomePage;
import log.GenerateLogs;

public class HomePageTest extends BasePage {
	public static String sheetName = "Sheet1";
	Logger log = Logger.getLogger(GenerateLogs.class);

	@Test(priority = 1)
	public void LoginTest() throws InterruptedException {

		HomePage h = new HomePage(driver);

		String testname = "Login";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);

		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		// driver.get(ReadPropertyFile.getProperty("url"));

		h.click_loginbtn();
		log.info("Click login Button successfully");
		h.send("mohd@gmail.com");
		log.info("Email entered successfully");
		h.loginButton();
		log.info("Email entered successfully");

		h.CrossButton();
		log.info("hit cross button sucessfully");

	}

	@Test(priority = 2)
	public void searchMobile() throws InterruptedException {
		HomePage h = new HomePage(driver);
		String testname = "Search_Mobile";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		// Logger log = Logger.getLogger(GenerateLogs.class);

		h.Mobile();
		log.info("click on mobile ");

		h.searchForclick();
		log.info("click on Search Section ");
		h.searchForMobile("Iphone14");
		log.info("I phone searched");

//	h.clickForSearch();
		h.click_iphone();
		log.info("clicked on i phone button");
		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String) it.next();

		String childid = (String) it.next();

		driver.switchTo().window(childid);
		h.click_imgclick();
		log.info("clicked on image ");
		Thread.sleep(4000);
		h.click_imgclick1();
		log.info("clicked on image ");

	}
//	h.click_electronic();
//	h.click_appliance();

//	
//	
//	h.click_topOffer();
//	h.click_toy();
	@Test(priority = 3)
	public void compareProduct() throws InterruptedException {
		HomePage h = new HomePage(driver);
		String testname = "Compare_Product";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		// Logger log = Logger.getLogger(GenerateLogs.class);
		h.searchForclick();
		log.info("click on Search Section ");
		h.searchForMobile("Iphone14");
		log.info("I phone searched");

//		h.clickForSearch();
		h.click_iphone();
		log.info("clicked on i phone button");
		Set<String> handle = driver.getWindowHandles();
		Iterator it = handle.iterator();
		String parentid = (String) it.next();

		String childid = (String) it.next();

		driver.switchTo().window(childid);
		h.click_imgclick();
		log.info("clicked on image ");

		h.click_imgclick1();
		log.info("clicked on image ");

		//
		//

		h.click_AddCompare();
		log.info("clicked on Add Compare ");

		h.click_Comparebtn();
		log.info("clicked on Compare Button ");

		h.click_chooseBrand();
		log.info("clicked on Brand ");

		h.click_chooseBrandclcik();
		log.info("Clicked on Choose Brand Name");
		h.click_chooseProduct();
		log.info("Clicked on Choose Product");
		h.click_chooseProductclick();
		log.info("Clicked on Product Name ");

		driver.close();
		driver.switchTo().window(parentid);

	}

}
