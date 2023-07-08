package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _9__HandlingCheckBox {

		public static void main(String[] args) throws InterruptedException {
			
			/*
			 * __Handling checkBox ([]):
			 * 
			 * When you are handling "checkBox" element of web application using Selenium automation, you have to keep in mind that 
			 * before handling/clicking on specific checkBox, you need to check the state/status of it. The purpose of checking the status of
			 * checkBox is to see or make sure that the checkBox is Displayed, Enabled, and not Selected before you click on it; So, for 
			 * that we have to use the following methods:
			 * 1) isDisplayed();
			 * 2) isEnabled();
			 * 3) isSelected();
			 * And all these method will give or printout you the boolean results in the console of your Eclipse;
			 * So, in order to get the boolean result of all these above methods, you need to use them in boolean data type such as follows:
			 * 
			 * First of all, you have to find the locator checkBox ([]) that you are testing such as follows:
			 * 
			 * WebElement checkBox = driver.findElement(By.xpath("//input[@name='agree']"));
			 * 
			 * 1step) Usage of "isDisplayed();" method:
			 *      boolean isDisplayed = checkBox.isDisplayed();
			 *             System.out.println(isDisplayed);
			 * 2step) Usage of "isEnabled();" method:
			 *      boolean isEnabled = checkBox.isEnabled();
			 *             System.out.println(isEnabled);
			 * 3step) Usage of "isSelected();" method:
			 *      boolean isSelected = checkBox.isSelected();
			 *             System.out.println(isSelected);
			 *             
			 * And then you can use your "click();" method after all these above.
			 * 
			 * NOTE:
			 * With checkBoxes we can only check more than one checkBox at a time 
			 * 
			 * Following here is the Example of locating the locator of checkBox element:
			 */
			
	        //This is to set the property for all three web browsers: Chrome-Edge-Firefox
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
	        
			//This is to instantiate all three WebDrivers: ChromeDriver-EdgeDriver-FirefoxDriver:
			WebDriver driver = new ChromeDriver();
			//WebDriver driver1 = new EdgeDriver();
			//WebDriver driver2 = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			// pageLoadTimeout method:
			//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			// Selenium 4 new method for "pageLoadTimeout" is the following:
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			// implicitlyWait method: 
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			// Selenium 4 new method for "implicittlyWait" is the following:
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.navigate().to("http://tek-school.com/retail/");
			Thread.sleep(2000);

			driver.findElement(By.xpath("//a[@title='My Account']")).click();
			driver.findElement(By.xpath("//a[text()='Register']")).click();

		   //Finding the locator of a checkBox and checking the status of it, if it displayed, enabled, and selected before and after clicked.
		    WebElement checkBox = driver.findElement(By.xpath("//input[@name='agree']"));
		    //Usage of "isDisplayed();"
			boolean isDisplayed = checkBox.isDisplayed();
			System.out.println("checkBox Displayed before clicked:\t" + isDisplayed);
			boolean isEnabled = checkBox.isEnabled();
			System.out.println("checkBox Enabled before clicked:\t" + isEnabled);
			boolean isSelected = checkBox.isSelected();
			System.out.println("checkBox Selected before clicked:\t" + isSelected);
			checkBox.click();
			Thread.sleep(2000);
			boolean clicked = checkBox.isSelected();
			System.out.println("checkBox Selected after clicked:\t" + clicked);
			Thread.sleep(2000);

			driver.quit();

	}

}
