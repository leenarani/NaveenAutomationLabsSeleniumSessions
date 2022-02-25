package NaveenSelenium.NaveenSelenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		System.out.println(getCompany("Maria Anders"));
		System.out.println(getCountryName("Maria Anders"));
		System.out.println("row count :"+getRowCount("customers"));
		System.out.println("column count :"+getColumnCount("customers"));
		System.out.println(getColumnValue("customers"));

	}
	
	

	public static List<String> getColumnValue(String value) {
		List<String> columnHeaderList = new ArrayList<String>();
		List<WebElement> columns = driver.findElements(By.xpath("(//table[@id='" + value + "']//tr)[1]/th"));
		int colListCount = columns.size();
		for (int i = 0; i < colListCount; i++) {
			String colValue = columns.get(i).getText();
			columnHeaderList.add(colValue);

		}
		return columnHeaderList;

	}

	public static int getColumnCount(String value) {
		return driver.findElements(By.xpath("(//table[@id='" + value + "']//tr)[1]/th")).size();
	}

	public static int getRowCount(String value) {
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='" + value + "']//tr"));
		return (rows.size()) - 1;

	}

	public static String getCompany(String name) {
		return driver.findElement(By.xpath("//td[contains(text(),'" + name + "')]/preceding-sibling::td")).getText();

	}

	public static String getCountryName(String name) {
		return driver.findElement(By.xpath("//td[contains(text(),'" + name + "')]/following-sibling::td")).getText();

	}

}
