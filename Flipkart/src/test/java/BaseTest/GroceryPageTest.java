package BaseTest;

import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import ExcelReport.ExcelManager;
import HomePages.Footers;
import HomePages.Grocery;
import log.GenerateLogs;

public class GroceryPageTest extends BasePage {
	public static String sheetName = "Sheet1";

	@Test(priority = 1)
	public void Grocery() throws InterruptedException {
		Grocery g = new Grocery(driver);

		String testname = "Grocery";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		// Logger log = Logger.getLogger(GenerateLogs.class);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		log.info("Grocery Test case started");
		g.click_Grocery();
		log.info("clicked on Grocery");

		g.send_pin("226016");
		log.info("pin entered");

		g.click_Ghee();
		log.info("gee selected");

		g.click_addItem();
		log.info("Item is added");

		g.click_addItem2();
		log.info("Item is added");

		g.click_Basket();
		log.info("clicked on baskedt button");
		g.click_Exitbtn();
		log.info("clicked on exit Button");
		log.info("grocery Test case pass");

	}

	@Test(priority = 2)
	public void Cart() throws InterruptedException {
		Grocery g = new Grocery(driver);
		log.info("cart case started");

		String testname = "Cart";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		g.click_cart();
		log.info("clicked on cart Button");

		g.click_placeOrder();
		log.info("clicked on Place Order");
		log.info("cart case is done sucessfully");
	}

}
