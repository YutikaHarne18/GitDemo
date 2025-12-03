package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("selenium-manager.logging", "TRACE");
		WebDriver driver = new ChromeDriver();
		
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
		driver.findElement(By.id("inputUsername")).sendKeys("Yutika");
		driver.findElement(By.name("inputPassword")).sendKeys("Yutika");
		driver.findElement(By.className("signInBtn")).click();
		
//		Added Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Yutika");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("yutika@gmail.com");
//		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567891");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();	
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("button[class='go-to-login-btn']")).click();	
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Yutika");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password); // Regular expression css selector
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		
//        driver.close();
        driver.quit();
		
	}
	
	   public static String getPassword (WebDriver driver) throws InterruptedException 
	   {
		   driver.get("https://rahulshettyacademy.com/locatorspractice/");
		   driver.findElement(By.linkText("Forgot your password?")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector("button[class='reset-pwd-btn']")).click();
		   String passMsg = driver.findElement(By.cssSelector("form p")).getText();
		   String[] passMsgSplit = passMsg.split("'");  //ArrayCreated
		   String[] pass1 = passMsgSplit[1].split("'");
		   String password = pass1[0];
		   System.out.println(pass1[0]);
		   
		   return password;
	   }

}
