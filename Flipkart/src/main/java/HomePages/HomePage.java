package HomePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement loginbtn;

	public void click_loginbtn() {
		loginbtn.click();
	}

	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement NameForLogin;

	public void send(String name) {
		NameForLogin.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		NameForLogin.sendKeys(name);
	}

	@FindBy(xpath = "//button[contains(text(),'Request OTP')]")
	WebElement LoignBtn;

	public void loginButton() throws InterruptedException {
		LoignBtn.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	WebElement CrossBtn;

	public void CrossButton() throws InterruptedException {
		CrossBtn.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[2]")
	WebElement mo;

	public void Mobile() throws InterruptedException {
		mo.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement srcclick;

	public void searchForclick() throws InterruptedException {
		srcclick.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement search;

	public void searchForMobile(String Iphone14) {
		search.sendKeys(Iphone14);
		search.sendKeys(Keys.RETURN);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	WebElement click;

	public void clickForSearch() throws InterruptedException {
		click.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//div[contains(text(),'APPLE iPhone 14 (Purple, 128 GB)')]")
	WebElement select;

	public void click_iphone() throws InterruptedException {
		select.click();
		Thread.sleep(5000);
	}

//
	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/img[1]")
	WebElement imgclick;

	public void click_imgclick() throws InterruptedException {
		imgclick.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/img[1]")
	WebElement imgclick1;

	public void click_imgclick1() throws InterruptedException {
		imgclick1.click();
		Thread.sleep(5000);
	}

//compare
	@FindBy(xpath = "//label[contains(text(),'Compare')]")
	WebElement AddCompare;

	public void click_AddCompare() throws InterruptedException {
		AddCompare.click();
		Thread.sleep(5000);

	}


	@FindBy(xpath = "//span[contains(text(),'COMPARE')]")
	WebElement Comparebtn;

	public void click_Comparebtn() throws InterruptedException {
		Comparebtn.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]")
	WebElement chooseBrand;

	public void click_chooseBrand() throws InterruptedException {
		chooseBrand.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
	WebElement chooseBrandclick;

	public void click_chooseBrandclcik() throws InterruptedException {
		chooseBrandclick.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]")
	WebElement chooseProduct;

	public void click_chooseProduct() throws InterruptedException {
		chooseProduct.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]")
	WebElement chooseProductclick;

	public void click_chooseProductclick() throws InterruptedException {
		chooseProductclick.click();
		Thread.sleep(5000);
	}
}
