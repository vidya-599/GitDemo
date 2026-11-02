package Sselenium;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

public class BrokenLinks { // Broken link means if some link(URL not working) is not working and thows 404 or some error 

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		// if we have one or 2 we can check by hitting and checking but if we have 1k of urls to be checked, we have java methods to be used in selenium
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        

        //broken URL

        //Step 1 - IS to get all urls tied up to the links using Selenium

        //  Java methods will call URL's and gets you the status code

        //if status code >400 then that url is not working-> link which tied to url is broken

        //a[href*="soapui"]'

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        

        

     List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));

     SoftAssert a =new SoftAssert(); // this will not stop execution in middle if asserions failes but stores failure in it and continues all execution 
     // when we use  a.assertAll() then it will report failed ones we add it outside loop 

    

     for(WebElement link : links)

     {

      

         String url= link.getAttribute("href");

        
         // to make connection to that url and used to send & receive response from that url 
         // without clicking on each link and checking we can use this to check if url is working or not
         HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();

         conn.setRequestMethod("HEAD");

         conn.connect();

         int respCode = conn.getResponseCode();

         System.out.println(respCode);

         a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);

        

    

     }

    

     a.assertAll();

  

    

    

        

        

        

        

        

    

      

      

      

      

      

      

      

      

      

      

      

      

      

      

      

      

        

        

        

}



private static Object getReturnCode(WebElement link) {

//TODO Auto-generated method stub

return null;

	}

}
