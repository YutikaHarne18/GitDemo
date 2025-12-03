package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFormFilling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Yutika Narendra Harne");
		driver.findElement(By.name("email")).sendKeys("yutikaharne23@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Yutika@23");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		dropdown.click();
		Select selectGender = new Select(dropdown);
		selectGender.selectByContainsVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		System.out.println(driver.findElement(By.id("inlineRadio2")).isSelected());
		System.out.println(driver.findElement(By.id("inlineRadio3")).isEnabled());
		driver.findElement(By.name("bday")).click();
		driver.findElement(By.name("bday")).sendKeys("23042000");
		System.out.println(driver.findElement(By.name("bday")).getText());
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
//		driver.close();
		
		
	}

}
