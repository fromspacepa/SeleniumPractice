package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _0__Selenium_Introduction {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * ___SELENIUM INTORDUCTION: 
		 * 
		 * Question: What is SELENIUM?
		 * Answer: SELENIUM is an open source (free) automated testing suite to test web applications.
		 *         It supports different platforms and browsers.
		 *         SELENIUM is a set of different software tools, each tool has a different approach in supporting web based automation testing.
		 *         It has four components such as:
		 *                                       1) SELENIUM IDE (SELENIUM Integrated Development Environment)
		 *                                       2) SELENIUM RC (SELENIUM Remote Control)
		 *                                       3) SELENIUM WebDriver
		 *                                       4) SELENIUM Grid
		 * 
		 * 1) Question: What is SELENIUM IDE?
		 * Answer: SELENIUM IDE is a _Firefox plug-in. It is the simplest framework in the SELENIUM suite.
		 *         It allows us to record and play-back the scripts; Even though, we can create scripts using SELENIUM IDE
		 *         In addition: We need to use SELENIUM RC or SELENIUM WebDriver to write more advanced and robust test cases.
		 *         __QUESTION: Which is the only browser that supports SELENIUM IDE to be used?
		 *         __ANSWER: Firefox_
		 * 
		 * 2) Question: What is SELENIUM RC?
		 * Answer: SELENIUM RC (SELENIUM Remote Control) was the main SELENIUM project that sustained for a long time before 
		 *         SELENIUM WebDriver version "SELENIUM 2.0" came into existence; Now SELENIUM RC is hardly in use,
		 *         as WebDriver offers more powerful features, however, users can still continue to develop scripts using SELENIUM RC.
		 *         
		 * 3) Question: What is SELENIUM WebDriver?
		 * Answer: SELENIUM WebDriver AKA SELENIUM 2 is a browser automation frame work that accepts commands and sends them to a browser.
		 *         It is implemented through a browser-specific driver.
		 *         It controls the browser by directly communicating with it.
		 *         SELENIUM WebDriver supports JAVA, C#, PHP, PYTHON, PERL, and RUBY.
		 * 
		 * 4) Question: What is SELENIUM Grid?
		 * Answer: SELENIUM Grid is a tool used together with SELENIUM RC to run tests on different machines against different browsers in Parallel,
		 *         that is running multiple tests at the same time against different machines running different browsers and operating systems. 
		 *         
		 *         
		 *         
		 * In this class we are talking about WebDriver interface, following here is the structure:
		 * 
		 *                                      WebDriver  <- is the interface
		 *                                          |
		 *                                          |
		 *                                   RemoteWebDriver <- implements WebDriver
		 *                                          |
		 *                                          |
		 *                JSExecutor -------------->|<------------- TakesScreenShot
		 *                                          |
		 *                                          |
		 *         _________________________________|_________________________________
		 *         |                    |                       |                    |
		 *         |                    |                       |                    |
		 *     ChromeDriver       FirefoxDriver             EdgeDriver          SafariDriver
		 *                                          
		 * __As shown in the above diagram that "WebDriver" is the interface which is implemented by the "RemoteWebDriver" class; "TakeScreenShort" method which comes 
		 * with "RemoteWebDriver" class, it is used to take screen shot of your test case, also the "JSExecutor / JavaScript Executor" comes with "RemoteWebDriver" 
		 * class and it is going to help us with executing some of the methods, such as: click(); and sendkeys();.
		 * ChromeDriver, FirefoxDriver, EdgeDriver, and SafariDriver are subClasses of RemoteWebDriver.
		 * 
		 * __Following is the demonstration of how to launch Chrome, Firefox, and Edge web browsers and using some of the methods to launch YouTube, FaceBook and then
		 * maximize, switch from one web browser to another web browser and at the close/quite all the web browsers.
		 *                                
		 *
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
		

		/*
		 * >>> WebElement --- DOM --- Locators --- Waits EXPLAINATION:
		 * 
		 * Here in this class we are covering about WebElements, Locators, and Waits that are generally used in Selenium project:
		 * 
		 * ___WebElement & DOM:
		 * 1) WebElements:
		 * Q: What is WebElement? 
		 * A: WebElement in an interface that represents a DOM (Document Object Model).
		 * Q: What is DOM? 
		 * A: The Document Object Model (DOM) is a programming interface for web documents. It represents the page so that programs can change the document structure,
		 * style, and content. The DOM represents the document as nodes and objects; that way, programming languages can interact with the page. 
		 * A web page is a document that can be either displayed in the browser window or as the HTML source. In both cases, it is the same document but the Document 
		 * Object Model (DOM) representation allows it to be manipulated. As an object-oriented representation of the web page, it can be modified with a scripting 
		 * language such as JavaScript.
		 * For example, the DOM specifies that the querySelectorAll method in this code snippet must return a list of all the <p> elements in the document: 
		 * Basically, When you are doing Test Automation of a web page (web browser) based application and that application has many elements and to interact with any
		 * of those elements you have to go through DOM; Because, all of the elements are scripted as nodes and objects in the DOM and all those elements have specific
		 * locators in the DOM. And to find those locators we have to find them with the help of "findElement" or "findElements" methods.
		 * We can find any of those elements with the help of following locators in Selenium:
		 * ID, ClassName, TagName, LinkText, PartialLinkText, Xpath, and CSS Selector.
		 * 
		 * ___To go to DOM you would do the following:
		 * -> Right click of your mouse, after hover your mouse on the web page element
		 * -> Then click on "inspect" (The DOM page will get open)
		 * -> Once your in the DOM, you can hover your mouse and find the unique locator of your web page element
		 * -> Click "ctrl" + "f" keys on your keyboard if you want to write your own locator, such as Xpath or LinkText.
		 * 
		 * ____LOCATORS:
		 * Q: What Locators are available in Selenium?
		 * A: Locators that are available in Selenium are: 1)ID, 2)ClassName, 3)Name, 4)TagName, 5)LinkText, 6)PartialLinkText, 7)Xpath, and 8)CSS Selector
		 * NOTE: We will have examples of finding elements with the help of these locators in the coming classes.
		 * 
		 * >>>> Waits in Selenium WebDriver:
		 * We have following Waits in Selenium: 
		 * 1) Dynamic Wait (Soft Wait or Smart Wait)
		 *   a) Implicit Wait:
		 *     i) Implicit wait method directs Selenium WebDriver to wait for a certain amount of time before throwing an exception/error.
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
		 *      Static or Hard Wait is not usually recommended to be used in Selenium Test Cases; You could use it only as a demo or when you are explaining a test case or
		 *      when you have no other options.
		 * NOTE: Static/Hard Wait method is making the test case hard wait, it basically makes the test case execution process slow.
		 * Any where in the test case it is applied, the process of Automation test case  execution will go through hard wait then to the next step in the test case. 
		 * 
		 * 3) PageLoadTimeOut Wait:
		 *    PageLoadTimeOut Wait method will make the web page wait for certain period of time to load all of the web page elements on the web page, before throughing
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
		 *    ___Implicit wait and PageLoadTimeOut wait methods are always recommended to be used in the Selenium Automation Test Cases, 
		 *    in fact, both are used in real time work space.
		 *    ___But, the Explicit wait and Fluent wait methods are used per needs/requirement.
		 *    Basically, you would have Explicit, Fluent, and other similar methods created in your project level and saved them in the Utilities folder, 
		 *    so you could use them based on your needs/requirements in your Automation Test Cases based.
		 *   
		 * >>>Below here in the following Scenario all the above topics are practiced:
		 * 
		 * SCENARIO:
		 * -> Launching the Chrome, Edge, and Firefox browsers one at a time.
		 * -> Launching the Web page application, which is the Tek-School Retail application.
		 * -> Creating an account with adding all the credentials in the Tek-School Retail application.
		 * -> Switching out from Tek-School Retail application and launching YouTube web page on different browser. 
		 * -> Then quieting all the open browsers.
		 *
		 */
		
		
		//Following methods are used to create an instance of ChromeDriver, EdgeDriver, and FirefoxDriver:
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		
		/**
		 * NOTE: If you create an object/reference under WebDriver interface, you would not need to create an object/reference of any other web driver, 
		 * you would just need to do UpCasting of WebDriver interface to any web driver you would like to use in your selenium project; you would only 
		 * need to change the initialization portion from "ChromDriver" to "FirefoxDriver" "EdgeDriver" or any other driver you would like to use. 
		 * This way your ChromeDriver will extends some methods from class "RemoteWebDriver".
		 */

		driver.get("https://www.youtube.com");//".get();" This get method is used to get to any WebSite, by adding the url address inside the argument.
		driver.manage().window().maximize();//This method is used to maximize the window/page of any web browser you are using in your selenium project.
		driver.switchTo();//".switchTo(): This method is used to switch to any other WebSite by following use of the ".get()" get method as above.
		driver.get("https://www.facebook.com");
		driver.close();//".close()" <- This method is used to close the current open web page of any web page you are using in your selenium project.
        driver.quit();//".quit()" <- This method is used to quite all the current open web pages of any web pages you are using in your selenium project.

		
		
		
		
		
		
		

	
	}
}
