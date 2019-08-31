package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {

static WebDriver driver;
	
	public HelpPage(WebDriver driver) {
		
		this.driver = driver;
	}
	//elements
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#query"));
	}
	private static List<WebElement> helpButtons() {
        return driver.findElements(By.cssSelector("li.blocks-item a"));
    }
	private static WebElement signIn() {
		return driver.findElement(By.cssSelector(".login"));
	}
	
	//actions
	public void inputSearchBox(String searchTerm) {
		searchBox().sendKeys(searchTerm);
		searchBox().sendKeys(Keys.ENTER);
	}
	public List<WebElement> getHelpButtons() {
		return helpButtons();
	}
	public void clickHelpButtons(Integer help_buttons) {
		getHelpButtons().get(help_buttons).click();
	}
	public void clickSignIn() {
		signIn().click();
	}
}
