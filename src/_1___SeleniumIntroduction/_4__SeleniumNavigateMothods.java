package _1___SeleniumIntroduction;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4__SeleniumNavigateMothods {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * In this class we cover more about Selenium navigate methods, and will be practicing them too.
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.quit();
		// pageLoadTimeout method:
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		// Selenium 4 new method for "pageLoadTimeout" is the following:
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// implicitlyWait method: 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		// Selenium 4 new method for "implicittlyWait" is the following:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		/**
		 * Static wait (hard wait): "Thread.sleep(3000);"
		 * is a hard wait, we don't use static wait in automation too often, we use it only if we want to debug our code.
		 * 
		 * Implicitly wait:
		 * is a global wait and it applies to all of the elements in the web page that we want to interact with.
		 * 
		 * Dynamic wait:
		 * are not hard wait, which means that if we don't need the wait time, then the system will ignore the remaining wait if the action can be performed
		 * 
		 * Page Load Timeout wait:
		 * the reason we get warning for "pageLoadTimeout" is that because we are using selenium 4, in selenium 4 the method "pageLoadTimeout" is deprecated  
		 * and we have to use the one recommended by selenium 4.
		 */

		// These following are navigate methods used for various functions:
		driver.navigate(). to ("");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	

	}

}