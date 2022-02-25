package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Browsers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//to get the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Correct Title");
			
		}
		else {
			System.out.println("InCorrect Title");
			
		}
		
        System.out.println(driver.getCurrentUrl());
        driver.quit();
        
	}

}
