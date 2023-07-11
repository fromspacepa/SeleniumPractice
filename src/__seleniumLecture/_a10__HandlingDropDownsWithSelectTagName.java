package __seleniumLecture;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;



public class _a10__HandlingDropDownsWithSelectTagName {
	
		public static void main(String[] args) throws InterruptedException {
						
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
	        WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			/*                        ________ 
			 * __Handling dropDowns: |_______v| <--this is how the "dropDown" looks on the web-page.
			 * (if you click on the "v" arrowDown button, list of items/elements will appear)
			 *
			 * NOTE:
			 * _dropDowns are contained with list of values/items/elements on the web-page.
			 * _dropDown itself is the web-page element and any listed values/options inside the dropDrown are elements.
			 * _the tagName for dropDown is always named "select" but sometimes the tagName for dropDown is not "select", it could be any name.
			 * _dropDown with tagName "select" is handled differently then the dropDown with tagName not "select"
			 * _To handle dropDown or interact with any of elements listed in the dropDown, first you would need to identify the locator 
			 * for dropDown itself, then select/go to any of the elements listed in the dropDown.
			 * _So, in order to handle with dropDown elements, you could perform that action in three different ways with the help of three
			 * different methods that comes with "Select" class, which are as follows:
			 *    1) attributeOfSelectClassObject.selectByIndex();
			 *    ___is used to identify the locator of an element listed in the dropDown by index.
			 *    2) attributeOfSelectClassObject.selectByValue();
			 *    ___is used to identify the locator of an element listed in the dropDown by Value, as it shows in the DOM.
			 *    3) attributeOfSelectClassObject.selectByVisibleText();
			 *    ___is used to identify the locator of an element listed in the dropDown by Text, as it shows in the DOM.
			 *    
			 * To demonstrate how to handle the dropDown, we are using all three methods in the example below:
			 * .selectByValue();
			 * .selectByIndex();
			 * .selectByVisibleText();
			 * in the following example 
			 * SCENARIO:
			 * We are handling the dropDown that represents the list of months in the FaceBook web-page, 
			 * when you are trying to create new account.
			 * -> Open the FaceBook web-page in the ChromeDriver;
			 * -> Click on Create new account;
			 * -> Select one of months listed in the dropDown that represents list of months.
			 * 
			 */
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
			Thread.sleep(2000);
			//Assigning the locator of a dropDown element into the WebElement
			WebElement drpMon =driver.findElement(By.xpath("//select[@id='month']"));
			//Passing the WebElement attribute into the Select class object:
			Select monthsDrp = new Select(drpMon);
			//Calling one of the elements listed in the dropDown in three different ways:
			//monthsDrp.selectByValue("3");
			//monthsDrp.selectByIndex(8);
			monthsDrp.selectByVisibleText("Dec");
			Thread.sleep(2000);
			
			//Thread.sleep(1000);
			driver.quit();
			

		}

	}