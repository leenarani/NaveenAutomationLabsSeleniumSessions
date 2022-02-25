package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch firefoxDriver.
		System.setProperty("webdriver.gecko.driver","E:\\Browsers\\FireFox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("the title is: " +title);
		

	}

}
