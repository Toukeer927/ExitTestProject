package HomePages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grocery {
	WebDriver driver;

	public Grocery(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]")
	WebElement Grocery;

	public void click_Grocery() throws InterruptedException {
		Grocery.click();
		Thread.sleep(4000);
	}

	@FindBy(name = "pincode")
	WebElement pin;

	public void send_pin(String name) {
		pin.sendKeys(name);
		pin.sendKeys(Keys.RETURN);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@FindBy(linkText = "Ghee & Oils")
	WebElement GheeAndoil;

	public void click_Ghee() throws InterruptedException {
		GheeAndoil.click();
		Thread.sleep(4000);
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[2]/span[1]")
	WebElement addItem;

	public void click_addItem() throws InterruptedException {
		addItem.click();
		Thread.sleep(2000);
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/button[2]/span[1]")
	WebElement addItem2;

	public void click_addItem2() throws InterruptedException {
		addItem2.click();
		Thread.sleep(4000);
	}

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[2]/span[1]")
	WebElement basket;

	public void click_Basket() throws InterruptedException {
		basket.click();
		Thread.sleep(4000);

	}

	@FindBy(xpath = "//button[contains(text(),'✕')]")
	WebElement exitbtn;

	public void click_Exitbtn() throws InterruptedException {
		exitbtn.click();
		Thread.sleep(4000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]")
	WebElement cart;

	public void click_cart() throws InterruptedException {
		cart.click();
		Thread.sleep(4000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/form[1]/button[1]")
	WebElement placeOrder;

	public void click_placeOrder() throws InterruptedException {
		placeOrder.click();
		Thread.sleep(4000);
	}

}
