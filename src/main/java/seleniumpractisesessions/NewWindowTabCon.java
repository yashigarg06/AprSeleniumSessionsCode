package seleniumpractisesessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowTabCon {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("img[alt='LinkedIn OrangeHRM group']")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindowID=it.next();
		String childWindowID=it.next();
        System.out.println("current window is: "+ driver.getTitle());
		Thread.sleep(1500);
		driver.switchTo().window(childWindowID);
		System.out.println("Switched to window: "+driver.getTitle());
		Thread.sleep(1500);
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("Switched to window: "+driver.getTitle());
		driver.quit();
		

	}

}
