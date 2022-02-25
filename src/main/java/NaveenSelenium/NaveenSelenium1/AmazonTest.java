package NaveenSelenium.NaveenSelenium1;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		BrowserUtil br = new BrowserUtil();
		br.inti_Driver(browser);
		br.getUrl("https://www.amazon.com");
		String PageTitle= br.getPageTitle();
		if(PageTitle.contains("Amazon")) {
			System.out.println("Title is correct");
		}
		
		if(br.getPageUrl().contains("Amazon")) {
			System.out.println("Url  is correct");
		}
		br.quitBrowser();
		

	}

}
