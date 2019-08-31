package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoreNewsII {

	static WebDriver driver;
	public MoreNewsII(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	private static List<WebElement> moreNews() {
		return driver.findElements(By.cssSelector(".forumTable"));
	}
	private static WebElement mailIcon() {
		return driver.findElement(By.cssSelector(".iconochive-email"));
	}
	//elements
	public List<WebElement> getMoreNews() {
		return moreNews();
	}
	public void clickMailIcon() {
		mailIcon().click();
	}
}
