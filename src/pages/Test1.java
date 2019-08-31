package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;

public class Test1 {


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
	Assert.assertTrue(new MainPage(driver).getObjects().size() >=20);
	
    List<WebElement> text = driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
    for (WebElement i : text) {
        Assert.assertTrue(i.getText().toLowerCase().contains("items"));
 
    }
}
}
