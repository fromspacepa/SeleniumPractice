 package __seleniumLecture;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a14__HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * ___Handling Windows with SELENIUM:
		 * 
		 * Windows handling in automation is basically the idea of having control over the windows that you open
		 * and the ability to move between and interact with them.
		 * Window handling is a unique identifier that holds the address of all windows. Think of it as a pointer
		 * to a window, which returns the String value. It is assumed that each browser will have a unique window handle. 
		 * The "windowHandle" & "windowHandles" methods helps to retrieve handling between windows.
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
		 * 
		 * In the following demonstration we are opening one window which has an element that if you click on it,
		 * another new window gets open. It is sort of related windows that you would need to add or enter your
		 * credentials in both, and while entering your credentials you have to traverse between both windows.
		 * Step by step instruction is provided above each line of code below:
		 */
		
		//Setting the property of ChromeDriver by the project level.
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//Assigning the ChromeDriver into WebDriver object.
		WebDriver driver = new ChromeDriver();
		//Launching the web-page.
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//maximizing the web-page window.
		driver.manage().window().maximize();
		//applying waitTime in order to let the page load all of it's elements.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Storing the identified locator of specified element that would open the new window into the WebElement object that 
		WebElement openNewWindow = driver.findElement(By.id("newWindowBtn"));
		//Clicking on the above specified element to open new window.
		openNewWindow.click(); 
		//Storing both parent & child windows inside the object of "Set" interface.
		Set<String> allWindows = driver.getWindowHandles();
		//Iterator will allow us to iterate through windows/tabs that are open by SELENIUM.
		Iterator<String> itr = allWindows.iterator();
		//The reason for following two lines of code is so that later when we call the
		//"driver.switchTo().window(pass the window reference here)" methods is to pass each preferred 
		//window inside the "window("argument");" argument, so we iterate through windows.
		//Here storing the parent/first window in a String and assigning the "itr.next();" to it.
		String parentWindow = itr.next();
		//Then storing the child/second window in a String and assigning the "itr.next();" to it.
		String childWindow = itr.next();
		//This method will take us to the second/child window.
		driver.switchTo().window(childWindow);
		//maximizing the web-page window.
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//This method will help us enter the credential in second/child window.
		driver.findElement(By.id("email")).sendKeys("email@email.com");
		//This hardWiat will pause the code execution for 3-seconds.
		Thread.sleep(3000);
		//This method will take us back to the first/parent window.
		driver.switchTo().window(parentWindow);
		//This methods will help us enter the credentials in first/parent window.
		driver.findElement(By.id("name")).sendKeys("text");
		//This hardWiat will pause the code execution for 3-seconds.
		Thread.sleep(3000);
		//This method will close/quit both current open windows.
		driver.quit();
			
	}

}