package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _9a__HandlingRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * __Handling Radio Button (O):
		 * 
		 * When you are handling "radioButton" element of web application using Selenium Testing Framework, you have to keep in mind that 
		 * before handling/clicking on specific radioButton, you need to check the state/status of it. The purpose of checking the status of
		 * radioButton is to see or make sure that the radioButton is Displayed, Enabled, and not Selected before you click on it; So, for 
		 * that we have to use the following methods:
		 * 1) isDisplayed();
		 * 2) isEnabled();
		 * 3) isSelected();
		 * And all these method will give or printout you the boolean results in the console of your Eclipse;
		 * So, in order to get the boolean result of all these above methods, you need to use them in boolean data type such as follows:
		 * 
		 * 1st) Usage of "isDisplayed();" method:
		 *      boolean isDisplayed = radioButton.isDisplayed();
		 *             System.out.println(isDisplayed);
		 * 2nd) Usage of "isEnabled();" method:
		 *      boolean isEnabled = radioButton.isEnabled();
		 *             System.out.println(isEnabled);
		 * 3rd) Usage of "isSelected();" method:
		 *      boolean isSelected = radioButton.isSelected();
		 *             System.out.println(isSelected);
		 *             
		 * And then you can use your "click();" method after all these above.
		 * 
		 * NOTE:
		 * With radioButtons we can only check one radioButton at a time, 
		 * Means that when you have more than one radioButtons in your web page
		 * you would need to perform the above action for each radioButtons.
		 * 
		 * Following here is the Example of locating the locator of radioButton element:
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
		
		/*
		 * pageLoadTimeout method:
		 * driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS); //
		 * Selenium 4 new method for "pageLoadTimeout" is the following:
		 */		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		/*
		 * implicitlyWait method:
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // Selenium
		 * 4 new method for "implicittlyWait" is the following:
		 */		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://tek-school.com/retail/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		
		//Finding the locator of a radioButton and checking the status of it, if it displayed, enabled, and selected before and after clicked.
		WebElement radioButton = driver.findElement(By.xpath("//label[@class='radio-inline']//input[@value='1']"));
		 
		  System.out.println("******Radio Button Status ******");
		  boolean isdisplayed = radioButton.isDisplayed();
		  System.out.println("radioButton displayed before clicked:\t" +isdisplayed); 
		  boolean isenabled = radioButton.isEnabled();
		  System.out.println("radioButton enabled before clicked:\t" + isenabled); 
		  boolean isselected = radioButton.isSelected(); 
		  System.out.println("radioButton selected before clicked:\t" + isselected); 
		  radioButton.click(); 
		  Thread.sleep(2000); 
		  boolean clicked = radioButton.isSelected(); 
		  System.out.println("radioButton selected after clicked:\t" + clicked); 
		  Thread.sleep(4000);

		  driver.quit();
		

	}

}
