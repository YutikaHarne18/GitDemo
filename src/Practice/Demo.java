package Practice;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Chromedriver
//		WebDriver driver = new ChromeDriver();
		
//		firefox
//		WebDriver driver = new FirefoxDriver();
		
//		microsoft edge driver
		System.setProperty("selenium-manager.logging", "TRACE");
		WebDriver driver = new EdgeDriver();

		
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
