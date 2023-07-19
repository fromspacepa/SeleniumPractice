package __seleniumLecture;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _5c__getLocationgetSizegetRectMethods {

	public static void main(String[] args) {
		
		/*
		 * Following are some of the methods that needs to practiced
		 * getLocation();
		 * getRect();
		 * getSize();
		 */
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.xpath("//a[text()='Create new account']"));
		//getLocation();
		//getRect();
		//getSize();
		
		//Selenium 3
		//in selenium 3 we had two classes 
		//1. Point 2. Dimension
		//1. class Point will give us the location of an element 
		org.openqa.selenium.Point p = element.getLocation();
		System.out.println(p);
		//2. Dimension will give us the size of an element 
		org.openqa.selenium.Dimension d = element.getSize();
		System.out.println(d);
		System.out.println("----------------------");
		//Selenium 4
		//1. Rectangle
		org.openqa.selenium.Rectangle rect = element.getRect();
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		System.out.println(rect.getX());
		System.out.println(rect.getY());

	}

}
