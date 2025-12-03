package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assert1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
//		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		
//		Get the count of Checkboxes present on page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
//		Check with Assert required text (if matches test will not fail and continue the action)
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");
		
		driver.close();
		
	}

}
