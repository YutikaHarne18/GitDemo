package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		Dropdown with Select tag - Static Dropdown
		WebElement selectDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(selectDropdown);
		s.selectByIndex(1);
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByValue("USD");
		System.out.println(s.getFirstSelectedOption().getText());
		s.selectByContainsVisibleText("AE");
		System.out.println(s.getFirstSelectedOption().getText());
		
	}

}
