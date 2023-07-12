package __seleniumLecture;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a14__HandlingTabs {
	public static void main(String[] args) throws InterruptedException {
		
		
		/*
		 * Tab Handling with SELENIUM:
		 * 
		 * Tab handling is almost the same idea of window handling and you need to use same methods
		 * that you used in the window handling concept, such as follows:
		 * 
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
		

		//Setting the property of ChromeDriver by the project level.
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//Assigning the ChromeDriver into WebDriver object.
		WebDriver driver = new ChromeDriver();
		//Launching the web-page.
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//maximizing the web-page Window.
		driver.manage().window().maximize();
		//applying waitTime in order to let the page load all of it's elements.
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Storing the identified locator of specified element that would open the new Tab into the WebElement object that 
		WebElement openNewTab = driver.findElement(By.id("newTabBtn"));
		//Clicking on the above specified element to open new Tab.
		openNewTab.click(); 
		//Storing both parent & child windows inside the object of "Set" interface.
		Set<String> allWindows = driver.getWindowHandles();
		//Iterator will allow us to iterate through windows/tabs that are open by SELENIUM.
		Iterator<String> itr = allWindows.iterator();
		//The reason for following two lines of code is so that later when we call the
		//"driver.switchTo().window(pass the Tab reference here)" methods is to pass each preferred 
		//Tab inside the "window("argument");" argument, so we iterate through Tabs.
		//Here storing the parent/first Tab in a String and assigning the "itr.next();" to it.
		String parentTab = itr.next();
		//Then storing the child/second Tab in a String and assigning the "itr.next();" to it.
		String childTab = itr.next();
		//This method will take us to the second/childTab.
		driver.switchTo().window(childTab);
		//maximizing the web-page window.
		driver.manage().window().maximize();
		//This hardWiat will pause the code execution for 2-seconds.
		Thread.sleep(2000);
		//Storing the locator of childTap element into WebElement reference.
		WebElement text1 = driver.findElement(By.id("alertBox"));
		//PrintingOut the name of childTap element.
		System.out.println("Name of the childTap element:\t" + text1.getText());
		//Clicking on the childTap element.
		text1.click();
		//This hardWiat will pause the code execution for 2-seconds.
		Thread.sleep(2000);
		//This method will click on the OK button.
		driver.switchTo().alert().accept();
		//This hardWiat will pause the code execution for 2-seconds.
		Thread.sleep(2000);
		//This method will take us back to the first/parentTab.
		driver.switchTo().window(parentTab);
		//Storing the locator of parentTab element into WebElement reference.
		WebElement text = driver.findElement(By.xpath("//h3[text()='Button2']"));
		//PrintingOut the name of parentTab element.
		System.out.println("Name of the parentTap element:\t" +text.getText());
		//This hardWiat will pause the code execution for 2-seconds.
		Thread.sleep(2000);
		//This method will close/quit both current open windows.
		driver.quit();
	}}