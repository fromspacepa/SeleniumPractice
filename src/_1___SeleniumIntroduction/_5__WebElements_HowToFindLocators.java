package _1___SeleniumIntroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5__WebElements_HowToFindLocators {

	public static void main(String[] args) throws InterruptedException {
		
		/**
		 * In this class we are talking about Selenium Web Elements and how to find locators on the web page:
		 */


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		//driver.findElement(By.id("APjFqb")).sendKeys("VOAPashto.com");
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.className("gNO89b")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3")).click();
		//driver.findElement(By.xpath("//*[@id=\"wrowblock-32536_140\"]/div/div[2]/div/ul/li/div/div/a/h4")).click();
		//Thread.sleep(4000);
		//driver.quit();
		driver.get("https:www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input")).sendKeys("PashtoSongs2023");
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
		driver.findElement(By.className("\"yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded\"")).click();

	}
}