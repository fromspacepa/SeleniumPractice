package __seleniumLecture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a18__Utilities {
	
	
	/*
	 * Utilities Class:
	 * 
	 * We you are working on BDD FrameWork or any frameWork, you then create a  folder and named as: Utilities.
	 * This Utilities folder will be a contained of "Utilities" class and in the mentioned you would have create 
	 * or created as many as frequently useful methods for future use of your framework and save all the methods 
	 * inside mentioned Utilities class. 
	 * 
	 * Below here are some of the methods that useful in the framework, such as:
	 * -> TakingScreenShot
	 * -> Click method ____ (Using the help of Java Script Executor interface by writing the Java Script language)
	 * -> Giving Border to an element ____ (Using the help of Java Script Executor interface by writing the Java Script language)
	 * -> Highlighting element's background ____ (Using the help of Java Script Executor interface by writing the Java Script language)
	 * -> Giving Border and Highighting an element ____ (Using the help of Java Script Executor interface by writing the Java Script language)
	 * -> Scrolling down the page ____ (Using the help of Java Script Executor interface by writing the Java Script language)
	 * -> Sending Keys ____ (Using the help of Java Script Executor interface by writing the Java Script language)
	 */

	public static WebDriver driver;

	public static void compareText(String actualText, String expectedText) {

		if (actualText.equalsIgnoreCase(expectedText)) {
			System.out.println(actualText + " = " + expectedText + "Passed");
		} else {
			System.out.println(actualText + " != " + expectedText + "Failed");
		}
	}

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	}
	// The reason we use JSExecutor
	// 1 - The web browser is implementing JavaScrip language and by using
	// JSExecutor
	// it is easy for JSExecutor to interact with element in the web browser
	// 2 - When we use multi browser testing, we will be writing our locators (xpaths,
	// cssSelector, etc...)
	// but we will be collecting locator and use one browser (chrome), but when we
	// execute our test in firefox, we may not be able to click or sendkeys or do some 
	// other actions, that is when we need JSExecutor

	// method for taking screenshots
	public static void takeScreenShot(String fileName) throws IOException {
		// we need to create a folder at project level and store the path here so that
		// when even we take screenshots, they are all saved in that specific folder
		String path = ".\\screenshots\\";
		// I create object of the file class
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// After taking the screenshot, take the file and store it in a location in my
		// computer
		// and also I want to provide the file_name and the extension
		FileUtils.copyFile(file, new File(path + fileName + ".png"));
	}

	// JSExecutor methods start
	// .click()
	// if the .click() does not work, then we get the help JSExecuter
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	// How we can give border to an element on webpage
	public static void highlightelementRedBorder(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid red'", element);
	}

	// How we can highlight an element background
	public static void highlightelementBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.background='yellow'", element);
	}

	// What if we want to do both/above with same method?
	// give border and highlith
	public static void highlightelementBorderAndBackground(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

	// How we can scroll down the page with JSExecutor
	public static void scrolldownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	// how to sendkeys with JSExecutor
	public static void sendKeys(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}

}
