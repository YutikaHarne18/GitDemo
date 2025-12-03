package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownParentChildRelationshipLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		Xpaths without using index 
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXM']")).click();
		
		driver.close();
		
	}

}
