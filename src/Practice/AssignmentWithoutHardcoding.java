package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentWithoutHardcoding {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/AutomationPractice/");
		
//		Select checkbox of Option1
		driver.findElement(By.id("checkBoxOption1")).click();
		String optionOne = driver.findElement(By.xpath("//label[@for='bmw']")).getText();
		System.out.println(optionOne);
		
//		2. SelectOption1 in dropdown
		WebElement selectOption = driver.findElement(By.id("dropdown-class-example"));
		selectOption.click();
		Select s = new Select(selectOption);
		s.selectByVisibleText(optionOne);
		
//		3. Enter Option1 in alert input box
		driver.findElement(By.id("name")).sendKeys(optionOne);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		System.out.println(driver.switchTo().alert().getText().contains(optionOne));
		driver.switchTo().alert().accept();
	}

}
