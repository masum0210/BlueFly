import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page1 {
	
	ChromeDriver dr;
	
	@Before
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/masumparvezapu/Downloads/chromedriver");
		dr = new ChromeDriver();
		dr.get("https://www.bluefly.com/");
		
	}
	
	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		dr.quit();
		
	}
		
}
