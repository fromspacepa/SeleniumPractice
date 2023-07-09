package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8g__FindingLocators_ByClassName {
	

		public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			
		WebDriver driver = new ChromeDriver();//This is to instantiate the ChromeDriver Class.
		//WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver2 = new EdgeDriver();
			
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("http://tek-school.com/retail/");
		System.out.println(driver.getTitle());
			
		/*
		 * ___className Locator:
		 * By.className();
		 * SELENIUM is using Locators that can be turned in as an address which identifies a Web-page Element(s) uniquely within the web-page.
		 * __Locators are the HTML properties of a web-page elements that represent the address for each element on the web-page, 
	     * __In SELENIUM Locators are used to identify web elements on a web-page. They are used as an argument passed to the finding element methods.
	     * __There are several types of Locators an mentioned in the "Locators_Introduction" class. Identifying web elements is a tricky approach.
	     * __Basically, SELENIUM uses Locators to interact with the web Elements on the web-page. 
		 *  
		 *   className ________ (By.className(""));
		 *    ___Using the "className" locator is not recommended, because sometime it could be duplicate (not unique).
		 *   
		 * Same as other common used locators, you can use the "className" locator in order to find the unique locator of an element, but most of the times
		 * "className" locator is duplicate and it is not unique; Therefore, it is not recommended to be used:
	     *    
		 * Following are the example usage of "className" locator:
		 * 
		 */
			
			
			driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();//Example of "contains function" used in the xpath.
			//driver.findElement(By.xpath("//span[text()='My Account']"));//Example of "text function" used in the xpath.
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			System.out.println(driver.getTitle());
			//Example of "className" Locator (You see all the attribute Values are duplicate, that is the reason of "className" locator not working):
			driver.findElement(By.className("form-control")).sendKeys("Jose");//This will not work, and you will get "NoSuchElementException"
			driver.findElement(By.className("form-control")).sendKeys("Arial");//This will not work, and you will get "NoSuchElementException"
			driver.findElement(By.className("form-control")).sendKeys("josearial@selenium");//This will not work, and you will get "NoSuchElementException"
			driver.findElement(By.className("form-control")).sendKeys("837-373-4956");//This will not work, and you will get "NoSuchElementException"
			//Thread.sleep(2000);
			//Example of "name" Locator (All of the followings will work):
			//driver.findElement(By.name("firstname")).sendKeys("Jose");
			//driver.findElement(By.name("lastname")).sendKeys("Arial");
			//driver.findElement(By.name("email")).sendKeys("josearial@selenium");
			//driver.findElement(By.name("telephone")).sendKeys("837-373-4956");
			Thread.sleep(3000);
			driver.close();

}}
