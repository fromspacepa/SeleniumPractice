package launchChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;

public class LaunchChrome {
	
	public static void main(String[] args) {
		
		/**
		 * 1. we have to make sure we have Chrome browser installed on our computer
		 * 2. we have to make sure we downlaoded and added the ChromeDirver to our project
		 * 3. we have to write the code to launch "https://www.facebook.com/" on chrome
		 * 
		 */
				
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		/**
		 * We need to create reference to WebDriver,
		 * I have access to all the functions in parent interface/class
		 * I also have access and can call the functions from the ChromeDriver class
		 * nochromedriver also extends chromium class
		 */
         
	    // ChromeDriver driver = new ChromeDriver();
	    // FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		/**
		 * We are not testing application in chrome browser anymore instead we want to use the Firefox browser.
		 */
		//to make sure we use the reference of WebDriver and then initialize it with our browser that we want
		//to launch our website
        //FirefoxDriver driver = new FirefoxDriver();
		
	 //we can use .get(); method to provide the url for the web browser and launch our browser
		driver.get("https://www.youtube.com/");
		
		//driver.get("https://www.bbc.com/");
		//driver.navigate();
		
	}

}
