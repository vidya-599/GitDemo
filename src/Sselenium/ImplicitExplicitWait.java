package Sselenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		
		WebDriverWait d = new WebDriverWait(driver, Duration.ofSeconds(5));
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='resultsContainer']/section/article[1]")));
		//Thread.sleep(5000L);
		
	
	driver.findElement(By.xpath("//div[@id='resultsContainer']/section/article[1]")).click();

	
	//Fluent wait
	//https://the-internet.herokuapp.com/dynamic_loading/1
	
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(3))
			.ignoring(NoSuchElementException.class);
	
	WebElement foo = wait.until(new Function<WebDriver, WebElement>(){
		public WebElement apply(WebDriver driver) {
			if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
			}
			else 
				return null;
			}

		
		});
	
	}

}
