package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu2 {

	static WebDriver driver;
	
	public NavigationMenu2(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	private static List<WebElement> icons() {
		return driver.findElements(By.cssSelector("li.dropdown.dropdown-ia.pull-left a"));
	}
	private static WebElement web() {
		return driver.findElement(By.cssSelector("a.web > span:nth-child(1)"));
	}
	private static WebElement texts() {
		return driver.findElement(By.cssSelector("a.texts > span:nth-child(1)"));
	}
	private static WebElement video() {
		return driver.findElement(By.cssSelector("a.movies > span:nth-child(1)"));
	}
	private static WebElement audio() {
		return driver.findElement(By.cssSelector("a.audio > span:nth-child(1)"));
	}
	private static WebElement software() {
		return driver.findElement(By.cssSelector("a.software > span:nth-child(1)"));
	}
	private static WebElement image() {
		return driver.findElement(By.cssSelector("a.image > span:nth-child(1)"));
	}
	private static WebElement logo() {
		return driver.findElement(By.cssSelector(".navbar-brand > span:nth-child(1)"));
	}
	private static WebElement signIn() {
		return driver.findElement(By.cssSelector(".nav-user"));
	}
	private static WebElement username() {
		return driver.findElement(By.cssSelector("#user-menu > span:nth-child(2)"));
	}
	private static WebElement upload() {
		return driver.findElement(By.cssSelector(".iconochive-upload"));
	}
	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("#search-bar-2"));
	}
	
	
	
	
	//actions
	public List<WebElement> getIcons() {
		return icons();
	}
	public void clickWeb() {
		web().click();
	}
	public void clickTexts() {
		texts().click();
	}
	public void clickVideo() {
		video().click();
	}
	public void clickAudio() {
		audio().click();
	}
	public void clickSoftwer() {
		software().click();
	}
	public void clickImage() {
		image().click();
	}
	public void clickLogo() {
		logo().click();
	}
	public void clickSignIn() {
		signIn().click();
	}
	public void clickUsername() {
		username().click();
	}
	public void clickUpload() {
		upload().click();
	}
	public void clickSearchBar() {
		searchBar().click();
	}
	public void inputSearchBar(String searchTerm) {
		searchBar().sendKeys(searchTerm);
	}
	
	
}
