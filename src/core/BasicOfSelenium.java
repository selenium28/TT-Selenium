package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOfSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
		Thread.sleep(3000);
		String actualURLString = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		System.out.println(actualURLString);
		
		WebElement username = driver.findElement(By.name("username")); 
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password")); 
		password.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']")); 
		loginButton.click();
		System.out.println("Login successful");
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Title is matched");
		} else {
			System.out.println("Title is not matched");
		}
		
		driver.quit();
	}

}
