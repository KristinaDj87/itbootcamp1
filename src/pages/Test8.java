package pages;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Test8 {
	
	private static final int i = 0;
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver", 
				 "C:\\Users\\Kristina\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
@Test
public void pages() throws Exception{
		
	driver.navigate().to(URLPages.PEOPLE_PAGE);
	List<String> bios = new PeoplePage(driver).infoBios();
	
	System.out.print(bios);
}

////////
		
	
File src = new File("C:\\Users\\Kristina\\Desktop\\poi\\ZavrsniFajl.xlsx");
{
	try {
		FileInputStream stream = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(stream);
		XSSFSheet sheet1 = wb.getSheetAt(0); 
	
			ArrayList<String> name = new ArrayList<String>();
			
			for (int i = 1; i < sheet1.getLastRowNum() + 1; i++) {
			}
				String names = sheet1.getRow(i).getCell(0).getStringCellValue();
				System.out.println(names);
	
	} catch (Exception e) {
		System.out.println("Exception handled");
	
	}
}
}
