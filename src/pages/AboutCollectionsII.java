package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutCollectionsII {
	static WebDriver driver;
	public AboutCollectionsII(WebDriver driver) {
		this.driver = driver;
	}
	
	private static List<WebElement> additionalContributors() {
		return driver.findElements(By.cssSelector("div.items_list.person"));
	}
	private static List<WebElement> graphStatistics() {
		return driver.findElements(By.cssSelector("div.grafs"));
	}
	private static List<WebElement> relatedCollections() {
		return driver.findElements(By.cssSelector("div.about-box div div:not(:nth-child(1)).topinblock"));
	}
	private static List<WebElement> tableTopRegions() {
		return driver.findElements(By.cssSelector("table.stats-table tbody tr"));
	}
	
}
