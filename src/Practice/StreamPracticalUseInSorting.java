package Practice;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamPracticalUseInSorting {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
//		Click on coloumn
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
//		Capture all webelements to list
		List<WebElement> capturedList = driver.findElements(By.xpath("//tr/td[1]"));																																
		
//		Capture all text of all webelements into new(original) List
		List<String> originalList = capturedList.stream().map(s->s.getText()).collect(Collectors.toList());
		
//		Sort on the original list of step 3 ->Sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
//		Compare original list vs Sorted List
		Assert.assertTrue(originalList.equals(sortedList));
		
//		Scan the name coloumn with getText ->Beans -> Print the price of the rice put rice instead beans
		List<String> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));
		
		if(price.size()<1)
		{
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}while(price.size()<1);
	}

	private static String getVeggiePrice(WebElement s) {
		String veggiePriceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		
		return veggiePriceValue;
	}

}
