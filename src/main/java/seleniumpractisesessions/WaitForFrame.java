package seleniumpractisesessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrame {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		By frameLocator=By.name("main");
		waitforFrameByLocator(10,frameLocator);
		String frameHeader=driver.findElement(By.tagName("h2")).getText();
		System.out.println("Frame header is: "+ frameHeader);
		
	}
	public static void waitforFrameByLocator(int timeOut, By frameLocator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));	
	}
	public static void waitforFrameByName(int timeOut,String frameName) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameName));	
	}
	public static void waitforFrameById(int timeOut, int frameId) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));	
	}
	public static void waitforFrameByWebelememt(int timeOut, By frameLocator) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
	    wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(getElement(frameLocator)));	
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
