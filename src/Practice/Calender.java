package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//		Select the given date from calender
		String day = "1";
		String monthNumber = "10";
		String year = "2026";
		String[] date = {monthNumber,day,year};
		
		driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		driver.findElement(By.xpath("//abbr[text()='"+day+"']")).click();
		
//		System.out.println(driver.findElement(By.cssSelector("div.react-date-picker__inputGroup")).getText());
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		for(int i = 0 ; i<actualList.size(); i++)
		{
			System.out.println(actualList.get(i).getDomAttribute("value"));
			Assert.assertEquals(actualList.get(i).getDomAttribute("value"), date[i]);
		}
		
		driver.close();
		
	}

}
