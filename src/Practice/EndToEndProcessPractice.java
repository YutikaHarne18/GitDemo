package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndProcessPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_0']")).getDomAttribute("class"));
		
//		Another way of checking the radio button is Enable
		if (driver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_0']")).getDomAttribute("class").contains("select-label"))
		{
			System.out.println("its Enable");
			Assert.assertTrue(true);
		}
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='SAG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //li/a[@value='TIR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("ui-state-active")).click(); 	
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		driver.findElement(By.className("ui-state-active")).click(); 
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i = 1 ; i<4 ; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		
		WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s = new Select(currency);
		s.selectByIndex(2);
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();	
		
//		driver.close();
		
		
		
	}

}
