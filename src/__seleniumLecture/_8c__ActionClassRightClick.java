package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _8c__ActionClassRightClick {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
	/*
	 * ___Action Class in SELENIUM:
	 * 
	 * Action class is generally used to perform complex actions/gestures that you would perform with your Keyboard and Mouse.
	 * Things like: -> double click, -> right click, -> holding a key on the Keyboard OR -> pressing some keys on the Keyboard.
	 * Which means that whatever you can perform with KeyBoard or Mouse in order to interact with web elements, 
	 * you can basically perform same actions with the help of these methods. But, this could be only possible after you created
	 * the object of Action class.
	 *  
	 * There are lots of methods that comes with Action class, categorized in two main sections/events such as follows:
	 * 1) KeyBoard Events: 
	 * ____Methods to be performed by Keyboard:
	 *     sendKeys(); = Sends a serious of keys to the element.
	 *     keyUp(); = Performs key release.
	 *     keyDown(); = Performs key-press without releasing it
	 *  
	 * 2) Mouse Events:
	 * ____Methods performed by Mouse:
	 *     doubleClick(); = Performs double click on the element.
	 *     clickAndHold(); = Performs long click on the mouse without releasing it.
	 *     dragAndDrop(); = Drags the element from one point and drops it to another point.
	 *     moveToElement(); = Shifts the mouse pointer to the center of element.
	 *     contextClick(); = Performs right click on the mouse.
	 *     
	 * NOTE:
	 * a). When you are calling/using any of the Action class methods, you have to use the method: "perform();" 
	 *     after every single method of Action class is used in your coding.
	 * _____Following is the example of using "perform();" method:
	 *     action.moveToElement("//locatorOfEelement").perform();
	 *     
	 * b). In case you are calling/using more than one method of Action class in your code, then you have to use both methods "build();"
	 *     and "perform();" after every multiple methods of Action class is used.
	 * _____Following are three different ways of using "build();" and "perform();" methods:
	 *     1). action.moveToElement("//locatorOfElement").perform();
	 *         action.click().perform();
	 *     2). action.moveToElement("//locatorOfEelement").click().build().perform();
	 *     3). action.moveToElement("//locatorOfElement")
	 *         .click()
	 *         .build().perform();
	 * 
	 */

	
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement AmazonBasics = driver.findElement(By.linkText("Amazon Basics"));
		Actions action = new Actions(driver);
		action.contextClick(AmazonBasics).perform();
		
		Thread.sleep(6000);
		driver.close();
		
	}

}