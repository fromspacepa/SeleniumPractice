package _1___SeleniumIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3__SeleniumMethods {

	public static void main(String[] args) {
		
		/**
		 * In this class we will talk about Selenium Methods and there functions:
		 * 
		 * 
		 */
		
        // This following method is used to set the property of a WebDriver you will be using in your selenium project:
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		/**
		 * >>> Explanation of the ^ above "setProperty()" method:
		 * -> "System.setProperty": is to set property of a web driver you will be using it in your selenium project for automation.
		 * -> "WebDriver.Chrome.Driver": is the "key" portion inside the .setProperty() method and it is kind of a reference to any driver that you are using, 
		 *    if you are using Firefox driver then you would change the "Chrome" to Firefox and the same changes to any other WebDriver you would decide to use.
		 * -> ".\\drivers\\chromedriver.exe": is the "value" portion inside the argument of your setProperty() method, it has three sections, which are as follows:
		 *    1) "." <- this dot points to the path of a web driver which is located in the project level or you can say which is in the current selenium project
		 *    that you are currently working in it. 
		 *    2) "\\drivers\\chromedriver": <- this is the link address of a web driver which is located in the drivers folder in your current selenium project.
		 *    You can get to this address or get the address by doing the following steps: 
		 *    -> Open the drivers folder (a folder will open)
		 *    -> hover your mouse on the driver link and right click of your mouse (a list of menu will open)
		 *    -> click on properties (a page of properties will get open)
		 *    -> select all the link in front of where it is written "location:"
		 *    -> with right click of your mouse select copy
		 *    -> past it inside the "value" portion in the argument of ".setProperty("key", "value")" method.
		 *    -> make it short from the original lengthy link as: "\\drivers\\chromedriver.exe"
		 *    Basically, it is the path to a specific web driver you are using in your selenium project, which is located in the drivers folder in your selenium project,
		 *    The same, you would need to get the path of any web driver you are using from drivers folder in your selenium project.
		 *    3) ".exe" <- this portion is the extension to your chrome driver, it is only used in windows systems; not in IOS/Apple systems.
		 */
		
		// This is to create an instance/object of a class ChromeDriver:
		//ChromeDriver driver1 = new ChromeDriver();
		/**
		 * ChromeDriver is the child/sub class of RemoteWebDriver class, and RemoteWebDriver implements from WebDriver interface
		 * ChromeDriver class extends from RemoteWebDriver class, it also has it's own methods and functions.
		 * NOTE: If you create an object/reference of ChromeDriver class, it will be only used for Chrome web driver.
		 * 
		 */
		
		// This following method is used to create an instance of ChromeDriver:
		WebDriver driver = new ChromeDriver();
		/**
		 * NOTE: If you create an object/reference under WebDriver interface, you would not need to create an object/reference of any other web driver, you would just 
		 * need to do UpCasting of WebDriver interface to any web driver you would like to use in your selenium project; you would only need to change the initialization
		 * portion from "ChromDriver" to "FirefoxDriver" "EdgeDriver" or any other driver you would like to use. 
		 * This way your ChromeDriver will extends some methods from "RemoteWebDriver".
		 */
		
		// These following methods are used for various functions:
		driver.get("https://www.youtube.com/");// ".get()" <- This get method is used to get to any WebSite, by adding the url address inside the argument.
		driver.switchTo();// ".switch(): <- This method is used to switch to any other WebSite by following use of the ".get()" get method as above.
		driver.get("https://www.google.com/");//".get()" <- This get method is used to get to any WebSite, by adding the url address inside the argument.
        driver.manage().window().maximize();// This method is used to maximize the window/page of any web browser you are using in your selenium project.
        driver.getTitle();// ".getTitle()" <- This method is used to get the title/name of any web page you are using in your selenium project.
        driver.getPageSource();// ".getPageSource()" <- This method is used to get the page source of any web page you are using in your selenium project.
        driver.close();// ".close()" <- This method is used to close the current open web page of any web page you are using in your selenium project.
        driver.quit();// ".quit()" <- This method is used to quite all the current open web pages of any web pages you are using in your selenium project.

	}

}
