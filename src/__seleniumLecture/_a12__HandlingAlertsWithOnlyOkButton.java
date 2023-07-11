package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a12__HandlingAlertsWithOnlyOkButton {

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
		 * __Here is the example of handling Alert that is contained of only OK button:
		 * 
		 */
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert2");
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//to accept
		driver.switchTo().alert().accept();
		//to dismiss
		//driver.switchTo().alert().dismiss();

		Thread.sleep(6000);
		driver.quit();
	}

}