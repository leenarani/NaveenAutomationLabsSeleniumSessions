package NaveenSelenium.NaveenSelenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement getElement(By Locator) {
		return driver.findElement(Locator);

	}

	public void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}

	public By getBy(String LocatorType, String Locatorvalue) {
		By Locator = null;
		switch (LocatorType) {
		case "id":
			Locator = By.id(Locatorvalue);
			break;

		default:
			break;
		}
		return Locator;

	}

	public void doSendKeys(String LocatorType, String Locatorvalue, String value) {
		getElement(getBy(LocatorType, Locatorvalue)).sendKeys(value);

	}

	public String doGetAttribute(By Locator, String attributeValue) {
		return getElement(Locator).getAttribute(attributeValue);

	}

	public String doGetText(By Locator) {
		return getElement(Locator).getText();

	}

	public void doClick(By Locator) {
		getElement(Locator).click();
	}

	public void doIsDisplayed(By Locator, String value) {
		if (getElement(Locator).isDisplayed()) {
			doSendKeys(Locator, value);
			System.out.println("Element is displayed");
		}

		else {
			System.out.println("element is not displayed");
		}

	}

	// *******************************wait utils**********************
	public WebElement waitForElementPresence(By locator, int timeOuts) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that isgreater than 0.
	 * 
	 * @param locator
	 * @param timeOuts
	 * @return
	 */
	public WebElement waitForElementVisisble(By locator, int timeOuts) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}
	/**
	 * An expectation for checking that the title contains a case-sensitive substring
	 * @param title
	 * @param timeUnits
	 * @return
	 */
	
	public boolean waitForAlertPresent(String title, int timeUnits) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeUnits));
		return wait.until(ExpectedConditions.titleContains("title"));
		
		}

}
