package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage {

static WebDriver driver;
	
	public DonatePage(WebDriver driver) {
		
		this.driver = driver;
	}
	//elements
	private static List<WebElement> amount() {
        return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel label span.hit-area"));
    }
    
    private static WebElement otherAmount() {
        return driver.findElement(By.cssSelector("input#amount_custom"));
    }
    
    //actions
    public List<WebElement> getAmount() {
		return amount();
	}
    public void clickAmount(Integer amount) {
    	getAmount().get(amount).click();
    }
    
	public void clickOtherAmount() {
		otherAmount().click();
	}
	public void sendToOtherAmount(String custom_amount) {
		otherAmount().sendKeys(custom_amount);
	}
	
}