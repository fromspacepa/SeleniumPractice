package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a12__HandlingAlertsRequiresAuthentication {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * Handling Alerts in SELENIUM:
		 * Alerts are JavaScript pop-up alerts, which are not part of the DOM. Which means that we can not look for any 
		 * locators to interact with alerts inside the DOM. Alerts are kind of separate entity from DOM.
		 * 
		 * NOTE:
		 * _We have Alerts with OK and CANCEL buttons.
		 * _We have Alerts with only OK button.
		 * _We have Alerts that requires Authentication.
		 * _We have Alerts that requires TEXT.
		 * 
		 * __Here is the example of handling Alert that requires Authentication:
		 * 
		 */
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

		Thread.sleep(9000);
		driver.quit();
	}

}
