package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu3 {    
	
	static WebDriver driver;
	
	public NavigationMenu3(WebDriver driver) {
		this.driver = driver;
	}
    // Elements
    
    private static WebElement about() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(1) a"));
    }
    private static WebElement contact() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(2) a"));
    }
    private static WebElement blog() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(3) a"));
    }
    private static WebElement projects() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(4) a"));
    }
    private static WebElement help() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(5) a"));
    }
    private static WebElement donate() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(6) a"));
    }
    private static WebElement jobs() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(7) a"));
    }
    private static WebElement volunteer() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(8) a"));
    }
    private static WebElement people() {
        return driver.findElement(By.cssSelector("#nav-abouts li:nth-child(9) a"));
    }
 // Actions
    
    public void clickAbout() {
        about().click();
    }
    public void clickContact() {
        contact().click();
    }
    public void clickBlog() {
        blog().click();
    }
    public void clickProjects() {
        projects().click();
    }
    public void clickHelp() {
        help().click();
    }
    public void clickDonate() {
        donate().click();
    }
    public void clickJobs() {
        jobs().click();
    }
    public void clickVolunteer() {
        volunteer().click();
    }
    public void clickPeople() {
        people().click();
    }
}