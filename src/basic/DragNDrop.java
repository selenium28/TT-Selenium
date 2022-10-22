package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {
	
	static WebDriver driver;

	public static void main(String[] args) {
		DragNDrop obj = new DragNDrop();
		obj.browserLaunch();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj.dragNDropFile();
		
	}
	
	public void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		System.out.println("Browser has been Launched");
		
	}
	
	public void dragNDropFile() {
	
		driver.switchTo().frame(0);
		WebElement sourceFile = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement destinationLocation = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(sourceFile).moveToElement(destinationLocation).release().build().perform();
		System.out.println("SourceFile draged successfully");
		
	}

}
