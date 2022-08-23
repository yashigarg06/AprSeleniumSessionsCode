package seleniumpractisesessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandlingConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//li/button[@onclick='jsAlert()']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/button[@onclick='jsConfirm()']")).click();
	    alert=driver.switchTo().alert();
	    //alert.accept();
		alert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/button[@onclick='jsPrompt()']")).click();
	    alert=driver.switchTo().alert();
	    alert.sendKeys("Hello");
	    Thread.sleep(4000);
		alert.accept();
		
			
	}

}
