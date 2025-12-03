package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {

		String name = "Yutika";
		System.setProperty("selenium-manager.logging", "TRACE");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
		driver.close();
	}

}
