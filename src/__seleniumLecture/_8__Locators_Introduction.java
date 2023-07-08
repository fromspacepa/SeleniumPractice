package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _8__Locators_Introduction {

		/*
		 * ____LOCATORS Introduction:
		 * 
		 * SELENIUM is using Locators that can be turned in as an address which identifies a Web-page Element(s) uniquely within the web-page.
		 * __Locators are the HTML properties of a web-page elements that represent the address for each element on the web-page, 
		 * __In SELENIUM Locators are used to identify web elements on a web-page. They are used as an argument passed to the finding element methods.
		 * __There are several types of Locators, which are explained below here. Identifying web elements is a tricky approach.
		 * __Basically, SELENIUM uses Locators to interact with the web Elements on the web-page. 
		 * 
		 * Q: What are the Types of Locators in SELENIUM?
		 * A: There are 8-Types of Locators, such as follows: 
		 *    1. id _______________ (By.id(""));
		 *    ___Using the "id" locator is recommended and it is preferred No.1, because "id" locator is generally unique.
		 *    2. className ________ (By.className(""));
		 *    ___Using the "className" locator is not recommended, because sometime it could be duplicate (not unique).
		 *    3. name _____________ (By.name(""));
		 *    ___Using the "name" locator is recommended and it is preferred No.2, most of the times it is unique.
		 *    4. tagName __________ (By.tagName(""));
		 *    ___
		 *    5. linkText _________ (By.linkText(""));
		 *    ___"linkText" locator is only used to find/interact with elements of links on the web-page. 
		 *    ___Basically, link(s) located on the web-page are contained of list of items, so to interact with these links or finding it's
		 *    ___locator in the DOM you may use the "linkText" locator if the "id" locator affiliated to the link element is not available in DOM.
		 *    6. partialLinkText __ (By.partialLinkText(""));
		 *    ___Using the "partiaLinkText" is not recommended, because it creates confusion. This locator is also used to interact with link(s) on the web-page.
		 *    ___In some cases, we may need to find links by portion of a text in the linkText element. In such situations, we use the "partialLinkText" locator
		 *    ___to locate or interact with link(s) elements on the web-page.
		 *    7. xpath ____________ (By.xpath(""));
		 *    ___Using the "xpath" locator is recommended and it is preferred No.1
		 *    ___"xpath" locators are customized locators, you may use them when there is no "id", "name", "className" or other attributes are not available in the DOM.
		 *    8. cssSelector ______ (By.cssSelector(""));
		 *    ___Same as "xpath" locator you could use "cssSelector" locator to find and interact with web-page element. 
		 *    
		 *    
		 * NOTE: We will have examples of finding elements with the help of these locators in the coming classes.
		 * 
		 */
		
	public static void main(String[] args) throws InterruptedException {
		
        //This is to set the property for all three web browsers: Chrome-Edge-Firefox
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
        
		//This is to instantiate all three WebDrivers: ChromeDriver-EdgeDriver-FirefoxDriver:
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.switchTo();
		driver.get("http://tek-school.com/retail/");
		// pageLoadTimeout method:
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		// Selenium 4 new method for "pageLoadTimeout" is the following:
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		// implicitlyWait method: 
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		// Selenium 4 new method for "implicittlyWait" is the following:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


		 




	}
}