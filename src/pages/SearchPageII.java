package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPageII {

	static WebDriver driver;
	public SearchPageII(WebDriver driver) {
		this.driver = driver;
	}

	private static List<WebElement> allObjects() {
		return driver.findElements(By.cssSelector("div.C234 div.tile-img"));
	}
	
	public List<WebElement> getAllObjects() {
		return allObjects();
	}
}
