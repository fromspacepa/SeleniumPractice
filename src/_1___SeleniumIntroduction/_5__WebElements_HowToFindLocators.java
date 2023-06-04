package _1___SeleniumIntroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5__WebElements_HowToFindLocators {

	public static void main(String[] args) {
		
		/**
		 * In this class we are talking about Selenium Web Elements and how to find locators on the web page:
		 */


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
}