package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a11__HandlingFrame {

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
		 * Handling Frame in SELENIUM:
		 * 
		 * NOTE:
		 * Frame itself is the web-page element, because it is in/on the web-page. Also, there are some elements inside the frame too.
		 * What happens that sometimes we need to interact with element(s) that is/are inside frame. So, in order to interact with 
		 * those elements that are inside the frame, we have to first handle the frame (identity the locator for frame), then identify 
		 * the locator for element that is inside the frame. Basically, that is called: "Frame Handling"
		 * 
		 * Demonstration of this concept is coming soon.....
		 * 
		 */
		
     
		
	
	}

}
