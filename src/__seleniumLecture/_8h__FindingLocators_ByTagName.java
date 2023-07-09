package __seleniumLecture;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _8h__FindingLocators_ByTagName {

	public static <WebElements> void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver2 = new EdgeDriver();
		
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		/*
		 * ___tagName Locator:
		 * By.tagName();
		 * SELENIUM is using Locators that can be turned in as an address which identifies a Web-page Element(s) uniquely within the web-page.
		 * __Locators are the HTML properties of a web-page elements that represent the address for each element on the web-page, 
	     * __In SELENIUM Locators are used to identify web elements on a web-page. They are used as an argument passed to the finding element methods.
	     * __There are several types of Locators an mentioned in the "Locators_Introduction" class. Identifying web elements is a tricky approach.
	     * __Basically, SELENIUM uses Locators to interact with the web Elements on the web-page. 
	     * 
	     *    tagName ________ (By.tagName(""));
		 *    __Same as other common used locators, you can use the HTML tag itself as a locator to identify the web element(s) on the page.
		 *    "tagName" locator is very helpful in finding all the links elements on the web-page and then you can print out the whole list of
		 *    links available on the web-page.
		 *    __There is interview question:
		 *    Q: How to find that how many links are available on the web-page and print out the text-names of all the links?
		 *    A: So, to answer the above question, you would need to write the following code by using the "tagName" locator.
		 *    
		 * NOTE:
		 * The tagName for links on the web-page is always: "<a"
		 * The tagName for inputFields on the web-page is always: "<input"
		 * The tagName for radioButtons on the web-page is always: "<button"
	     *    
		 * Following is the example usage of "tagName" locator to identify all the elements for all the links available on the Amazon web-page:
		 * 
		 */
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		//driver.findElements(By.tagName("a"));
		
		//This will print out the total number of links available on the Amazon web-page:
		List <WebElement> listLink = driver.findElements(By.tagName("a"));
		  System.out.println(listLink.size()); 
		
		//Adding this for loop will print out the names list of all links available on the Amazon web-page:
			/*
			 * for (int i = 0; i < listLink.size(); i++) { 
			 * String linkText = listLink.get(i).getText(); 
			 * System.out.println(linkText); }
			 * 
			 */
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
