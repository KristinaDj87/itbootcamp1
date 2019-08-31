package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchAndMoreII {

	static WebDriver driver;
	public AdvancedSearchAndMoreII(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	private static WebElement queryBox() {
		return driver.findElement(By.cssSelector("#rawform > input:nth-child(2)"));
	}
	private static WebElement fieldsToReturn() {
		return driver.findElement(By.name("fl[]"));
	}	
	private static WebElement sortResult1Dropdown() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > select:nth-child(2)"));
	}
	
	private static WebElement sortResult2() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > select:nth-child(4)"));
	}
	
	private static WebElement sortResult3() {
		return driver.findElement(By.cssSelector("#rawform > div:nth-child(5) > select:nth-child(6)"));
	}
	
	private static WebElement numberOfResults() {
		return driver.findElement(By.cssSelector("input#numresults"));
	}
	private static WebElement page() {
		return driver.findElement(By.cssSelector("input.form-control input-sm pull-right"));
	}
	private static List<WebElement> boxSelect() {
		return driver.findElements(By.name("output"));
	}
	
	private static WebElement xmlBox() {
		return driver.findElement(By.name("save"));
	}
	
	private static WebElement showHideHelp() {
		return driver.findElement(By.cssSelector(".table > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(1) > a:nth-child(2)"));
	}	
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("input.btn btn-primary"));
	}
	
	public void fieldsToReturn(String search) {
        Select dropDown = new Select(fieldsToReturn());
        dropDown.selectByVisibleText(search);
    }
	public void sortResult1Dropdown(String search) {
        Select dropDown = new Select(sortResult1Dropdown());
        dropDown.selectByVisibleText(search);
    }
	public void sortResult2(String search) {
        Select dropDown = new Select(sortResult2());
        dropDown.selectByVisibleText(search);
    }
	public void sortResult3(String search) {
        Select dropDown = new Select(sortResult3());
        dropDown.selectByVisibleText(search);
    }
}
