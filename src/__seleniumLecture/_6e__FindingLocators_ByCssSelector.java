 package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _6e__FindingLocators_ByCssSelector {

	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver" , ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.google.com/");
		//Thread.sleep(2000);
		driver.navigate().to("http://tek-school.com/retail/");
		
		
		/*
		 * ___cssSelector Locator:
		 * By.cssSelector();
		 * SELENIUM is using Locators that can be turned in as an address which identifies a Web-page Element(s) uniquely within the web-page.
		 * __Locators are the HTML properties of a web-page elements that represent the address for each element on the web-page, 
	     * __In SELENIUM Locators are used to identify web elements on a web-page. They are used as an argument passed to the finding element methods.
	     * __There are several types of Locators an mentioned in the "Locators_Introduction" class. Identifying web elements is a tricky approach.
	     * __Basically, SELENIUM uses Locators to interact with the web Elements on the web-page. 
		 * 
		 * Same as xpath we can use cssSelector locator to find/locate the locators of web-page elements.
		 * "cssSelector(s)" is a bit faster then xpath, but there are some cons which comes with cssSelector such as follows:
		 *   1). When we write cssSelector we have less options while we are traversing through locators in the DOM, when comparing with xpath
		 *       ___With the usage of xpath, we can traverse or can go from child to parent and same from parent to child locators, but while using 
		 *       the cssSelector, we can only traverse or can only go from parent to child locator.
		 *   2). The cssSelector was more useful with Internet explorer browser, but since the Internet Explorer is deprecated or no more available
		 *       to be used, it is better to use the xpath locator and other methods to find or locate the locator of an element(s).
		 *       
		 * Q: Why should we know about cssSelector?
		 * A: The purpose of knowing about cssSelector is that we should have the knowledge of cssSelector, in case we get interview question, so 
		 *    we should have the answer. It does not mean that since xpath has more advantages, we will never use cssSelector. To find/locate the
		 *    locator of an element, we may still use only use cssSelector.
		 *    
		 * NOTE:
		 * When you want to use/create cssSelector, the preferred attributes/components of an element are "id" and "class";
         * ___When any specific element that you want to locate it's locator in the DOM and it has "id" attribute, you can use "#" hashTag 
         * instead of "id" attribute; the "#" hashTag is kind of helping with shorten the cssSelector syntax.
		 * ___Likewise, when any specific element that you want to locate it's locator in the DOM and it has "class" attribute, you can use "." dot 
         * instead of "class" attribute; Same the "." dot is kind of helping with shorten the cssSelector syntax.
         * ___But, with rest of the attributes you would use the normal cssSelector syntax.
         * 
         * ___Following are the examples of cssSelector syntaxes using all attributes: 
         *    a) id attribute: 
         *       ___tagName[id='idValue'] OR tagName#idValue OR #idValue (Must be unique locator)
         *    b) class attribute:
         *       ___tagName[class='classValue'] OR tagName.classValue OR .classValue (Must be unique locator)
         *    c) sub-string attribute:
         *       ___tagName[sub-string='sub-stringValue']
         *    d) otherAttribues:
         *       ___tagName[otherAttribute='otherAttributeValue']
         *    e) combination attribute:
         *       ___tagName[combination='combinationValue']
         *       
         * NOTE:
         * ____So, as you can see above that only attributes that are different in usage are the "id" and "class"
         * Basically, with "id" attribute you can use "#" hashTag and with "class" attribute you can use "." dot
         * and with rest of the attributes you have the same normal cssSelector syntax.
         * 
		 * ___Following are the examples of cssSelector syntaxes, when an element has "id" or "class" attributes:
		 *    1). ___cssSelector with usage of id attribute (an element that has id attribute in the DOM):
		 *        driver.findElement(By.cssSelector("input[id='email']")).sendKeys("xyandz@gmail.com");
		 *        OR:
		 *        driver.findElement(By.cssSelector("input#email")).sendKeys("xyandz@gmail.com");
		 *        OR:
		 *        driver.findElement(By.cssSelector("#email")).sendKeys("xyandz@gmail.com");
		 *    
		 *    2). ___cssSelector with usage of className (an element that has class attribute in the DOM):
		 *        driver.findElement(By.cssSelector("input[class='email']")).sendKeys("xyandz@gmail.com");
		 *        OR:
		 *        driver.findElement(By.cssSelector("input.email")).sendKeys("xyandz@gmail.com");
		 *        OR:
		 *        driver.findElement(By.cssSelector(".email")).sendKeys("xyandz@gmail.com");
		 *        
		 * ALSO:
		 * ____You can use these following symbols with cssSelector:
		 *     a) "^" ___Carat
		 *        ____________You can use "^" to find values that starts with your specific search value/text.
		 *     b) "$" ___Dollar sign
		 *        ____________You can use "$" to find values that ends with your specific search value/text.
		 *     c) "*" ___Asterisk/Star
		 *        ____________You can use "*" to find values that contains with your specific search value/text.
		 * 
		 * ____Below here are the examples of above symbols used in cssSelector:
		 * 
		 *     Original cssSelector: 
		 *           driver.findElement(By.cssSelector("tagName[attribute='attributeValue']")).click();
		 *           OR:
		 *           driver.findElement(By.cssSelector("input[title='Admissions']")).click();
		 *     "^" cssSelector  with _Carat:
		 *           driver.findElement(By.cssSelector("input[title^='Adm']")).click();
		 *     "$" cssSelector  with _Dollar sign:
		 *           driver.findElement(By.cssSelector("input[title$='ons']")).click();
		 *     "*" cssSelector  with _Asterisk/Star:
		 *           driver.findElement(By.cssSelector("input[title*='mission']")).click();         
		 * NOTE:
		 * It is still strongly recommended to use xpath in order to find/locate the locators on an element.
		 *    
		 */
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(2000);
		/*
		 * 1st is the Example usage of "id Locator" with "id" attribute:
		 * 2nd is the Example of cssSelector with "id" attribute:
		 * 3rd is the Example of cssSelector with usage of "#" hashTag instead of "id" attribute:
		 * Try each syntax individually:
		 */
		//driver.findElement(By.id("input-firstname")).sendKeys("James");
		//driver.findElement(By.cssSelector("input[id='input-firstname']")).sendKeys("James");
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("James");
		Thread.sleep(2000);
		/*
		 * 1st is the Example usage of "id Locator" with "id" attribute:
		 * 2nd is the Example usage of "className" with "class" attribute:
		 * 3rd is the Example of cssSelector with "class" attribute:
		 * 4th is the Example of cssSelector with usage of "." dot instead of "class" attribute:
		 * NOTE:
		 * Examples # 2nd, 3rd, & 4th are not going to work accurately, by use these example locators
		 * they are successful with sending the keys to the targeted input area. 
		 * And that is why none of them are recommended to use.
		 * Try each syntax individually:
		 */
		driver.findElement(By.id("input-lastname")).sendKeys("Bond");
		//driver.findElement(By.className("form-control")).sendKeys("Bond");//
		//driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("Bond");
		//driver.findElement(By.cssSelector("input.form-control")).sendKeys("Bond");
		//Thread.sleep(2000);
		/*
		 * 1st is the Example usage of "name Locator" with "name" attribute:
		 * 2nd is the Example usage of "id" with "id" attribute:
		 * 3rd is the Example of cssSelector with "id" attribute:
		 * 4th is the Example of cssSelector with usage of "#" hashTag instead of "id" attribute:
		 * 5th is the Example of cssSelector with usage of "^" _Carat with with "id" attribute:
		 * 6th is the Example of cssSelector with usage of "$" _Dollar sign with using "id" attribute:
		 * 7th is the Example of cssSelector with usage of "*" Asterisk/Star with using "id" attribute:
		 * NOTE:
		 * All examples are going to work successfully, but still cssSelector is not recommended to use.
		 * Try each syntax individually:
		 */
		//driver.findElement(By.name("email")).sendKeys("jamesbond007@gmail.com");
		//driver.findElement(By.id("input-email")).sendKeys("jamesbond007@gmail.com");
		//driver.findElement(By.cssSelector("input[id='input-email']")).sendKeys("jamesbond007@gmail.com");
	    //driver.findElement(By.cssSelector("input#input-email")).sendKeys("jamesbond007@gmail.com");
		//driver.findElement(By.cssSelector("input[id^='input-e']")).sendKeys("jamesbond007@gmail.com");
		//driver.findElement(By.cssSelector("input[id$='-email']")).sendKeys("jamesbond007@gmail.com");
		driver.findElement(By.cssSelector("input[id*='t-ema']")).sendKeys("jamesbond007@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("input-telephone")).sendKeys("2764946923");
		Thread.sleep(2000);
		driver.findElement(By.id("input-password")).sendKeys("15234");
		Thread.sleep(2000);
		driver.findElement(By.id("input-confirm")).sendKeys("15234");
		Thread.sleep(3000);
		driver.close();
		
	}
}
