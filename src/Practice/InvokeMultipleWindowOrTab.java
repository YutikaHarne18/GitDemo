package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleWindowOrTab {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWin = it.next();
		String childWin = it.next();
		driver.switchTo().window(childWin);
		
		driver.get("https://courses.rahulshettyacademy.com/");
		String course = driver.findElements(By.xpath("//div[@class='course-listing-title']")).get(0).getText();
		driver.switchTo().window(parentWin);
	
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys(course);
		
//		How to take Screenshot of WebElement
		File file = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("name.png"));
	
//		Get Height And Width of WebElement
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
		
		driver.quit();
	}

}
