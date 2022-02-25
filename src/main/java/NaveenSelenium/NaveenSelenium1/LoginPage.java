package NaveenSelenium.NaveenSelenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.inti_Driver("chrome");
		br.getUrl("https://demo.opencart.com/index.php?route=account/login");
		By emaiId = By.id("input-email");
		By password = By.id("input-password");
		ElementUtil el  = new ElementUtil(driver);
		el.doSendKeys(emaiId,"test@gmail.com");
		el.doSendKeys(password,"test123");
		br.closeBrowser();
		
		}
	
	

}
