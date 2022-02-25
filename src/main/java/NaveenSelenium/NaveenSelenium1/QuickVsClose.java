package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuickVsClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("The current title is :"+ title);
		if(title.contains("Google")) {
			System.out.println("Correct url");
			
		}
		else {
			System.out.println("Correct url");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.quit();
		driver.close();
		System.out.println(driver.getTitle());		
	
		
		

	}

}
