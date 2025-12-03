package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDelete {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().addCookie(null);
//		There are 5-6 options to handle cookies
		driver.get("google.com");
		
	}

}
