package NaveenSelenium.NaveenSelenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Admin
 *
 */
/**
 * @author Admin
 *
 */
public class WebDriverWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By email = By.id("input-email");
		By password = By.id("input-password");

//			
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement email_ele= wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		email_ele.sendKeys("samalrani92@gmail.com");
//		driver.findElement(password).sendKeys("test@123");
		waitForElementVisisble(email, 10).sendKeys("tom@gmail.com");
		getElement(password).sendKeys("test@123");
		System.out.println("explicit wait applied");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
/**An expectation for checking that an element is present on the DOM of a page. 
 * This does notnecessarily mean that the element is visible.
 * 
 * @param locator
 * @param timeOuts
 * @return
 */
//	public static WebElement waitForElementPresence(By locator, int timeOuts) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
//		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
//
//	}

	/**An expectation for checking that an element is present on the DOM of a page and visible.
	 * Visibility means that the element is not only displayed but also has a height and width that isgreater than 0.

	 * @param locator
	 * @param timeOuts
	 * @return
	 */
	public static WebElement waitForElementVisisble(By locator, int timeOuts) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
}
