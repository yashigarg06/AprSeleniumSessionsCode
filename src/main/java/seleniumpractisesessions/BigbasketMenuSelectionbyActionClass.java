package seleniumpractisesessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigbasketMenuSelectionbyActionClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement mainMenu=driver.findElement(By.linkText("SHOP BY CATEGORY"));
		
		Actions act=new Actions(driver);
		act.moveToElement(mainMenu).perform();
		Thread.sleep(1000);
		
	
		act.moveToElement(driver.findElement(By.linkText("Beverages"))).perform();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.linkText("Tea"))).perform();
		Thread.sleep(2000);
		
		act.moveToElement(driver.findElement(By.linkText("Green Tea"))).perform();
		Thread.sleep(2000);
		
		act.click(driver.findElement(By.linkText("Red Label"))).perform();
		
		
	   
	}

}
