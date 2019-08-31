package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionPageII {

	static WebDriver driver;
	public CollectionPageII(WebDriver driver) {
		this.driver = driver;
	}
	//elements
	private static List<WebElement> sortList() {
		return driver.findElements(By.cssSelector("span.big-label.blue-pop a:not(.hidden"));
	}
	private static List<WebElement> videoResults() {
		return driver.findElements(By.cssSelector("div.C234 div.ttl"));
	}
	private static List<WebElement> radioButton() {
		return driver.findElements(By.cssSelector(".search-options.js-search-options.is-open input"));
	}
	private static WebElement numbersOfClips() {
		return driver.findElement(By.cssSelector("div.results_count"));
	}
	private static List<WebElement> mediaType() {
		return driver.findElements(By.cssSelector("div.facet_mediatype input"));
	}
	private static WebElement mediaTypeMore() {
		return driver.findElement(By.cssSelector("div.facet_mediatype a"));
	}
	private static List<WebElement> mediaYear() {
		return driver.findElements(By.cssSelector("div.fatable.facet-year input"));
	}
	private static WebElement mediaYearMore() {
		return driver.findElement(By.cssSelector("div.facet_year.collapse a"));
	}
	private static List<WebElement> topicsAndSubjects() {
		return driver.findElements(By.cssSelector("div.fatable.facet-subject input"));
	}
	private static WebElement topicsAndSubjectsMore() {
		return driver.findElement(By.cssSelector("div.facet_subject.collapse a"));
	}
	private static List<WebElement> collection() {
		return driver.findElements(By.cssSelector("div.facet_collection input"));
	}
	private static WebElement collectionMore() {
		return driver.findElement(By.cssSelector(".facet_collection > a:nth-child(2)"));
	}
	private static List<WebElement> creator() {
		return driver.findElements(By.cssSelector("div.fatable.facet-creator input"));
	}
	private static WebElement creatorMore() {
		return driver.findElement(By.cssSelector("div.facet_creator.collapse a"));
	}
	private static List<WebElement> language() {
		return driver.findElements(By.cssSelector("div.fatable.facet-languageSorter input"));
	}
	private static WebElement languageMore() {
		return driver.findElement(By.cssSelector("div.facet_languageSorter.collapse a"));
	}
	private static WebElement searchCollectionBar() {
		return driver.findElement(By.name("and[]"));
}
	private static List<WebElement> playOptions() {
		return driver.findElements(By.cssSelector(".col-xs-1"));
	}
}
