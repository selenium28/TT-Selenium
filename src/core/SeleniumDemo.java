package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		WebDriver driver2 = new WebDriver();  // we can't create object of interface & WebDriver itself is an interface
//		ChromeDriver driver3 = new ChromeDriver(); // we can use like this bcoz we are creating the object of class.
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("Browser is launched ");
		
		driver.findElement(By.name("username")).sendKeys("Null");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		driver.quit();
		
		

	}

}





//http://demo.guru99.com/test/newtours/register.php -- DropDown
//http://demo.guru99.com/test/delete_customer.php  --- AlertPopup
//https://www.travolook.in/?gclid=Cj0KCQjw4cOEBhDMARIsAA3XDRjGAeFHS8cqdKjY45Sc7ZEf98H63uG7bP6HsxGr9ugbNNNMU0GJZdYaAoH4EALw_wcB   --- ActionClass
//http://automationpractice.com/index.php