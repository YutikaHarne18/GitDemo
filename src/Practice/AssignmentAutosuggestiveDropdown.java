package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement text = driver.findElement(By.id("autocomplete"));
		text.sendKeys("ind");
		text.sendKeys(Keys.DOWN);
		text.sendKeys(Keys.DOWN);
		text.sendKeys(Keys.DOWN);
		text.click();
		Thread.sleep(2000);
		System.out.println(text.getText());
		
		
//		List<WebElement> countries = driver.findElements(By.id("ui-id-1"));
//		
//		for (WebElement country : countries)
//		{
//			if (country.getText().equalsIgnoreCase("india"))
//			{
//				Thread.sleep(2000);
//				country.click();
//				break;
//			}
//		}
		
		
	}

}
