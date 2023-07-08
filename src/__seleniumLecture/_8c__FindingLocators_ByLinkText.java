package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _8c__FindingLocators_ByLinkText {

	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(1000);
		
		/*
		 * ___By.linkText(); LOCATOR:
		 * 
		 *    linkText _________ (By.linkText(""));
		 *    ___"linkText" locator is only used to find/interact with elements of links on the web-page. 
		 *    ___Basically, link(s) located on the web-page are contained of list of items, so to interact with these links or finding it's
		 *    ___locator in the DOM you may use the "linkText" locator if the "id" locator or any other locators affiliated with the link element 
		 *    are not available in DOM.
		 *    ___Also, to find or to interact with link elements on the web-page you could use both "linkText" or "partialLinkText" locators; 
		 *    Mostly, there are no common attributes available in the DOM that affiliates with link elements, so you basically use the full text name
		 *    or partial text name of that link element, exactly as it is named on the web-page.
		 *   
		 *    
		 * >>> linkText & partialLinkText locators:
		 *     Q: What is the difference between linkText and partialLinkText?
		 *     A: linkText: means the full text of link
		 *     A: partialLinkText: means the partial text of link 
		 * 
		 * ___linkText(); is used to get the locator of a web-page link element that has an attribute or does not have common attribute in the DOM, but you 
		 * still can get the locator to interact with such elements just by using the full text name of that link as it shows on the web-page.
		 * ___partialLinkText(); and same, this method is used to get the locator of a web-page link element, just by using the partial name of full name.
		 * 
		 * NOTE:
		 * ___When you are trying to find/locate the locator of link elements in the DOM the HTML notes for links always starts with "<a" tagName followed 
		 * by "href" attribute, such as: "<a href"
		 * 
		 * ___Examples of using both "linkText" and "partialLinkText" methods:
		 *    __Here below both methods will click/open the link/tab that is located on the Amazon web-page and named as: Amazon Basics
		 *    It depends on you and the situation that whichever method you preferred to use:
		 *    driver.findElement(By.linkText("Amazon Basics")).click();
		 *    driver.findElement(By.partialLinkText("Basics")).click();
		 */
		driver.findElement(By.linkText("Customer Service")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

	
}
