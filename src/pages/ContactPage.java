package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {


	static WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	private static List<WebElement> maps() {
		return driver.findElements(By.cssSelector("div.col-md-9 img"));
	}
	//actions
	public List<WebElement> getMaps() {
		return maps();
	}
	public void clickMaps(Integer maps) {
		maps().get(maps).click();
	}
}
