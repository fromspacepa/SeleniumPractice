package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a12__HandlingAlertsWithOKandCancelButtons {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
        
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();

		
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
		 */

		/*
		 * __Here is the example of handling Alert that is contained of both OK and CANCEL buttons:
		 * Basically, what happens that once you click on the Alert, another Alert pops-up and that Alert has
		 * OK and CANCEL buttons; either OK or CANCEL button has to be clicked to move forward.
		 */
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.switchTo();
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  //store the frame in webelement:
		  WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']")); 
		  //using selenium pre-built functions, switch to that frame
		  driver.switchTo().frame(frame);
		  driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click(); 
		  //to accept:
		  driver.switchTo().alert().accept(); 
		  //to dimiss:
		  //driver.switchTo().alert().dismiss(); 
		  Thread.sleep(5000); 
		  driver.quit();
		 
	}

}