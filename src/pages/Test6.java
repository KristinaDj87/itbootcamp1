package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test6 {
	
	public static final String EMAIL = "foo@gmail.com";
	public static final String PASS = "bar";

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
	
	new LogInII(driver).clickSignUp();
	boolean LogIn = driver.findElement(By.cssSelector(".btn")).isDisplayed();
	Assert.assertTrue(LogIn, "LogIn button is visible");
	Thread.sleep(2000);
	new LogInII(driver).clickEmailBox(EMAIL);
	new LogInII(driver).clickPasswordBox(PASS);
	Thread.sleep(2000);
	new LogInII(driver).clickLogIn();
	Thread.sleep(2000);
	
	String text = "Email address and/or Password incorrect";
	WebElement error = driver.findElement(By.cssSelector("div.password-message"));
	Assert.assertTrue(error.getText().contains(text));
	
	}
}