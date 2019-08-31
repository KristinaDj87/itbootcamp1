package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationMenu1 {

	static WebDriver driver;
	
	public NavigationMenu1(WebDriver driver) {
		this.driver = driver;
	}
	
	//elements
	//1 icon
	private static WebElement wayBack() {
		return driver.findElement(By.cssSelector(".col-sm-6"));
	}
	public static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
	}
	public static WebElement webPages() {
		return driver.findElement(By.cssSelector(".wayback-txt > a:nth-child(1)"));
	}
	//2 icon
	private static WebElement logoBooks() {
		return driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement books() {
		return driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}
	private static WebElement logoLibrary() {
		return driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement openLibrary() {
		return driver.findElement(By.cssSelector("div.row:nth-child(2) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}

	
	//lists for 2 icon
	private static List<WebElement> featured2() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	private static List<WebElement> top2() {
		return driver.findElements(By.cssSelector("div.row:nth-child(2) div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	private static List<WebElement> other2() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.texts div.linx.linx-topped a"));
	}
	
	
	//3 icon
	private static WebElement logoNews() {
		return driver.findElement(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement tvNews() {
		return driver.findElement(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}
	private static WebElement logoUnderstanding() {
		return driver.findElement(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement understanding() {
		return driver.findElement(By.cssSelector("div.toprow:nth-child(3) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}
	//lists for 3 icon
	private static List<WebElement> featured3() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	private static List<WebElement> top3() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7.col-sm-push-2 div.linx  a"));
	}
	private static List<WebElement> other3() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.movies div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	
	//4 icon
	private static WebElement logoMusic() {
		return driver.findElement(By.cssSelector("div.row:nth-child(4) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement liveMusic() {
		return driver.findElement(By.cssSelector("div.row:nth-child(4) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}
	private static WebElement logoVox() {
		return driver.findElement(By.cssSelector("div.row:nth-child(4) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement libriVox() {
		return driver.findElement(By.cssSelector("div.row:nth-child(4) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}
	//lists for 4 icon
	private List<WebElement> featured4() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	private List<WebElement> top4() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	private List<WebElement> other4() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.audio div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	//5 icon
	private static WebElement logoInternet() {
		return driver.findElement(By.cssSelector("div.row:nth-child(5) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement internet() {
		return driver.findElement(By.cssSelector("div.row:nth-child(5) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}
	private static WebElement logoRoom() {
		return driver.findElement(By.cssSelector("div.row:nth-child(5) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement room() {
		return driver.findElement(By.cssSelector("div.row:nth-child(5) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}
	//lists for 5 icon
	private List<WebElement> featured5() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-4 div.linx a"));
	}
	private List<WebElement> top5() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	private List<WebElement> other5() {
		return driver.findElements(By.cssSelector("div.row.toprow.fivecolumns.software div.col-sm-2.col-xs-7 div.linx.linx-topped a"));
	}
	//6 icon
	private static WebElement logoMetropolitan() {
		return driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement metropolitan() {
		return driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(2) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}	
	private static WebElement logoBrooklyn() {
		return driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > div:nth-child(1) > a:nth-child(1)"));
	}
	private static WebElement brooklyn() {
		return driver.findElement(By.cssSelector("div.row:nth-child(6) > div:nth-child(4) > div:nth-child(1) > center:nth-child(1) > a:nth-child(2)"));
	}
	//lists for 6
	private static List<WebElement> featured6() {
		return driver.findElements(By.cssSelector("div.rowtoprowfivecolumnsimage div.col-sm-2.col-xs-7 div.col-sm-push-4 div.linx a"));
	}
	private static List<WebElement> top6() {
		return driver.findElements(By.cssSelector("div.rowtoprowfivecolumnsimage div.col-sm-2.col-xs-7.col-sm-push-2 div.linx a"));
	}
	
	
	
		//actions
	//1	icon
	public void clickWayBack() {
		wayBack().click();
	}
	public void inputSearchBox(String searchTerm) {
		searchBox().sendKeys(searchTerm);
		searchBox().sendKeys(Keys.ENTER);
	}
	public void clickWebPages() {
		webPages().click();
	}
	
	//2 icon
	public void clickLogoBooks() {
		logoBooks().click();
	}
	public void clickBooks() {
		books().click();
	}
	public void clickLogoLibrary() {
		logoLibrary().click();
	}
	public void clickOpenLibrary() {
		openLibrary().click();
	}
	
	
	// get for lists from 2 icon
	public List<WebElement> getFeatured2() {
		return featured2();
	}
	 public void clickFeatured2(Integer i) {
	        getFeatured2().get(i).click();
	}
	public List<WebElement> getTop2() {
		return top2();
	}
	public List<WebElement> getOther2() {
		return other2();
	}
	
//3 icon
	public void clickLogoNews() {
		logoNews().click();
	}
	public void clickTvNews() {
		tvNews().click();
	}
	public void clickLogoUnderstanding() {
		logoUnderstanding().click();
	}
	public void clickUnderstanding() {
		understanding().click();
	}
	//get for lists from 3 icon
	private List<WebElement> getFeatured3() {
		return featured3();
	}
	private List<WebElement> getTop3() {
		return top3();
	}
	private List<WebElement> getother3() {
		return other3();
	}
	
	//4 icon
	public void clickLogoMusic() {
		logoMusic().click();
	}
	public void clickLiveMusic() {
		liveMusic().click();
	}
	public void clickLogoVox() {
		logoVox().click();
	}
	public void clickLibriVox() {
		libriVox().click();
	}
	//get for lists from 4 icon
	public List<WebElement> getFeatured4() {
		return featured4();
	}
	public List<WebElement> getTop4() {
		return top4();
	}
	public List<WebElement> getOther4() {
		return other4();
	}
	//5
	public void clickLogoInternet() {
		logoInternet().click();
	}
	public void clickInternet() {
		internet().click();
	}
	public void clickLogoRoom() {
		logoRoom().click();
	}
	public void clickRoom() {
		room().click();
	}
	//get for lists from 5
	public List<WebElement> getFeatured5() {
		return featured5();
	}
	public List<WebElement> getTop5() {
		return top5();
	}
	public List<WebElement> getOther5() {
		return other5();
	}
	//6
	public void clickLogoMetropolitan() {
		logoMetropolitan().click();
	}
	public void clickMetropolitan() {
		metropolitan().click();
	}
	public void clickLogoBrooklyn() {
		logoBrooklyn().click();
	}
	public void clickBrooklyn() {
		brooklyn().click();
	}
	//get for lists from 6 icon
	public List<WebElement> getFeatured6() {
		return featured6();
	}
	public List<WebElement> getTop6() {
		return top6();
	}
}
	