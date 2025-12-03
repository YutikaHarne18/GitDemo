package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCheckBoxExercise {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
//		How to get the Count of number of check boxes present in the page
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.close();
	}

}
