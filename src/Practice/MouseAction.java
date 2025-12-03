package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(move).contextClick().build().perform();
		
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
						.keyDown(Keys.ARROW_DOWN.SHIFT).sendKeys("Mobile").doubleClick().build().perform();
		
		
		driver.close();
	}

}
