package pages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {
	
	public static final String ARCHIVE_SEARCH = "qa";
	public static final String SEARCH = "?query=qa";
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				 "C:\\Users\\Kristina\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
@Test
public void pages() throws Exception{
	//
	driver.navigate().to(URLPages.HOME_PAGE);
	boolean obj = driver.findElement(By.cssSelector("#search_options")).isDisplayed();
	Thread.sleep(2000);
	Assert.assertTrue(obj, "dropDown is not visible");
	Thread.sleep(2000);
	new MainPage(driver).inputTextSearchBar(ARCHIVE_SEARCH);
	new MainPage(driver).clickGoButton();
	Assert.assertTrue(driver.getCurrentUrl().contains(SEARCH));
	
}
}