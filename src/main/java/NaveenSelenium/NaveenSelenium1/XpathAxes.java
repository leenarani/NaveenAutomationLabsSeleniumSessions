package NaveenSelenium.NaveenSelenium1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(
				"https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-2nd-odi-1277083/full-scorecard");
		// WebElement batsMan =driver.findElement(By.xpath("//a[contains(text(),'Temba
		// Bavuma')]/parent::td/following-sibling::td/span"));
		// System.out.println(batsMan.getText());
		System.out.println(getWicketTakerName("Temba Bavuma"));
		System.out.println(getWicketTakerName("Janneman Malan"));
		System.out.println(getPlayerScoreCard("Temba Bavuma"));
	}

	public static List<String> getPlayerScoreCard(String playerName) {
		List<String> actScoreList = new ArrayList<String>();
		List<WebElement> scoreList = driver
				.findElements(By.xpath("//a[contains(text(),'" + playerName + "')]/parent::td/following-sibling::td"));
		System.out.println(scoreList.size());
		for (int i = 1; i < scoreList.size(); i++) {
			String text = scoreList.get(i).getText();
			actScoreList.add(text);
		}

		return actScoreList;

	}

	public static String getWicketTakerName(String playerName) {
		WebElement batsMan = driver.findElement(
				By.xpath("//a[contains(text(),'" + playerName + "')]/parent::td/following-sibling::td/span"));
		return batsMan.getText();

	}

}
