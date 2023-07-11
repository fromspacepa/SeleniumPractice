package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _5__findingElementMethod {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//___pageLoadTimeout method:
		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);//This wait method used be used with older version of SELENIUM.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));	// SELENIUM 4 new method for "pageLoadTimeout".
		//___implicitlyWait method: 
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//This wait method used be used with older version of SELENIUM.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));// SELENIUM 4 new method for "implicittlyWait".
		driver.get("https://google.com/");
		Thread.sleep(2000);
		
		/*
		 * FindElement Method: (Both "findElement & findElements" methods comes with SearchContext Interface)
		 * __.findElement(); method is used to find a locator of a single web-page element in the DOM.
		 * __.findElements(); method is used to find locators of a list of web-page elements (that are located in the dropDown list/Button) in the DOM.
		 * 
		 * NOTE: 
		 * Since "SearchContext" interface is extended by "WebDriver" interface and then "WebDriver" interface is implemented by 
		 * "RemoteWebDriver" class and then "RemoteWebDriver" class is extended by ChromeDriver class, that is how you would be able to use 
		 * these "findElement & findElements" methods in the object of your ChromeDriver class and by using these methods will help to find 
		 * the locators of web-page elements
		 * a
		 * 
		 * NOTE:
		 * 1)__General information about Web-page Elements:
		 * Anything present on the web-page is considered as the web-element, such as: TextBox, Button, Link, Frame, Alerts, Images, and etc...
		 * Q: What are the basic components of web-element? 
		 * A: A Web-page Element comprises of HTML Tag, Attribute, and Text Field.
		 * Q: What is HTML Tag?
		 * A: Tag is an individual component of HTML document or a web page.
		 * Q: What are the Attributes?
		 * A: HTML Attributes are special words used inside the opening tag to control the behavior of elements
		 * Q: What is a Text Field?
		 * A: A text field is placed on the web page using the "input" tag name with the "type" attribute set with the value of text.
		 * 
		 * 2) Types of Elements on any Web-page:
		 *    1. edit box:
		 *    ___It is text control box that enables User to type a small amount of text.
		 *    2. link:
		 *    ___Which allow the User to click their way from page to page.
		 *    3. button:
		 *    ___Which represent the click-able button, which can be used in the forms OR any where in the document that needs simple standard button functionality.
		 *    4. image, imageLink, imageButton:
		 *    ___Which performs actions similar to the other fields, but with the images.
		 *    5. textArea:
		 *    ___Where we can enter the text.
		 *    6. checkBox:
		 *    ___Which is a selection box or the tick box, it is a small interactive box that can be used by the User to indicate the affirmative or negative choice/response.
		 *    7. radioButton OR optionButton:
		 *    ___Which is a graphical control element that allows the User to choose only one of the predefined set of mutually exclusive option. 
		 *    8. dropDownBox:
		 *    ___Which is a graphical control element similar to the listBox that allows the User to choose one value from the list,
		 *    ___dropDownBox is an active, that placed a single value, but when it is activated, it has/placed list of values from which the User may select a single value.
		 *    9. listBox:
		 *    ___Which contains list of options/values, and only one can be selected out of it.
		 *    10. comboBox:
		 *    ___Which contains the mixture of the dropDownBox, as well as the listBox.
		 *    
		 * NOTE:
		 * Operations/Actions that could be performed on the above mentioned Web-page Elements:
		 * 1. editBox:
		 *    _a) Entering particular value/text.
		 *    __b) Clearing that value/text.
		 *    ___c) Checking the enable status.
		 *    ____d) Checking the existence/availability.
		 * 2. link:
		 *    _a) Clicking on the link.
		 *    __b) Checking the existence/availability.
		 *    ___c) Checking the enable status.
		 *    ____d) Return the link name and many more.
		 * 3. button:
		 *    _a) Checking the display status.
		 *    __b) Checking the enable status.
		 *    ___c) Checking the select status.
		 * 4. image, imageLink, imageButton:
		 *    _a) general image has more functionalities.
		 *    __b) imageLink, which helps submitting the image.
		 *    ___c) imageButton, which re-directs to another web-page or location.
		 * 5. textArea:
		 *    _a) Return OR capture of the text area.
		 *    __b) Displaying the error message and so on...
		 * 6. checkBox:
		 *    _a) Checking the display status.
		 *    __b) Checking the enable status.
		 *    ___c) Checking the select status.
		 * 7. radioButton OR optionButton:
		 *    _a) Checking the display status.
		 *    __b) Checking the enable status.
		 *    ___c) Checking the select status.
		 * 8. dropDownBox:
		 *    _a) Checking the existence/availability.
		 *    __b) Checking the enable status.
		 *    ___c) Checking the select status of an item/value out of the dropDownBox.
		 *    ____d) Getting the items/values count.
		 * 9. listBox:
		 *    _a) Checking the select and de_select status of particular value in the listBox
		 * 10. comboBox:
		 *    _a) Checking the mixture contains status of dropDownBox and listBox
		 *    
		 * .findElement();___is used to find single locator of a single element in the web page.
		 * And to find a locator of an element, you need to find it by using "By.id" or any of the other locator among the other 8-types of locators.
		 * 
		 * Following is the example usage of "findElement" method:
		 * 
		 */
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("YouTube");
		Thread.sleep(2000);
		driver.close();

		
		
	}

}
