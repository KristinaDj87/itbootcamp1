package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage {

	static WebDriver driver;
	
	public ProjectsPage(WebDriver driver) {
		
		this.driver = driver;
	}
	//elements
	private static List<WebElement> allProjects() {
		return driver.findElements(By.cssSelector("div.col-sm-9"));
	}
	//actions
	public List<WebElement> getAllProjects() {
		return allProjects();
	}
	public void sizeAllProjects() {
		getAllProjects().size();
	}
	
}
