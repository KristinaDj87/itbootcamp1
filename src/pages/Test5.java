package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Test5 {
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				 "C:\\Users\\Kristina\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
@Test
public void pages() throws Exception{
	
	driver.navigate().to(URLPages.HOME_PAGE);
	new NavigationMenu2(driver).clickUpload();
	String text = "Log in or Sign up";
	WebElement txt = driver.findElement(By.cssSelector(".container > p:nth-child(1) > b:nth-child(5)"));
	Assert.assertTrue(txt.getText().contains(text));
}
}