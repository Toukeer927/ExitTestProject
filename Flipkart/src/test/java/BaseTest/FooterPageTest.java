package BaseTest;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import ExcelReport.ExcelManager;
import HomePages.Footers;
import HomePages.Headers;

public class FooterPageTest extends BasePage {
	public static String sheetName = "Sheet1";

	@Test(priority = 1)
	public void SocialTest() throws InterruptedException {

		Footers F = new Footers(driver);

		String testname = "Social_Test";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);

		F.click_Facebook();

		F.click_Twitter();

		F.click_Youtube();
	}

	@Test(priority = 2)
	public void FaQTest() throws InterruptedException {
		Footers F = new Footers(driver);
		String testname = "FaQ_Test";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);

		F.click_sameLink();

		F.click_yes();
	}

	@Test(priority = 3)
	public void cancel() throws InterruptedException {
		Footers F = new Footers(driver);
		Headers h = new Headers(driver);

		String testname = "cancel";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);

		F.click_Cancel();

		F.click_sameLink2();

		F.click_yes();
		h.click_logo();
	}

	@Test(priority = 4)
	public void giftCard() throws InterruptedException {
		Footers f = new Footers(driver);
		Headers h = new Headers(driver);
		String testname = "giftCard";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);
		f.click_giftcard();

		f.click_addToFipkartWallet();

		f.click_ReceiverEmail("md@gmail.com");

		f.click_ReceiversName("md");

		f.click_selectOption();
		f.click_amountSelected();

		f.click_BuyGiftCardBtn();

		h.click_logo();
	}

}
