package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {

	static WebDriver driver;
	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//elements
	private static List<WebElement> newsElements() {
		return driver.findElements(By.cssSelector("div.box a"));
	}
	private static WebElement newsMore() {
		return driver.findElement(By.cssSelector(".box > h1:nth-child(1) > a:nth-child(1)"));
	}
	
	//actions
	
	public List<WebElement> getNewsElements() {
		return newsElements();
	}
	public void sizeNewsElements() {
		getNewsElements().size();
	}
	public void clickNewsMore() {
		newsMore().click();
	}
}
