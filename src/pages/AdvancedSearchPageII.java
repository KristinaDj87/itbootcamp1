package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchPageII {

	static WebDriver driver;
	public AdvancedSearchPageII(WebDriver driver) {
		this.driver = driver;
	}
	
	//elements
	private static WebElement advancedSearch() {
		return driver.findElement(By.cssSelector("a.search-options__advanced-search-link"));
	}
	private static List<WebElement> customField() {
		return driver.findElements(By.cssSelector("div.col-sm-2 input.form-control.input-sm"));
	}
	private static WebElement containsAnyFieldDropdown() {
		return driver.findElement(By.name("any_type"));
	}
	private static WebElement containsTitleDropdown() {
		return driver.findElement(By.name("title_type"));
	}
	private static WebElement containsCreatorDropdown() {
		return driver.findElement(By.name("creator_type"));
	}
	private static WebElement containsDescriptionDropdown() {
		return driver.findElement(By.name("description_type"));
	}
	private static WebElement isCollectionDropdown() {
		return driver.findElement(By.name("collection_type"));
	}
	private static WebElement isMediatypeDropdown() {
		return driver.findElement(By.name("mediatype_type"));
	}
	private static WebElement allMediatypeDropdown() {
		return driver.findElement(By.name("mediatype_query"));
	}
	private static WebElement contains1Dropdown() {
		return driver.findElement(By.name("optional_field1_type"));
	}
	private static WebElement contains2Dropdown() {
		return driver.findElement(By.name("optional_field2_type"));
	}
	private static WebElement contains3Dropdown() {
		return driver.findElement(By.name("optional_field3_type"));
	}
	private static WebElement dateYearsDropdown() {
		return driver.findElement(By.name("date_year"));
	}
	private static WebElement dateMonthDropdown() {
		return driver.findElement(By.name("date_to_month"));
	}
	private static WebElement dateDayDropdown() {
		return driver.findElement(By.name("date_day"));
	}
	private static WebElement dateRangeYearsDropdown1() {
		return driver.findElement(By.name("date_from_year"));
	}
	private static WebElement dateRangeMonthDropdown1() {
		return driver.findElement(By.name("date_from_month"));
	}
	private static WebElement dateRangeDayDropdown1() {
		return driver.findElement(By.name("date_from_day"));
	}
	private static WebElement dateRangeYearsDropdown2() {
		return driver.findElement(By.name("date_to_year"));
	}
	private static WebElement dateRangeMonthDropdown2() {
		return driver.findElement(By.name("date_to_month"));
	}
	private static WebElement dateRangeDayDropdown2() {
		return driver.findElement(By.name("date_to_day"));
	}
	private static WebElement searchButton() {
		return driver.findElement(By.cssSelector("input.btn:nth-child(2)"));
	}
	
	
	public void containsAnyFieldDropdown(String search) {
        Select dropDown = new Select(containsAnyFieldDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void containsTitleDropdown(String search) {
        Select dropDown = new Select(containsTitleDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void containsCreatorDropdown(String search) {
        Select dropDown = new Select(containsCreatorDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void containsDescriptionDropdown(String search) {
        Select dropDown = new Select(containsDescriptionDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void isCollectionDropdown(String search) {
        Select dropDown = new Select(isCollectionDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void isMediatypeDropdown(String search) {
        Select dropDown = new Select(isMediatypeDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void allMediatypeDropdown(String search) {
        Select dropDown = new Select(allMediatypeDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void contains1Dropdown(String search) {
        Select dropDown = new Select(contains1Dropdown());
        dropDown.selectByVisibleText(search);
    }
	public void contains2Dropdown(String search) {
        Select dropDown = new Select(contains2Dropdown());
        dropDown.selectByVisibleText(search);
    }
	public void contains3Dropdown(String search) {
        Select dropDown = new Select(contains3Dropdown());
        dropDown.selectByVisibleText(search);
    }
	public void dateYearsDropdown(String search) {
        Select dropDown = new Select(dateYearsDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void dateMonthDropdown(String search) {
        Select dropDown = new Select(dateMonthDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void dateDayDropdown(String search) {
        Select dropDown = new Select(dateDayDropdown());
        dropDown.selectByVisibleText(search);
    }
	public void dateRangeYearsDropdown1(String search) {
        Select dropDown = new Select(dateRangeYearsDropdown1());
        dropDown.selectByVisibleText(search);
    }
	public void dateRangeDayDropdown1(String search) {
        Select dropDown = new Select(dateRangeDayDropdown1());
        dropDown.selectByVisibleText(search);
    }
	public void dateRangeMonthDropdown1(String search) {
        Select dropDown = new Select(dateRangeMonthDropdown1());
        dropDown.selectByVisibleText(search);
    }
	public void dateRangeYearsDropdown2(String search) {
        Select dropDown = new Select(dateRangeYearsDropdown2());
        dropDown.selectByVisibleText(search);
    }
	public void dateRangeMonthDropdown2(String search) {
        Select dropDown = new Select(dateRangeMonthDropdown2());
        dropDown.selectByVisibleText(search);
    }
	public void dateRangeDayDropdown2(String search) {
        Select dropDown = new Select(dateRangeDayDropdown2());
        dropDown.selectByVisibleText(search);
    }	
}