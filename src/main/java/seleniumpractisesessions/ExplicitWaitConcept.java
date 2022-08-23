package seleniumpractisesessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailLocator=By.id("input-email");
		By pwdLocator=By.id("input-password");
		By loginLocator=By.xpath("//input[@value='Login']");
		doSendKeysWithWait("test@123",emailLocator,10);
		driver.findElement(pwdLocator).sendKeys("test@123");
		doClickWithWait(loginLocator,10);
	}

	public static void doSendKeysWithWait(String value,By locator, int timeOut) {
		waitForElementVisible(locator,timeOut).sendKeys(value);;
		
	}
	public static void doClickWithWait(By locator, int timeOut) {
		waitForElementPresence(locator,timeOut).click();
	}
    public static WebElement waitForElementVisible(By locator, int timeOut) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static WebElement waitForElementPresence(By locator, int timeOut) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
