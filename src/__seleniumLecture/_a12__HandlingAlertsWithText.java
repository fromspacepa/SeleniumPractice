package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a12__HandlingAlertsWithText {

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
		 * __Here is the example of handling Alert that requires TEXT:
		 * 
		 */
		//driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
	    //driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//we are sending text to the alert pop up
		driver.switchTo().alert().sendKeys("Tekschool");
		//we can accept
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		driver.quit();
	}

}