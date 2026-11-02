package Sselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// table scrolling test case
public class ScrollingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Manjesh/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)"); // number is just hit and try method
		
		// scroll specific table in a page
		js.executeScript("document.querySelector('.tableFixHead').scrollBy(0,500)"); 
		
		
		//Handle table grid and get value and sum it
		List<WebElement> element = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i =0; i<element.size(); i++) {
			System.out.println(Integer.parseInt(element.get(i).getText()));
		}
		

	}

}
