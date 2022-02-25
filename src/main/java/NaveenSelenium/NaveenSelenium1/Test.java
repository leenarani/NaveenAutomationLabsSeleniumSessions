package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//By email = By.id("input-email");
		//By password = By.id("input-password");
		//WebElement emailID= driver.findElement(email);
		//WebElement pwd = driver.findElement(password);
		//getElement(email).sendKeys("nav@gmail.com");
		//getElement(email).sendKeys("nav@123");
		
		//5th approach
		//By email = By.id("input-email");
		//By password = By.id("input-password");
		//doSendKeys(email,"nav@gmail.com");
		//doSendKeys(password,"nav@123");
		
		//6th approach(move to the util class)
		//By email = By.id("input-email");
		//By password = By.id("input-password");
		//ElementUtil eleutil = new ElementUtil(driver);
		//eleutil.doSendKeys(email, "nave@gmail.com");
		//eleutil.doSendKeys(password, "test@123");
		
		//7th approach(String locator with By, getElement and actions generic method in util class)
		//String eId = "input-email";
		//String pwd = "input-password";
		//doSendKeys("id",eId,"nav@gmail.com");
		//doSendKeys("id",pwd,"test@123");
		
		//8th approach
		String eId = "input-email";
		String pwd = "input-password";
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys("id",eId,"nav@gmail.com" );
		eleutil.doSendKeys("id",pwd,"test@123" );
		}
	
		/*
		 * public static By getBy(String LocatorType, String Locatorvalue) { By Locator
		 * = null; switch (LocatorType) { case "id": Locator = By.id(Locatorvalue);
		 * break;
		 * 
		 * default: break; } return Locator;
		 * 
		 * }
		 * 
		 * public static WebElement getElement(By Locator) { return
		 * driver.findElement(Locator);
		 * 
		 * }
		 * 
		 * public static void doSendKeys(By Locator, String value) {
		 * getElement(Locator).sendKeys(value);
		 * 
		 * } public static void doSendKeys(String LocatorType,String Locatorvalue,
		 * String value) { getElement(getBy(LocatorType,Locatorvalue)).sendKeys(value);
		 * 
		 * }
		 */
}
