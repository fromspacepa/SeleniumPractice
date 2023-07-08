package __seleniumLecture;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _8h__FindingLocators_ByTagName {

	public static <WebElements> void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new FirefoxDriver();
		//WebDriver driver2 = new EdgeDriver();
		
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.com/");
		//driver.navigate().to("https://www.amazon.com/");
		driver.findElements(By.tagName("a"));
		 
		List <WebElement> listLink = driver.findElements(By.tagName("a"));
		  System.out.println(listLink.size()); for (int i = 0; i < listLink.size();
		  i++) { String linkText = listLink.get(i).getText();
		  System.out.println(linkText); }
		 
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
