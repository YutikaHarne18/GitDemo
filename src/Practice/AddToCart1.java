package Practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart1 {

	public static void main(String[] args) throws InterruptedException {

//		Important question asked in Amazon
	
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		List<WebElement> productName = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i = 0 ; i<productName.size() ; i++)
		{
			String[] name = productName.get(i).getText().split("-");
			String formattedName = name[0].trim();
			
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName))
			{
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				//div[@class='product-action']
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				for(int a = 0 ; a==itemsNeeded.length ; a++)
				{
					break;
				}
			}
		}

		driver.close();
}

}
