package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksEndToEnd {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		1.Take count of all links present on page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
//		2.Take count of Footer Section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
//		3.Take the couunt of links preent in 1st column
		WebElement sectionFirst = driver.findElement(By.xpath("//div/table/tbody/tr/td [1]/ul"));
		System.out.println(sectionFirst.findElements(By.tagName("a")).size());
		
//		4.Open each link in new tab
		for(int i = 1 ; i<sectionFirst.findElements(By.tagName("a")).size() ; i++)
		{
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER); //Important step
			sectionFirst.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		} // To open all Tab
		
//		5.Get the Title of each tab opened 
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		if(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		} // To get Title present on each tab by switching window handle
		
	}

}
