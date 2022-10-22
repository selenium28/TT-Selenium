package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithJava {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		SeleniumWithJava obj = new SeleniumWithJava();
		obj.browserLaunch();
		Thread.sleep(3000);
		obj.login();
		Thread.sleep(3000);
		obj.tearDown();
	}
	
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
	}
	
	public void login() {
		WebElement username = driver.findElement(By.name("username")); 
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password")); 
		password.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']")); 
		loginButton.click();
		System.out.println("Login successful");
	}
	
	public void tearDown() {
		driver.quit();
	}
	

}
