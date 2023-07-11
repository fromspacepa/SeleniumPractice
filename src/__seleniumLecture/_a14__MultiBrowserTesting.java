package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _a14__MultiBrowserTesting {
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * ___Multi Browser Testing w/ SELENIUM:
		 * 
		 * The idea of Multi Browser Testing is to make sure that the application/program behaves the same in different browsers;
		 * for instance, in Chrome, Edge, Firefox, and any other browsers. It basically, depends on the project's needs.
		 * Coding-wise, to execute/run your project in different browsers, it won't take too much of work to code.
		 * 
		 * Some of the most common browsers that companies test their projects are in Chrome, Edge, Firefox; same we are going to 
		 * try our code execution in same multiple browsers.
		 * 
		 * NOTE:
		 * To change your browser, you need to change your driver and the property that you set.
		 * Also, we have a Utility driver manager that we can use to take care of the drivers for us; We will be using that Utility in our framework.
		 * 
		 */
		
		//chrome browser
		//firefox browser
		//edge browser
		WebDriver driver;
		String browser = "edge";
				
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
					
		}else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
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
