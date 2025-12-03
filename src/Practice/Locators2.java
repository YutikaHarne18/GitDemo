package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {

//		System.setProperty("selenium-manager.logging", "TRACE");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		Sibling-Child to Parent Traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
//		Child to Parent Traverse
		System.out.println(driver.findElement(By.xpath("//header/div/button[2]/parent::div/button[2]")).getText());
		
		driver.close();

	}

}
