
package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By emaiId = By.id("input-email");
		doIsDisplayed(emaiId,"test@gmail.com");
		
		
		
		
	}
	
	
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
		
	}
	
	public static void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
		
	}
	public static void doIsDisplayed(By Locator, String value) {
		if(getElement(Locator).isDisplayed()) {
			doSendKeys(Locator,value);
			System.out.println("Element is displayed");
		}
		
		else {
			System.out.println("element is not displayed");
		}
		
		
	}

}
