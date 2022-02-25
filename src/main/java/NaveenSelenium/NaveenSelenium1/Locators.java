package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		///using name attribute
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		
		//using class attribute
		//driver.findElement(By.className("form-control")).sendKeys("MAC");
		
		//using xpath
		/*
		 * By emaiId = By.xpath("//*[@id=\"input-email\"]"); By password =
		 * By.xpath("//*[@id=\"input-password\"]"); By loginBtn =
		 * By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		 * doSendKeys(emaiId,"test@gmail.com"); doSendKeys(password,"test123");
		 * doClick(loginBtn);
		 */
		
		//using linkText
		//By register = By.linkText("Register");
		//System.out.println(doGetText(register));
		
		//using attribute
		//By emaiId = By.id("input-email");
		//String attr= driver.findElement(emaiId).getAttribute("placeholder");
		//System.out.println(attr);
		
		
		//using generic method how to use getAttribute()
		By emaiId = By.id("input-email");
		doSendKeys(emaiId,"naveen@gmail.com");
		System.out.println(doGetAttribute(emaiId,"type"));
		
		
	}
	public static String doGetAttribute(By Locator, String attributeValue) {
		return getElement(Locator).getAttribute(attributeValue);
		
	}
	
	
	public static String doGetText(By Locator) {
		return getElement(Locator).getText();
		
		
		}
	 public static WebElement getElement(By Locator) {
		 return driver.findElement(Locator);
		 
	 }
	 
	 public static void doClick(By Locator) {
		 getElement(Locator).click();
	 }
	 
	 public static void doSendKeys(By Locator, String value) {
		 getElement(Locator).sendKeys(value);
		 
		 
		 
	 }

}
