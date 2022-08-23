package seleniumpractisesessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitle {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.linkText("Register")).click();
		String title=waitForTitleContains(10,"Register");
		System.out.println("Titl is :"+ title);
		
	}
	public static String waitForTitleContains(int timeOut,String titleFraction) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
			return driver.getTitle();
		}
		else {
			System.out.println("Title not found");
			return null;
		}
		
	}
	public static String waitForTitleToBe(int timeOut,String title) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		if (wait.until(ExpectedConditions.titleIs(title))) {
			return driver.getTitle();
		}
		else {
			System.out.println("Title not found");
			return null;
		}
		
	}

}
