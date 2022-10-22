package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
		Thread.sleep(3000);

		// Locators
		//1.By using id
		WebElement username = driver.findElement(By.id("email")); 
		username.sendKeys("devdubale");

		//2.By using name
		WebElement password = driver.findElement(By.name("pass")); 
		password.sendKeys("abcd");

		//		//3. Tag Name
		//		WebElement tag = driver.findElement(By.tagName("a"));
		//		tag.click();
		//		
		//4. Link text
		WebElement forgetPassword = driver.findElement(By.linkText("Forgotten password?"));
		forgetPassword.click();

		//5. Partial Link text
		WebElement forgetPass = driver.findElement(By.linkText("Forgotten pass"));
		forgetPass.click();

		// Xpath - Absolute
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")); 
		loginButton.click();

		// Xpath - Relative - Contains Text
		WebElement configuration = driver.findElement(By.xpath("//*[contains(text(),'Configuration ')]")); 
		configuration.click();

		// Xpath - Following 
		WebElement enterName = driver.findElement(By.xpath("//*[text()='Employee Information']//following::input[2]")); 
		enterName.click();

		// cssSelector
		WebElement loginBut = driver.findElement(By.cssSelector("button[type='submit']")); 
		loginBut.click();

       
	}

}
