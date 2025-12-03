package Practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitImplicite {

	public static void main(String[] args) {

		
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Carrot"};
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("Yutika");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		closeWindow(driver);
		
		
		
	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
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
		
	}
	
	public static void closeWindow(WebDriver driver)
	{
		driver.close();
	}
}
