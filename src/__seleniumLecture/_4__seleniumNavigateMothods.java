package __seleniumLecture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _4__seleniumNavigateMothods {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
		
		/*
		 * NAVIGATE METHODS: (that comes with SELENIUM WebDriver interface)
		 * 
		 * To use SELENIUM Navigate Methods, first of all, we obviously need to set the property of any web browser driver that we are using in our SELENIUM project,
		 * then instantiate an object of WebDriver interface, then you would be able to use any method of that WebDriver interface in your object; 
		 * above we instantiated the object of WebDriver and named it as "driver" 
		 * 
		 * ___Navigate Methods and Explanation:
		 * .navigate().to();__This method works the same as "switch to" method, but in here you just add the URL in the argument.
		 *                    However, the .switchTo() method needs to be followed by the .get() method, such as following example:
		 * .navigate().forward();__This method is used to navigate to the next web page; it is like clicking on the forward button on your web page.
		 * .navigate().back();__This method is used to navigate from current open web page to your previous opened/used web page.
		 * .navigate().refresh();__This method is used to refresh your web page.
		 * 
		 * Following here is the example of using the above methods along with other methods to get the sense of it:
		 */

		driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();//This method is used to maximize the window of current called/launched web page.
	    driver.manage().deleteAllCookies();//This method is used to delete all the cookies affiliated with web page.
        Thread.sleep(2000);//This method is used to make the flow of execution wait for certain seconds. 
	    System.out.println("Title of 1st webPage:\t" + driver.getTitle());
        System.out.println("Url of 1st webPage:\t\t" + driver.getCurrentUrl());
        driver.navigate(). to ("https://www.google.com/");
        System.out.println("Title of 2nd webPage:\t" + driver.getTitle());
        System.out.println("Url of 2nd webPage:\t\t" + driver.getCurrentUrl());
        Thread.sleep(2000);
		driver.switchTo();
		driver.get("https://www.youtube.com/");
        System.out.println("Title of 3rd webPage:\t" + driver.getTitle());
        System.out.println("Url of 3rd webPage:\t\t" + driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("Title of backwarded webPage:\t" + driver.getTitle());
        System.out.println("Url of backwarded webPage:\t" + driver.getCurrentUrl());
        Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
        System.out.println("Title of forwarded webPage:\t" + driver.getTitle());
        System.out.println("Url of forwarded webPage:\t" + driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.getPageSource(); 
        driver.close(); 
        driver.quit();


	

	}

}