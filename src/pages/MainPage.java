package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	static WebDriver driver;
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
    // Elements
	
	private static List<WebElement> objects() {
		return driver.findElements(By.cssSelector("div.C234"));
	}
	
	//internet archive floater
	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("input.form-control:nth-child(2)"));
	}
	private static List<WebElement> linksButtons() {
		return driver.findElements(By.cssSelector("div.mt-big"));
	}
	private static WebElement goButton() {
		return driver.findElement(By.cssSelector("button.btn"));
	}
	private static WebElement searchLink() {
		return driver.findElement(By.cssSelector(".search-options__advanced-search-link"));
	}
	private static WebElement seeMore() {
		return driver.findElement(By.cssSelector("div.pull-right a"));
	}
	//actions
	
	public List<WebElement> getObjects() {
		return objects();
	}
	public void clickObjects(Integer objects) {
		objects().get(objects).click();
	}
	public void inputTextSearchBar(String archive_search) {
		searchBar().sendKeys(archive_search);
	}
	public List<WebElement> getLinksButtons() {
		return linksButtons();
	}
	public void clickLinksButtons(Integer links_buttons) {
		getLinksButtons().get(links_buttons).click();
	}
	public void clickGoButton() {
		goButton().click();
	}
	public void clickSearchLink() {
		searchLink().click();
	}
	public void clickSeeMore() {
		seeMore().click();
	}
	
}
