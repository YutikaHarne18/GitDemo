package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandleWebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		Fetch the row count present in table
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size());
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
		System.out.println(driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th")).size());
		List<WebElement> colm = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th"));
		
		WebElement thirdRow = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]"));
		 System.out.println(thirdRow.getText());
		
		
	}

}
