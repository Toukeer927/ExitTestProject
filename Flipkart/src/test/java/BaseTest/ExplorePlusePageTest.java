package BaseTest;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import ExcelReport.ExcelManager;
import HomePages.ExplorePlusPage;

public class ExplorePlusePageTest extends BasePage {
	public static String sheetName = "Sheet1";

	@Test(priority = 1)
	public void ExplorePlus() throws InterruptedException {
		ExplorePlusPage e = new ExplorePlusPage(driver);
		String testname = "Explore_plus";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);

		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		log.info("ExplorePlus case Started");

		e.click_ExplorePlus();

		e.click_MyCoinBalance();
		log.info("ExplorePlus Test Pass");

	}

	@Test(priority = 2)
	public void ExplorePlus1() throws InterruptedException {
		ExplorePlusPage e = new ExplorePlusPage(driver);
		String testname = "Explore_Plus1";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		log.info("ExplorePlus1 case Started");

		e.click_ExplorePlus();

		e.click_MyRewardStore();

		e.click_viewCoinActivity();
		log.info("ExplorePlus Test Pass");

	}

}
