package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	public static final Integer I = 0;
	public static final Integer LINKS_BUTTONS = 1;


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
	new NavigationMenu2(driver).clickTexts();
	new NavigationMenu1(driver).clickFeatured2(I);
	Thread.sleep(2000);
	String url = driver.getCurrentUrl(); 
	Thread.sleep(2000);
	new NavigationMenu2(driver).clickLogo();
	new MainPage(driver).clickLinksButtons(LINKS_BUTTONS);
	Thread.sleep(2000);
	Assert.assertTrue(driver.getCurrentUrl().equals(url));
	}
}

