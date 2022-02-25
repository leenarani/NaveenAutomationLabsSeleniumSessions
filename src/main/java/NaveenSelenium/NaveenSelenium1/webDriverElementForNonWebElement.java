package NaveenSelenium.NaveenSelenium1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class webDriverElementForNonWebElement {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleContains("Amazon"));
		doGetPageTitle("Amazon",10);

	}

	/**
	 * An expectation for checking that the title contains a case-sensitive substring
	 * @param title
	 * @param timeUnits
	 * @return
	 */
	public static boolean waitForAlertPresent(String title, int timeUnits) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeUnits));
		return wait.until(ExpectedConditions.titleContains("title"));
		
		}
	
	public static String  doGetPageTitle(String title, int timeUnits) {
		if(waitForAlertPresent(title,timeUnits)) {
			return driver.getTitle();
		}
		
		return null;
		
	}
}
