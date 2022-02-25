package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * this method is used to initialize the driver on the basis of browser.
	 * 
	 * @param browser
	 * @return this returns webdriver
	 */

	public WebDriver inti_Driver(String browser) {
		System.out.println("Browser is: " + browser);
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Browsers\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Browsers\\FireFox\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		} else {
			System.out.println("Please pass the right browser : " + browser);
		}
		return driver;
	}

	/**
	 * to get the url
	 * 
	 * @param url
	 */
	public void getUrl(String url) {
		System.out.println("URL is: " + url);
		// if url contains http or https pr not
		if (url.contains("http") || url.contains("https")) {
			driver.get(url);
		} else {
			System.out.println("Incorrect url entered: " + url);
			try {
				throw new Exception("INCORRECT URL MISSING HTTP or HTTPS");
			} catch (Exception e) {

			}
		}

	}

	/**
	 * get the page url
	 * 
	 * @return
	 */
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;

	}

	/**
	 * Get the current page url
	 * 
	 * @return
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * Quit the browser
	 */
	public void quitBrowser() {
		driver.quit();

	}

	/**
	 * close the browser
	 */
	public void closeBrowser() {
		driver.close();
	}

}
