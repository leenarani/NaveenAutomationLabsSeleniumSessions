package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReferenceConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement fn= driver.findElement(By.id("Form_submitForm_Name"));
		fn.sendKeys("naveen");
		driver.navigate().refresh();
		fn= driver.findElement(By.id("Form_submitForm_Name"));
		fn.sendKeys("Harshini");
		
		
		

	}

}
