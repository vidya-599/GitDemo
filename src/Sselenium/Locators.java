package Sselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Manjesh/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // waits until that element loads.. if that element is present it will not wait
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		
		// css selector for unique path if no unique locators defined for that element
		// tagname,classname... use chrome extension to check if cssselector path is correct and unique
		driver.findElement(By.cssSelector("p.error")).getText();
		// if no extension allowed then use console and type $('tagname,classname') for css and for xpath use
		// $x('//input[@placeholder="Name"]')
		// Xpath : //tagName[@attribute='value']...... css : tagName[attribute='value']
		// <input type="text" placeholder="Username" id="inputUsername" value="" xpath="1">
		// can use index if we see same tyoe and sttriubutes //tagName[@attribute='value'][index] 
		// if we have hidden index //tagName[attribute='value']:nth-child(2) 
//		driver.findElement(By.linkText("Forgot your password?")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
		// parent to child traverse - //form/h2....//form/input[3]
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Thread.sleep(1000);//

		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(1000);//

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

		Thread.sleep(1000); // here we are on same page but window is sliding so we use this .. here we are waiting for some page load where we have that element

		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

		// regular expression
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("chkboxOne")).click();

		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		driver.quit();		
	}

}
