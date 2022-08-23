package seleniumpractisesessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomWait {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		waitForPageLoad(5000);
		By eleLocator=By.linkText("Vacuums");
		WebElement eleLink=retryingElementByCustomWait(eleLocator,10,2000);
		eleLink.click();

	}
	public static void shortWait() {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void mediumWait() {
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void longWait() {
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void waitFor(int timeOut) {
		try {
			Thread.sleep(timeOut*1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static WebElement retryingElementByCustomWait(By locator, int timeOut,int pollingTime) {
		WebElement ele=null;
		int attempts=0;
		while(attempts<timeOut) {
			try {
				ele=getElement(locator);
				break;
			}
			catch(Exception e) {
				System.out.println("Element is not found in attempt number:"+attempts);
				try {
					Thread.sleep(pollingTime);
				}
				catch(InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			attempts++;
		}
		if(ele==null) {
			try {
				throw new Exception("ELEMENTNOTFOUNDEXCEPTION");
			}
			catch(Exception e3) {
				System.out.println("Element not found exception..tried for"+timeOut+" times with interval of "+pollingTime);
			}
		}
		return ele;
			
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void waitForPageLoad(int timeOut) {
		long endTime=System.currentTimeMillis()+timeOut;
		while(System.currentTimeMillis()<endTime) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			String pageState=js.executeScript("return document.readyState;").toString();
			System.out.println("Page loading state is: "+pageState);
			if(pageState.equals("complete")) {
				System.out.println("page is fully loaded with all scripts, images,css ...");
				break;
			}
		}
	}

}
