package __seleniumLecture;

public class _1__setPropertyMethod {
	
	public static void main(String[] args) {
		
		/*
		 * ___setProperty Method Introduction: 
		 *    (.setProperty("String Key", "String Value");)
		 *    
		 * Examples of setProperty method used in SELENIUM WebDriver:
		 *  a) System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 *  b) System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		 *  c) System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");
		 * 
		 * ____Explanation of the above method:
		 *  
		 * >>> "System.setProperty": is to set property of a web driver you will be using it in your SELENIUM project for automation.
		 * >>> "webdriver.chrome.driver": is the "String Key" portion inside the .setProperty() method and it is kind of a reference to any driver that you are using; 
		 *    if you are using Firefox driver then you would change the "chrome" to Firefox and the same changes to any other WebDriver you would decide to use.
		 * >>> ".\\drivers\\chromedriver.exe": is the "String Value" portion inside the argument of your setProperty() method, it has three sections, which are as follows:
		 *    1) "." <- this dot points to the path of a web driver which is located in the SELENIUM project level or you can say which is in the current SELENIUM project
		 *    that you are currently working in it. 
		 *    2) "\\drivers\\chromedriver": <- this is the link address of a web driver which is located in the drivers folder in your current SELENIUM project.
		 *    You can get to this address or get the address by doing the following steps: 
		 *    -> Open the drivers folder (a folder will open)
		 *    -> hover your mouse on the driver link and right click of your mouse (a list of menu will open)
		 *    -> click on properties (a page of properties will get open)
		 *    -> select all the link in front of where it is written "location:"
		 *    -> with right click of your mouse select copy
		 *    -> past it inside the "value" portion in the argument of ".setProperty("key", "value")" method.
		 *    -> make it short from the original lengthy link as: "\\drivers\\chromedriver.exe"
		 *    Basically, it is the path to a specific web driver you are using in your SELENIUM project, which is located in the drivers folder in your SELENIUM project,
		 *    The same, you would need to get the path of any web driver you are using from drivers folder in your SELENIUM project.
		 *    3) ".exe" <- this portion is the extension to your chrome driver, it is only used in windows systems; not in IOS/Apple systems.
		 */
		
		//Example usage of ".setProperty();" method:
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");//This is for Chrome driver.
		//System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");//This is for Edge driver.
		//System.setProperty("webdriver.firefox.driver", ".\\drivers\\geckodriver.exe");//This is for Firefox driver.

}
}