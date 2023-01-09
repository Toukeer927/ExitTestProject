package BaseTest;

import java.util.HashMap;

import org.testng.annotations.Test;

import BasePackage.BasePage;
import ExcelReport.ExcelManager;
import HomePages.Navigator;

public class NavigatorTest extends BasePage {
	public static String sheetName = "Sheet1";

	@Test(priority = 1)
	public void Rightnavigate() throws InterruptedException {

		Navigator n = new Navigator(driver);
		String testname = "Rightnavigate";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		n.click_rightClick();
		log.info("Clicked on Right");
	}

	@Test(priority = 2)
	public void leftNavigate() throws InterruptedException {
		Navigator n = new Navigator(driver);
		String testname = "leftNavigate";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		n.click_leftClick();
		log.info("Clicked on Left");
	}

}
