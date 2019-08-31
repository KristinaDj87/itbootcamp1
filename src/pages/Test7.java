package pages;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class Test7 {
		
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
	
	Assert.assertTrue(new LogInII(driver).getForgotPassword().isDisplayed());
	Thread.sleep(2000);
	new LogInII(driver).clickSignUpForFree();
	new LogInII(driver).clickTermsOfService();
	Thread.sleep(2000);
    new LogInII(driver).switchToNextWindow();

    Assert.assertTrue(driver.getCurrentUrl().contains("terms"));

	}
}
