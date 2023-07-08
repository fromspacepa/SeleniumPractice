package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _8f__FindingLocators_ByXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	    //System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		
		WebDriver driver1 = new EdgeDriver();
		driver1.get("http://tek-school.com/retail/");
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies(); 
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.findElement(By.xpath("//a[@title='My Account']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@id='input-email']")).sendKeys("fhamed832@gmail.com");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234ASD");
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("TecSchool Retail Login to:\t" + driver1.getTitle());
		Thread.sleep(2000);
        driver1.quit();

	}

}
