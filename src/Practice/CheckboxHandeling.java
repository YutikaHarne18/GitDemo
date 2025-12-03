package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHandeling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
//		Get the count of Checkboxes present on page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.close();
	}

}
