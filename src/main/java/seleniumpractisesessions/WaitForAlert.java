package seleniumpractisesessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//li/button[@onclick='jsAlert()']")).click();
		String alertText=getAlertText(10);
		System.out.println(alertText);
		
	}

	public static String getAlertText(int timeOut) {
		return waitForAlert(timeOut).getText();
	}
	public static void acceptAlert(int timeOut) {
		waitForAlert(timeOut).accept();
	}
	public static void dismissAlert(int timeOut) {
		waitForAlert(timeOut).dismiss();
	}
	public static void sendKeysToAlert(String value,int timeOut) {
		waitForAlert(timeOut).sendKeys(value);
	}
	public static Alert waitForAlert(int timeOut) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
}
