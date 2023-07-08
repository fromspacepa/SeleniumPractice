package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _8b__FindingLocators_ByName {

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
		 * ___By.name(); LOCATOR:
		 * 
		 * SELENIUM is using Locators that can be turned in as an address which identifies a Web-page Element(s) uniquely within the web-page.
		 * __Locators are the HTML properties of a web-page elements that represent the address for each element on the web-page, 
		 * __In SELENIUM Locators are used to identify web elements on a web-page. They are used as an argument passed to the finding element methods.
		 * __There are several types of Locators, which are explained below here. Identifying web elements is a tricky approach.
		 * __Basically, SELENIUM uses Locators to interact with the web Elements on the web-page. 
		 *  
		 *    name locator _____________ (By.name(""));
		 *    ___Using the "name" locator is recommended and it is preferred No.2, most of the times it is unique.
		 *    
		 * Following is the example usage of "name" locator:
		 * 
		 */
		
		//Following both xpath locators are used to find the locator of a same element
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();//Example of "contains function" used in the xpath.
		//driver.findElement(By.xpath("//span[text()='My Account']"));//Example of "text function" used in the xpath.
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		System.out.println(driver.getTitle());
		
		//Following is the example of using "name locator" to find to locators of web elements in DOM:
		driver.findElement(By.name("firstname")).sendKeys("Jose");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Arial");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("josearial@selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("telephone")).sendKeys("837-373-4956");
		Thread.sleep(2000);
		driver.close();
		

	}

}
