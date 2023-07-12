package __seleniumLecture;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _a17__TakingScreenShot {
	
	/*
	 * Taking ScreenShot ___Taking ScreenShot of your automation test case with SELENIUM:
	 * 
	 * For instance, you have a test case of testing an Amazon home page and as a prove you want to 
	 * take the screenShot of your test case, then you need to create a method of screenShot.
	 * And, in order to take screen shot in you automation test case, you won't be able to do that 
	 * with SELENIUM, you would need to download the jarFiles from "Apache Commons" and then add
	 * those jarFiles to your projectPath.
	 * 
	 * MORE INFO COMING SOON...
	 */
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {

		launchBrowser("https://www.amazon.com/");
		takeScreenShot("AmazonHomePage");
		
		Thread.sleep(9000);
		driver.close();
	    }
	    public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	    }
	    //method for taking screenshots
	    public static void takeScreenShot(String fileName) throws IOException {
		//we need to create a folder at project level and store the path here so that
		//when even we take screenshots, they are all saved in that specific folder
		String path = ".\\screenshots";
		//I create object of the file class
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path + fileName + ".png"));
	}
}