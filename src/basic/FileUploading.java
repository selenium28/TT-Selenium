package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploading {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		FileUploading obj = new FileUploading();
		obj.browserLaunch();
		Thread.sleep(3000);
		obj.fileUploading();
		Thread.sleep(3000);
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
		// 
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
