package Practice;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentSynchronisationWithExpliciteWait {

	public static void main(String[] args) throws InterruptedException {
		
		 // Create ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Set preferences to disable password manager
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		  
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement enterUsername = driver.findElement(By.id("username"));
		enterUsername.sendKeys("Yutika");
		WebElement enterPassword = driver.findElement(By.id("password"));
		enterPassword.sendKeys("Yutika@23");
		driver.findElement(By.xpath("//input[@value='user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-body")));
		System.out.println(driver.findElement(By.cssSelector("div.modal-body")).getText());
		driver.findElement(By.id("okayBtn")).click();
		selectDropdown(driver);
		driver.findElement(By.id("terms")).click();
		System.out.println(driver.findElement(By.cssSelector("span.text-white.termsText")).getText());
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/div/strong")));
		String errorMsg = " username/password.";
		System.out.println(driver.findElement(By.xpath("//form/div/strong")).getText()+ errorMsg);
		validUsernamePassword(driver,enterUsername,enterPassword);
		driver.findElement(By.id("signInBtn")).click();
		clickOnCart(driver,w);
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		
		
		driver.close();
	}
	
	public static void selectDropdown(WebDriver driver)
	{
		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select s = new Select(dropdown);
		dropdown.click();
		s.selectByValue("stud");
	}
	
	public static void validUsernamePassword(WebDriver driver ,WebElement enterUsername, WebElement enterPassword )
	{
		WebElement correctUsername = driver.findElement(By.xpath("(//div/p/b/i)[1]"));
		String username = correctUsername.getText();
		WebElement correctPassword = driver.findElement(By.xpath("(//div/p/b/i)[2]"));
		String password = correctPassword.getText();
		enterUsername.clear();
		enterUsername.sendKeys(username);
		enterPassword.clear();
		enterPassword.sendKeys(password);
	}
	
	public static void clickOnCart(WebDriver driver, WebDriverWait w)
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.btn.btn-info")));
		WebElement cartButton = driver.findElement(By.cssSelector("button.btn.btn-info"));
		String cartText = cartButton.getText();
		
		for (int i = 0 ; i<=cartText.length() ; i++)
		{
			cartButton.click();
		}
		
	}

}
