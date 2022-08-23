package seleniumpractisesessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewMultipleTabConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("img[alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.cssSelector("img[alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		
		String parentWindowId=driver.getWindowHandle();
		while(it.hasNext()) {
			String winId=it.next();
			driver.switchTo().window(winId);
			System.out.println("current window title is: "+ driver.getTitle());
			Thread.sleep(1500);
			if(!winId.equals(parentWindowId)) {
				driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);
		System.out.println("current window is: "+ driver.getTitle());
		Thread.sleep(1500);
		driver.quit();
		
		
		

	}

}
