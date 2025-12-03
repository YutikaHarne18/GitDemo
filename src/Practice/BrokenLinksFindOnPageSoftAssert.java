package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinksFindOnPageSoftAssert {

	public static void main(String[] args) throws MalformedURLException, IOException  {
		// Section 13 - 109-112
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
//		Steps-
//		1. Is too get all urls tied up to the links using selenium
//		2. Java methods will call URL's and get you the Status code
//		3. if status code > 400 then that url is not working means- link which tied to url is broken
		 
		List <WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href"); //Here I used getDOMAttribute method and thats why i was getting error coz
//														this method give HTML source value and getAttribute gives current/live value
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int resCode = conn.getResponseCode();
			System.out.println(resCode);
			a.assertTrue(resCode<400, "The link with Text " +link.getText()+ " is broken with code "+resCode);
		
		    }
		a.assertAll();	

	}

}
