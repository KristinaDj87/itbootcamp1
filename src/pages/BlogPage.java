package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {


	static WebDriver driver;
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	private static List<WebElement> navigationMenu() {
		return driver.findElements(By.cssSelector("#access"));
	}
	private static List<WebElement> fbTwiter() {
		return driver.findElements(By.cssSelector("div.archive-sharing-widget a"));
	}
	private static WebElement dropdownArchive() {
		return driver.findElement(By.cssSelector("#archives-dropdown-2"));
	}
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#s"));
	}
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("#searchsubmit"));
	}
	private static List<WebElement> searchElements() {
	    return driver.findElements(By.cssSelector("div#content div.post.type-post.status-publish.format-standard"));
	}
	
	
	
	
	//actions
	public List<WebElement> getNavigationMenu() {
		return navigationMenu();
	}
	public void clickNavigationMenu(Integer nav_menu) {
		getNavigationMenu().get(nav_menu).click();
	}
	public List<WebElement> getFbTwiter() {
		return fbTwiter();
	}
	public void clickFbTwitter(Integer fb_twitter) {
		getFbTwiter().get(fb_twitter).click();
	}
	
	public void dropdownArchive(String month_year) {
        Select dropArchive = new Select(dropdownArchive());
        dropArchive.selectByVisibleText(month_year);
    }
	
	public void inputSearchBox(String searchBlog) {
		searchBox().sendKeys(searchBlog);
	}
	public void clickSearchButton() {
		searchButton();
	}
	public List<WebElement> getSearchElements() {
		return searchElements();
	}
}
