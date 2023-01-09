package HomePages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigator {

	WebDriver driver;

	public Navigator(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[3]/*[1]")
	WebElement rightClick;

	public void click_rightClick() throws InterruptedException {
		Thread.sleep(2000);
		rightClick.click();
		

	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[2]")
	WebElement leftClick;

	public void click_leftClick() throws InterruptedException {
		Thread.sleep(2000);
		leftClick.click();

	}

}
