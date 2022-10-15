package core;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHanding {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
		Thread.sleep(3000);
		
		WebElement cusID = driver.findElement(By.name("cusid"));
		cusID.sendKeys("54321");
		
		WebElement searchButton = driver.findElement(By.name("submit"));
		searchButton.click();
		
		// Switch to pop
		// Alert is a interface in Selenium
		Alert alert = driver.switchTo().alert();
		String deleteMSG = alert.getText();
		System.out.println(deleteMSG);
		
		alert.accept();

	}

}
