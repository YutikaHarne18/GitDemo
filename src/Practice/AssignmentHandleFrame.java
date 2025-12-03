package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentHandleFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		
		WebElement firstFrame = driver.findElement(By.xpath("//frameset/frame[@name='frame-top']"));
		driver.switchTo().frame(firstFrame);
		WebElement middleFrame = driver.findElement(By.xpath("//frame[@name='frame-middle']"));	
		driver.switchTo().frame(middleFrame);
		WebElement middleText = driver.findElement(By.xpath("//div[@id='content']"));
		System.out.println(middleText.getText());
		
		driver.close();
	}

}
