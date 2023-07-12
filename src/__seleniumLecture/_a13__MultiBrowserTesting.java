package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _a13__MultiBrowserTesting {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * ___Multi Browser Testing w/ SELENIUM:
		 * 
		 * __With SELENIUM framework we can perform multi browser testing with help/use "if else" statements.
		 * You will add different browser in the conditions as demonstrated below, and based on condition whichever 
		 * or browser matched it will get launched. Which means that in SELENIUM framework only one browser could be 
		 * launched at a time.
		 * 
		 * The idea of Multi Browser Testing is to make sure that the application/program behaves the same in different browsers;
		 * for instance, in Chrome, Edge, Firefox, and any other browsers. It basically, depends on the project's needs.
		 * Coding-wise, to execute/run your project in different browsers, it won't take too much of work to code.
		 * 
		 * Some of the most common browsers that companies test their projects are in Chrome, Edge, Firefox; same we are going to 
		 * try our code execution in same multiple browsers.
		 * 
		 * NOTE:
		 * __To perform multiple browsers testing at the same time. Means that when you want to test your project on multiple
		 * browsers at the same time and that multiple browser will get launched at the same time; then you need TestNG Framework
		 * and it could be done through Maven Project
		 * 
		 */
		
		//chrome browser
		//firefox browser
		//edge browser
		WebDriver driver;
		String browser = "firefox";
				
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
					
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
					
		}else if(browser.equalsIgnoreCase("edge")){
			System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
					
		}else{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}


		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(2000);
		driver.close();
	
	}

}
