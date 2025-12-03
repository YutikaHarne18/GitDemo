package Practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentWindowHandle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//div/ul/li//a[text()='Multiple Windows']")).click();
		
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text()='Click Here']"))));
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String parentId = it.next();
		String childId1 = it.next();
		
		driver.switchTo().window(childId1);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		driver.close();
		
		 
	}

}
