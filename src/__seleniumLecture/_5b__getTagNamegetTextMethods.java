package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5b__getTagNamegetTextMethods {
	
	/*
	 * Following are some of the methods that needs to be practiced:
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//am i click on create new account in below code?
		//answer is: no
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		String tagName = element.getTagName();
		String text = element.getText();
		//what is the result of above code?
		//Answer is (a)
		driver.findElement(By.xpath("//"+tagName+"[text()='"+text+"']")).click();
		Thread.sleep(3000);
		driver.close();



	}

	private static void getTagName() {
		// TODO Auto-generated method stub
		
	}

}