package __seleniumLecture;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a10__HandlingDropDownWithNoSelectTagName {
	public static void main(String[] args) {
		
		/*
		 * _dropDown WithOut "select" tagName:
		 * 
		 * As previously mentioned that dropDown withOut "select" tagName are handle differently then the dropDown with "select" tagName:
		 * _You can handle them with the following relative _xpaths:
		 * _Such as:
		 * ________//div[@role='group']//child::div
		 * ________//div[@role='group']//parent::div
		 * ________//div[@role='group']//following-sibling::div
		 * ________//div[@role='group']//self::div
		 * ________//div[@role='group']//descendant-or-self
		 * 
		 * NOTE: 
		 * parent = previous OR means previous:
		 * ________The "parent" has to be followed by the parent node TagName such as: "//parent::div", 
		 *         but the first tagName of _xpath should be the tagName of child node in the DOM.
		 * child = next OR means next:
		 * ________The "child" has to be followed by the tagName of child node such as: "//child::div", 
		 *         but the first tagName of _xpath should be the tagName of parent node in the DOM. 
		 * following = next OR means next:
		 * preceding = previous node
		 * preceding-sibling = previous sibling node
		 * 
		 * MORE INFORMATION GOING TO BE ADDED.......
		 * 
		 *
		 */
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
        
		WebDriver driver = new ChromeDriver();
		//WebDriver driver1 = new EdgeDriver();
		//WebDriver driver2 = new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

	

}