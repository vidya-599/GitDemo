package Sselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Invoking browser
		// Chrome/firefox/safari - ChromeDriver/ffdriver/safaridriver -->Methods
		// class implements WebDriver
		// WebDriver	
		
		// ChromeDriver driver = new ChromeDriver();
		// chromedriver.exe -> chromebrowser
		// step to invoke chrome driver
		System.setProperty("webdriver.chrome.driver", "/Users/Manjesh/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driverW = new ChromeDriver();
		driverW.get("https://rahulshettyacademy.com");
		System.out.println(driverW.getTitle());
		driverW.quit();

		// Firefox launch
		// GeckoDriver
		System.setProperty("webdriver.gecko.driver", "/Users/Manjesh/Downloads/chromedriver-win64/chromedriver-win64/geckodriver.exe");
		WebDriver driverF = new FirefoxDriver();
		driverF.get("https://rahulshettyacademy.com");
		System.out.println(driverF.getTitle());
		driverF.quit();
		
		// Edge launch
		System.setProperty("webdriver.edge.driver", "/Users/Manjesh/Downloads/chromedriver-win64/chromedriver-win64/msedgedriver.exe");
		WebDriver driverE = new EdgeDriver();
		driverE.get("https://rahulshettyacademy.com");
		System.out.println(driverE.getTitle());
		driverE.quit();

		
		
	}

}
