package __seleniumLecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _2__LaunchingChrome_Firefox_Edge {
	public static void main(String[] args) {
		
		/*
		 * To launch any browser, 1st you need to set the property of the desired browser
		 * 2ndly you need to instantiate the desired (ChromeDriver, EdgeDriver, or FirefoxDriver) class on WebDriver interface.
		 */
		
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");

		//WebDriver driver = new ChromeDriver();//Launching chrome browser.
		//WebDriver driver1 = new EdgeDriver();//Launching edge browser.
		WebDriver driver2 = new FirefoxDriver();//Launching firefox browser.

}
}
