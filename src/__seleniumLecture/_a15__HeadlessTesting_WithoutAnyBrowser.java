package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a15__HeadlessTesting_WithoutAnyBrowser {

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
		 * Testing any automation test case without browsing any browser:
		 * _You can test any automation test case without any browser launching and 
		 * that would or could be done by downloading the "HTML driver jar files" that is 
		 * compatible with your SELENIUM version and then add that/those jar files to 
		 * your project built path, then create the reference/object of that "HTML Unit Driver" class
		 * _In this case, the the testing will be done much faster the running/launching any
		 * Web-Browser. 
		 * 
		 */



	}

}
