package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
		Thread.sleep(3000);
		
		
		WebElement country = driver.findElement(By.name("country"));
		Select selectCountry = new Select(country);
//		selectCountry.selectByIndex(5);
//		selectCountry.selectByValue("");
		selectCountry.selectByVisibleText("INDIA");
		

	}

}
