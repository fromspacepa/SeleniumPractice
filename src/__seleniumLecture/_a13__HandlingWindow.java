package __seleniumLecture;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a13__HandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		/*
		 * ___Handling Windows with SELENIUM:
		 * 
		 * Windows handling in automation is basically the idea of having control over the windows that you open
		 * and the ability to move between and interact with them.
		 * Window handling is a unique identifier that holds the address of all windows. Think of it as a pointer
		 * to a window, which returns the String value. It is assumed that each browser will have a unique window
		 * handle.
		 * This window handle function helps to retrieve the handles of all windows.
		 * 
		 * Following are some of the methods that we use them for window handling:
		 * get.windowhandle();
		 * ___This method helps to get the window handle of the current window.
		 * get.windowhandles();
		 * ___This method helps to get handle all of the opened windows.
		 * set:
		 * set<String> set = driver.get.windowHandles();
		 * ___This method helps to set the window handles in the form of a String: 
		 * switchTo();
		 * ___This method helps to switch between the windows.
		 * action(); 
		 * ___This method helps to perform certain actions on the windows.
		 */
		
		//We click to open the next window (child window)
		/*
		 * WebElement openNewWindow = driver.findElement(By.id("newWindowBtn"));
		 * openNewWindow.click(); //we are storing our window (the parent and any child
		 * after that) here Set<String> allWindows = driver.getWindowHandles();
		 * //iterator will allow us to iterate through windows/tabs that are open by
		 * Selenium Iterator<String> itr = allWindows.iterator(); //The reason for below
		 * two lines of code is so that later when we call the
		 * //driver.switchTo().window(we can pass the window we want to switch to) here
		 * //We are storing the parent window in a String String parentWindow =
		 * itr.next(); //We are storing the child window in a String String childWindow
		 * = itr.next();
		 * 
		 * driver.switchTo().window(childWindow); driver.manage().window().maximize();
		 * driver.findElement(By.id("email")).sendKeys("email@email.com");
		 * Thread.sleep(3000);
		 * 
		 * driver.switchTo().window(parentWindow);
		 * driver.findElement(By.id("name")).sendKeys("text");
		 * 
		 * System.out.println("This is Child: " + childWindow);
		 * System.out.println("This is Parent: " + parentWindow);
		 * 
		 * Thread.sleep(6000); driver.quit();
		 */
	}

}