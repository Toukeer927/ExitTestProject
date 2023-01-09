package BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import HomePages.HomePage;

public class VerifyTitlePage extends BasePage {
	@Test
	public void verifyTitle() throws InterruptedException {
		HomePage h=new HomePage(driver);
		h.CrossButton();
		String title = driver.getTitle();
		System.out.println("Title:-" + title);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		log.info("Page Title is verified");
	}

}
