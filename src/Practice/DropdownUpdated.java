package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownUpdated {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(2000);
//		for(int i = 1 ; i<3 ; i++)
//		{
//			driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
		
		int i = 1;
		while(i<3)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //2 times click  	 	 							           					
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.close();
		
	}

}
