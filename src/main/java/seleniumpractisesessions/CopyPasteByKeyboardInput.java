package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CopyPasteByKeyboardInput {

	
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException  {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			Actions act=new Actions(driver);
			//driver.findElement(By.id("input-firstname")).click();
			driver.findElement(By.id("input-firstname")).sendKeys("yashi garg");
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
			driver.findElement(By.id("input-lastname")).click();
			driver.findElement(By.id("input-lastname")).clear();
			act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			
			
			
	}

}
