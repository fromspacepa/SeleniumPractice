package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _6f__FindingLocators_ByXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		// System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		// System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver1 = new EdgeDriver();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.get("http://tek-school.com/retail/");
		
		/*
		 * ___xpath Locator:
         * By.xpath();
		 * SELENIUM is using Locators that can be turned in as an address which identifies a Web-page Element(s) uniquely within the web-page.
		 * __Locators are the HTML properties of a web-page elements that represent the address for each element on the web-page, 
	     * __In SELENIUM Locators are used to identify web elements on a web-page. They are used as an argument passed to the finding element methods.
	     * __There are several types of Locators an mentioned in the "Locators_Introduction" class. Identifying web elements is a tricky approach.
	     * __Basically, SELENIUM uses Locators to interact with the web Elements on the web-page. 
		 *  
		 * _xpath is standard XML path language, it is a language which we can use to find/locate the locator of an element in the DOM.
		 * We have two types of _xpaths:
		 * 1). Absolute _xpath:
		 *     It starts with HTML tagName and goes through all attributes and locators; it very lengthy locator to be used.
		 * 2). Relative _xpath:
		 *     It doen't starts with HTML tagName, it starts with "//" two forwarded slashes, then tagName, and so on... 
		 *     such as: "//tagName[attribute='attributeValue']"
		 *     Relative _xpath is traversing through parent to child and child to parent attributes, this would be at the time when you have 
		 *     a dropDownButton element on the web-page; For instance, the dropDownButton is contained of 12 elements for 12-twelve months of a year
		 *     and lets say that you are trying to get the element of July so, in order to do that, you would create the Relative _xpath to traverse 
		 *     from parent to child attributes to get the targeted element locator. 
		 *     __Following are the examples to get the locator:
		 *     "//parentTagName[@attribute='attributeValue']//child::childTagName[7]"
		 *     OR
		 *     "//select[@id='month']//child::option[7]"
		 *     OR
		 *     "//select[@id='month']//child::option[@value='7']"
		 *     __Following are the examples of _xpath traversing from child to parent attributes to get the targeted element locator:
		 *     "//childTagName[@attribute='attributeValue']//parent::parentTagName[@attribute='attributeValue]"
		 *     OR
		 *     "//option[@value='7']//parent::select[@id='month']
		 *     
		 * 3). Dynamic/Customized _xpaths:
		 *     Are the customized _xpaths, In some cases the locator of an element has no common attributes in the DOM or the locator gets change every time
		 *     you trying to reach out to the specific locator of an element; so to handle these kind of situations you should use following functions with
		 *     your Dynamic/Customized _xpaths, basically it depends on the situation that which one of the following should you use.
		 *     For more information, please go through each of the following functions:
		 *     a). contains
		 *     b). starts-with
		 *     c). ends-with
		 * 
		 * a). contains function:
		 *     __contains refers to the attributeValue assigned to the attribute in the DOM.
		 *      In case you are trying to locate the locator of an element that it has none of the common used attributes, such as: id, name, className, and etc..
		 *     than, you can handle these dynamic elements/attributes with the help of using following functions within your Dynamic/Customized _xpaths:
		 *     Examples:
		 *     Original _xpaths:
		 *     "//tagName[@attributeName='attributeValue']" OR "//a[@XYZ='ABCDE']"
		 *     "//tagName[attributeName()='attributeValue']" OR "//a[text()='Customer Service']"
		 *     contains _xpath:
		 *     "//tagName[contains(@attributeName,'attributeValue')]" 
		 *     "//a[contains(text(),'Customer Service')]"
		 *     
		 * b). starts-with function:
		 *     __starts-with refers to the beginning portion of attributeValue assigned to the attribute in the DOM. 
		 *     __starts-with function could be used with both _xpath version 1.0 & 2.0 used by your operational web-site
		 *     __Sometimes what happens that you are looking for locator of an element but the value of an attribute for that specific locator in the DOM gets change
		 *     every single time you trying to reach out that specific locator of an element. So, in order to not lose the locator of an element, you should use the
		 *     "starts-with" in your _xpath. For instance: When you initially/first time reached out to the locator of an element, the value of an attribute was:
		 *     (class="hm-icon-label") and you tried to reach out to the same locator second time, the value was changed to: (class="hm-label-icon") so, in this 
		 *     case you should use the "starts-with" function in your _xpath, such as follows
		 *     Examples:
		 *     "//tagName[starts-with(@class,'hm')]" OR "//tagName[starts-with(@attributeName,'startPortionOfAttributeValue')]" 
		 *     OR "//tagName[starts-with(@attributeName,'startPortionOfAttributeValue')]"
		 *     
		 * c). ends-with function:
		 *     __ends-with refers to the ending portion of attributeValue assigned to the attribute in the DOM.
		 *     __ends-with function is only used/functional with _xpath version 2.0, so if the web-site is using _xpath version is 1.0 it will not work. 
		 *     __Same as "starts-with" function this "ends-with" function could be used within the _xpath in order to not lose the locator of an element that
		 *     changes every time you trying to reach out to that specific locator of an element.
		 *     Examples:
		 *     Original _xpath:
		 *     "//tagName[@attributeName='attributeValue']" OR "//span[@class='hm-icon-label']"
		 *     ends-with _xpath:
		 *     "//tagName[ends-with(@attributeName,'attributeValue')]" OR "//span[ends-with(@class,'-label')]" 
		 *     
		 * In this following scenario all the above functions are used:
		 * 
		 */
		
		//driver1.findElement(By.xpath("//a[@title='My Account']")).click();
		driver1.findElement(By.xpath("//a[contains(@title,'My Account')]")).click();
		Thread.sleep(2000);
		//driver1.findElement(By.xpath("//a[text()='Login']")).click();
		//Example usage of "contains" function within the _xpath Locator:
		driver1.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@id='input-email']")).sendKeys("fhamed832@gmail.com");
		//Example usage of "starts-with" function within the _xpath Locator:
		//driver1.findElement(By.xpath("//input[starts-with(@id,'input-em')]")).sendKeys("fhamed832@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234ASD");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		//Example usage of "ends-with" function within the _xpath Locator:
		//driver1.findElement(By.xpath("//input[ends-with(@type,'bmit')]")).click();//This is not going to work.
		System.out.println("TecSchool Retail Login to:\t" + driver1.getTitle());
		Thread.sleep(2000);
		//driver1.quit();

	}

}
