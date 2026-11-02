package Sselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//MouseHover/draganddrop/rightclick/doubleclick
public class ActionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Manjesh/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");

		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(element).build().perform(); // Mouse Hover
		
		element = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform(); // send text in search box
		
		action.moveToElement(element).contextClick().build().perform(); // Right click

		// Parent to child window switch.. Hanlding multiple windows 
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId] //windowHanldes gives ids of all opened browser

		Iterator<String>it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		driver.findElement(By.cssSelector(".im-para.red")).getText();

		String emailId= driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

		driver.switchTo().window(parentId);

		driver.findElement(By.id("username")).sendKeys(emailId);

	}

}
