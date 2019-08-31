package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPageII {

	static WebDriver driver;
	public UploadPageII(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector("span.hidden-xs-span:nth-child(3)"));
	}
	private static WebElement uploadFiles() {
		return driver.findElement(By.cssSelector("a.buttonG.btn.btn-success"));
	}
	private static WebElement questionMark() {
		return driver.findElement(By.cssSelector(".iconochive-question-dark"));
	}
	//actions
	public void clickUploadButton() {
		uploadButton().click();
	}
	public void clickUploadFiles() {
		uploadFiles().click();
	}
	public void clickQuestionMark() {
		questionMark();
	}
	
}
