package __seleniumLecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _3__seleniumMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		
		/*
		 * METHODS: (that comes with SELENIUM WebDriver interface)
		 * 
		 * To use SELENIUM methods, first of all, we obviously need to set the property of any web browser driver that we are using in our SELENIUM project,
		 * then instantiate an object of WebDriver interface, then you would be able to use any method of that WebDriver interface in your object; 
		 * above we instantiated the object of WebDriver and named it as "driver" 
		 *  
		 * ___Methods and Explanation:
		 * .get("WebsitURL");__This method is used to get any web site just by adding the Url address of it inside the argument.
		 * .getTitle();__This method is used to get the title/name of any web page you are using in your SELENIUM project.
		 * .getCurrentUrl();__This method is used to get the current Url address of web page you are using in your SELENIUM project.
		 * .getPageSource();__This method is used to get the page source of any web page you are using in your SELENIUM project.
		 * .close();__This method is used to close the current open web page of any web page you are using in your SELENIUM project.
		 * .quit();__This method is used to quite all the current open web pages of any web pages that are remained open.
		 * 
		 * Following here is the example of using the above methods along with other methods to get the sense of it:
		 */

		driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();//This method is used to maximize the window of current called/launched web page.
	    driver.manage().deleteAllCookies();//This method is used to delete all the cookies affiliated with web page.
        System.out.println("The title of 1st webPage:\t" + driver.getTitle());
        System.out.println("The Url of 1st webPage:\t\t" + driver.getCurrentUrl());
		driver.switchTo();//This method is used to switch from current open web page to next web page provided in the following .get() method.
		driver.get("https://www.google.com/");
        System.out.println("The title of 2nd webPage:\t" + driver.getTitle());
        System.out.println("The Url of 2nd webPage:\t\t" + driver.getCurrentUrl());
        driver.getPageSource(); 
        driver.close(); 
        driver.quit(); 

	}

}
