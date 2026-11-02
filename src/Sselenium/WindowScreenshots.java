package Sselenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// take screenshot and store in locak directory
public class WindowScreenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize(); // maximize browser
			driver.manage().deleteAllCookies(); // we can delete all cookies in browser
		
		//	driver.manage().deleteCookieNamed("sessionKey"); // delete specific cookie, it deletes session 
			// logouts and goes to login page
		
		//click on any link
			//login page- verify login url
			
			// take screenshots
			driver.get("http://google.com");
			
			File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //Here it takes screenshot
			FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png")); // copies to our local machine directory path

	}

}
