package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWaits {
	static WebDriver driver;

	public static void main(String[] args) {
		
		// 1. Implicit wait  -- Implicit wait tells the web driver to wait for a certain amount of time
		// before it throws an Exception. "No Such Element Exception"
		// Global kind of wait
		// 2. Explicit wait 
		// 3. Fluent wait
		
		SeleniumWaits obj = new SeleniumWaits();
		obj.browserLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		obj.fileUploading();
		obj.browserClose();
	}
	
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
		
	}
	
	public void fileUploading() {
		
		WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
		chooseFile.sendKeys("C:\\Users\\devid\\Desktop\\FS46033727.pdf");
		
		WebElement checkBox = driver.findElement(By.id("terms"));
		checkBox.click();
		
		WebElement submitButton = driver.findElement(By.id("submitbutton"));
		submitButton.click();
		
		WebElement fileUploadedMsg = driver.findElement(By.xpath("//*[text()='has been successfully uploaded.']"));
		fileUploadedMsg.isDisplayed();
		System.out.println("Successfull meassage: "+fileUploadedMsg);
		System.out.println("File Uploaded");
	}
	
	public void browserClose() {
		driver.close();
		System.out.println("Browser Closed");
	}

}
