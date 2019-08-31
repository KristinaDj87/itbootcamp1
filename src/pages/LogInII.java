package pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInII {

	static WebDriver driver;
	public LogInII(WebDriver driver) {
		this.driver = driver;
	}
	
	//elements
	
	private static WebElement signUp() {
		return driver.findElement(By.cssSelector("a.nav-user"));
	}
	private static WebElement emailBox() {
		return driver.findElement(By.cssSelector("input.form-element.input-email"));
	}
	private static WebElement passwordBox() {
		return driver.findElement(By.cssSelector("input.form-element.input-password"));
	}
	private static WebElement eyeIcon() {
		return driver.findElement(By.cssSelector("img.password_icon"));
	}
	private static WebElement forgotPassword() {
		return driver.findElement(By.cssSelector("div.password-message a"));
	}
	private static WebElement loggedIn() {
		return driver.findElement(By.cssSelector(".regular"));
	}
	private static WebElement logIn() {
		return driver.findElement(By.cssSelector("input.btn.btn-primary.btn-submit.input-submit"));
	}
	private static WebElement signUpForFree() {
		return driver.findElement(By.cssSelector(".login-header > p:nth-child(3) > a:nth-child(1)"));
	}
	private static WebElement termsOfService() {
		return driver.findElement(By.cssSelector(".terms > a:nth-child(1)"));
	}
	
	//actions
	public void clickSignUp() {
		signUp().click();
	}
	public void clickEmailBox(String EMAIL) {
		emailBox().sendKeys(EMAIL);
	}
	public void clickPasswordBox(String PASS) {
		passwordBox().sendKeys(PASS);
	}
	public void clickEyeIcon() {
		eyeIcon().click();
	}
	public void clickForgotPassword() {
		forgotPassword().click();
	}
	public WebElement getForgotPassword() {
		return forgotPassword();
	}
	public void clickLoggedIn() {
		loggedIn().click();
	}
	public void clickLogIn() {
		logIn().click();
	}
	public void clickSignUpForFree() {
		signUpForFree().click();
	}
	public void clickTermsOfService() {
		termsOfService().click();
	}
	public void switchToNextWindow() {
	       Set<String> windows = driver.getWindowHandles();
	       Iterator<String> window = windows.iterator();
	       while (window.hasNext()) {
	           driver.switchTo().window(window.next());
	       }
}
}
