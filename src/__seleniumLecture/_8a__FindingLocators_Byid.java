package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8a__FindingLocators_Byid {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
        
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
	
		//___pageLoadTimeout method:
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);//This wait method used be used with older version of SELENIUM.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));	// SELENIUM 4 new method for "pageLoadTimeout".
		//___implicitlyWait method: 
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//This wait method used be used with older version of SELENIUM.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// SELENIUM 4 new method for "implicittlyWait".
		
		/*
		 * ___By.id(); LOCATOR:
		 * 
		 * SELENIUM is using Locators that can be turned in as an address which identifies a Web-page Element(s) uniquely within the web-page.
		 * __Locators are the HTML properties of a web-page elements that represent the address for each element on the web-page, 
		 * __In SELENIUM Locators are used to identify web elements on a web-page. They are used as an argument passed to the finding element methods.
		 * __There are several types of Locators, which are explained below here. Identifying web elements is a tricky approach.
		 * __Basically, SELENIUM uses Locators to interact with the web Elements on the web-page. 
		 *  
		 *    id Locator _______________ (By.id(""));
		 *    ___Locates elements whose id attribute matches the search value of web-page element.
		 *    ___Using the "id" locator is recommended and it is preferred No.1, because "id" locator is generally unique.
		 *    
		 * Following is the example usage of "id" locator:
		 */
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("input-firstname")).sendKeys("James");
		Thread.sleep(2000);
		driver.findElement(By.id("input-lastname")).sendKeys("Bond");
		//driver.findElement(By.name("lastname")).sendKeys("Musazai");
		//driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Musazai");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("jamesbond007@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[type=\"email\"].form-control")).sendKeys("fhaem843@gmail.com");
		//driver.findElement(By.cssSelector("input[type='email']")).sendKeys("fhaem843@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("2764946923");
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys("15234");
		Thread.sleep(2000);
		driver.findElement(By.id("input-confirm")).sendKeys("15234");
		Thread.sleep(2000);
		driver.close();
	}

}
