package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollDownAndSumOfNumbers {
		public static void main(String[] args) {
		
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
//			To scroll the window
			js.executeScript("window.scrollBy(0,500)");
			
//			To Scroll the table present in the window
			js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
			int sum = 0;
			 List<WebElement> numbers = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
			 
			 for(int i = 0  ; i<numbers.size() ; i++)
			 {
				 sum = sum + Integer.parseInt(numbers.get(i).getText());
			 }
			 System.out.println(sum);
			
			 System.out.println(driver.findElement(By.cssSelector(".totalAmount")).getText());
			 
			 int expected = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
			 Assert.assertEquals(sum, expected);
			 
			 
			
	}
	
}
