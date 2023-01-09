package HomePages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Footers {

	WebDriver driver;

	public Footers(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//div[contains(text(),'Appliances')]")
	WebElement appliance;

	public void click_appliance() {
		appliance.click();

	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[7]/a/div[1]/div/img")
	WebElement tv;

	public void click_tv() {
		tv.click();
	}

	// Footers
	@FindBy(xpath = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[4]/a[1]")
	WebElement Facebook;

	@FindBy(xpath = "//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[4]/a[2]")
	WebElement Twitter;
	@FindBy(xpath = "//a[contains(text(),'YouTube')]")
	WebElement Youtube;

	public void click_Facebook() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		Facebook.click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title:-" + title);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Flipkart - Home | Facebook";
		Assert.assertEquals(ActualTitle, ExpectedTitle);

		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

//        jse.executeScript("window.scrollBy(0,400)","");
//        Twitter.click();
//        driver.navigate().back();
//        jse.executeScript("window.scrollBy(0,800)","");
//        Youtube.click();
//        driver.navigate().back();

	}

	public void click_Twitter() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		Twitter.click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title:-" + title);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Flipkart (@Flipkart) / Twitter";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);

	}

	public void click_Youtube() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		Youtube.click();
		Thread.sleep(5000);

		String title = driver.getTitle();
		System.out.println("Title:-" + title);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Flipkart - YouTube";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		driver.navigate().back();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// FaQ
	@FindBy(xpath = "//a[contains(text(),'FAQ')]")
	WebElement faq;

	public void click_Faq() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		faq.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FindBy(css = "div.sCqFh3 div._6fNwiK div._1EQH8l div.row:nth-child(2) div._1uOGFj div._3E8aIl.JxeTOV div:nth-child(2) div:nth-child(2) div._1LJS6T.v2w0ha._3v1CTV div._2NKhZn > p:nth-child(1)")
	WebElement sameLink;

	public void click_sameLink() throws InterruptedException {
		sameLink.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	WebElement yes;

	public void click_yes() throws InterruptedException {
		yes.click();
		Thread.sleep(5000);
	}

	// cancelation
	@FindBy(xpath = "//a[contains(text(),'Cancellation & Returns')]")
	WebElement cancel;

	public void click_Cancel() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
		cancel.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FindBy(xpath = "//p[contains(text(),'If I request for a replacement, when will I get it')]")
	WebElement Link;

	public void click_sameLink2() throws InterruptedException {
		Link.click();
		Thread.sleep(5000);
	}

	// giftcard
	@FindBy(xpath = "//span[contains(text(),'Gift Cards')]")
	WebElement giftcard;

	public void click_giftcard() throws InterruptedException {
		giftcard.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[3]/div[1]/a[1]/div[1]/div[1]/img[2]")
	WebElement addToFipkartWallet;

	public void click_addToFipkartWallet() throws InterruptedException {
		addToFipkartWallet.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement ReceiverEmail;

	public void click_ReceiverEmail(String name) {
		ReceiverEmail.sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement ReceiversName;

	public void click_ReceiversName(String name) {
		ReceiversName.sendKeys(name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]")
	WebElement selectOption;

	public void click_selectOption() throws InterruptedException {
		selectOption.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]/option[6]")
	WebElement amountSelected;

	public void click_amountSelected() throws InterruptedException {
		amountSelected.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]")
	WebElement BuyGiftCardBtn;

	public void click_BuyGiftCardBtn() throws InterruptedException {
		BuyGiftCardBtn.click();
		Thread.sleep(5000);
	}
}
