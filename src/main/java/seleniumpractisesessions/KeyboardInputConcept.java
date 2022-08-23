package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardInputConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchTextBox=driver.findElement(By.xpath("//input[@title='Search']"));
		Actions act=new Actions(driver);
		act.keyDown(searchTextBox, Keys.SHIFT).sendKeys("naveen automation labs").keyUp(Keys.SHIFT).build().perform();
		

	}

}
