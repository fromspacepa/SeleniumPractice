package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class _7b__waitMethods_FluentWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shop.demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		/*
		 * WAIT METHODS: (that comes with SELENIUM WebDriver interface)
		 *  
		 * We have following Waits in SELENIUM: 
		 * 1) Dynamic Wait (Soft Wait or Smart Wait)
		 *   a) Implicit Wait:
		 *     i) Implicit wait method directs SELENIUM WebDriver to wait for a certain amount of time before throwing an exception/error.
		 *     ii) As the Implicit wait is a smart wait, for instance, if the element is present or intractable with in the time frame that is given in the method,
		 *        lets say the time frame is "20" seconds, it will execute the command at any amount of time (from 1 to 20 seconds) that element is intractable and
		 *        then the test execution will move on to the next command/function.
		 *     iii) Implicit wait is applied to whole execution of elements intractable within the whole web page.
		 *   
		 *   b) EXPLICIT WAIT:
		 *     i) With Explicit wait method we can define a wait time for each or single element separately that is not intractable within the web page or that it
		 *        could be handled separately. For instance, We have a text that we want to get from the web page, but the text is not intractable within the web page,
		 *        and this text is loading in 3 or more seconds, whereas the web page itself is loading in 1 second.
		 *     ii) Explicit wait is specifically useful for AJAX elements, since they are not loaded or updated at the same time as web page elements, and the AJAX
		 *        elements are loaded on a separate request.
		 * NOTE: AJAX elements are like some of the adds appearing/loading separately then web page on browser. Also, Explicit wait is the WebDriverWait class,
		 * and to use the Explicit wait, you would need to create the instance/object of WebDriverWait such as follows:
		 * WebDriverWait wait = new WebDriverWait(driver.Duration.ofSeconds(20));
		 * and then use the reference/object of your Explicit wait such as follows:
		 * wait.until(ExpectedCondition.visiblityOf(text));
		 * NOTE: For more information about the whole list ExpectedConditions search on the Internet.
		 *   
		 *   c) FLUENT WAIT:
		 *     i) Fluent wait and Explicit wait are used for similar elements that are not intractable within the web page and that it load separately or individually
		 *        but, the difference between Explicit wait and Fluent wait is that Explicit wait is timed for single period of wait time, Whereas Fluent wait can command 
		 *        that how many attempts could be made every other certain seconds to check the element (that is loaded or updated separately then web page) till it is 
		 *        available on the web page.
		 *   
		 * 2) STATIC WAIT (Hard Wait):
		 *      Example of Static/Hard Wait: "Thread.sleep(10000)" <-The "10000" stands for 10 seconds.
		 *      Static or Hard Wait is not usually recommended to be used in SELENIUM Test Cases; You could use it only as a demo or when you are explaining a test case or
		 *      when you have no other options.
		 * NOTE: Static/Hard Wait method is making the test case hard wait, it basically makes the test case execution process slow.
		 * Any where in the test case it is applied, the process of Automation test case  execution will go through hard wait then to the next step in the test case. 
		 * 
		 * 3) PageLoadTimeOut Wait:
		 *    PageLoadTimeOut Wait method will make the web page wait for certain period of time to load all of the web page elements on the web page, before throwing
		 *    an exception/error.
		 *    Example of PageLoadTimeOutWait method:
		 *    driver.manage().timeouts().PageLoadTimeOut(Duration.ofSeconds(10));\\this method will make the web page wait for 10 seconds.
		 *    
		 * TO BE NOTED:
		 *    Types of waits:
		 *    1) Implicit wait
		 *    2) PageLoadTimeOut wait
		 *    3) Explicit wait
		 *    4) Fluent wait
		 *    ___Implicit wait and PageLoadTimeOut wait methods are always recommended to be used in the SELENIUM Automation Test Cases, 
		 *    in fact, both are used in real time work space.
		 *    ___But, the Explicit wait and Fluent wait methods are used per needs/requirement.
		 *    Basically, you would have Explicit, Fluent, and other similar methods created in your project level and saved them in the Utilities folder, 
		 *    so you could use them based on your needs/requirements in your Automation Test Cases based.
		 *    
		 * Following here is the example of using the WAIT METHODS along with other methods to get the sense of it;
		 * and at the same time here we are launching two different web browsers (Chrome and Firefox):
		 */
		
		//Fluent wait
		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(1))
				.withMessage("Check your locator for this element");
		
		//When we tried to get that text and printed, it didn't work
		//because the element we were trying to locate was an AJAX element, and it is
		//not loaded with the rest of the page
		WebElement text = driver.findElement(By.xpath("//div[text()='umbra blue ']"));
		//example for when we want to print the message if element is not found
//		fluentWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='umbrawww blue ']")));
		//because it is the right xpath, it will find the element and print the element text for us
		fluentWait.until(ExpectedConditions.visibilityOf(text));
				
		System.out.println(text.getText());
		driver.close();
	}

}
