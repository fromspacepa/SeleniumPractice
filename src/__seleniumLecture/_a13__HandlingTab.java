package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a13__HandlingTab {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
        
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		/*
		 * Tab Handling with SELENIUM:
		 * 
		 * Tab handling is almost the same idea of window handling and you need to use same methods
		 * that you used in the window handling concept, such as follows:
		 * 
		 * get.windowhandle();
		 * ___This method helps to get the window handle of the current window.
		 * get.windowhandles();
		 * ___This method helps to get handle all of the opened windows.
		 * set:
		 * set<String> set = driver.get.windowHandles();
		 * ___This method helps to set the window handles in the form of a String: 
		 * switchTo();
		 * ___This method helps to switch between the windows.
		 * action(); 
		 * ___This method helps to perform certain actions on the windows.
		 */
	}}