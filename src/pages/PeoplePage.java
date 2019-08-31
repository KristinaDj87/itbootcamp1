package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePage {

static WebDriver driver;
	
	public PeoplePage(WebDriver driver) {	
		this.driver = driver;
	}
	//elements
		private static List<WebElement> peopleBios() {
			return driver.findElements(By.cssSelector("div.row div.bio"));
		}	
	
	//actions
		public static List<WebElement> getPeopleBios() {
			return peopleBios();
		}
		
		public void sizePeopleBios() {
			getPeopleBios().size();
		}
		
		public List<String> infoBios() {
		       List<WebElement> bios = getPeopleBios();
		       List<String> peopleText = new ArrayList<String>();

		       for (int i = 0; i < bios.size(); i++) {
		           WebElement people = bios.get(i).findElement(By.cssSelector("b"));
		           WebElement text = bios.get(i).findElement(By.cssSelector("i"));
		           peopleText.add(people.getText() + ' ' + text.getText());
		       }
		       return peopleText;		        
		}			
	}
