package HomePages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplorePlusPage {

	WebDriver driver;

	public ExplorePlusPage(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
	WebElement ExplorePlus;

	public void click_ExplorePlus() {

		ExplorePlus.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[2]")
	WebElement MyCoinBalance;

	public void click_MyCoinBalance() {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		MyCoinBalance.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]/img[2]")
	WebElement MyRewardStore;

	public void click_MyRewardStore() {

		MyRewardStore.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[1]/img[2]")
	WebElement viewCoinActivity;

	public void click_viewCoinActivity() {

		viewCoinActivity.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	
//	@FindBy(xpath="")
//	WebElement ;
//	public void () {
//		
//	}
//	
//	@FindBy(xpath="")
//	WebElement ;
//	public void () {
//		
//	}
//	
//	@FindBy(xpath="")
//	WebElement ;
//	public void () {
//		
//	}

}
