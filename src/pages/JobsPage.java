package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {

	static WebDriver driver;
	public JobsPage(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#q"));
	}
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("a#btn_search_jobs"));
	}
	private static WebElement advanced() {
		return driver.findElement(By.cssSelector("a#link_show_advanced_search span"));
	}
	private static List<WebElement> generateList() {
		return driver.findElements(By.cssSelector("table#jobs_table tr a"));
	}

	//actions

	public void inputSearchBox(String jobs_search) {
		searchBox().sendKeys(jobs_search);
	}
	public void clickSearchButton() {
		searchButton().click();
	}
	public void clickAdvanced() {
		advanced().click();
	}
	public List<WebElement> getGenerateList() {
		return generateList();
	}
	public void sizeGenerateList() {
		getGenerateList().size();
	}
	public void checkGenerateList(Integer job_list) {
		getGenerateList().get(job_list).click();
	}
}
