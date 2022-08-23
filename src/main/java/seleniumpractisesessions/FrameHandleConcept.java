package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandleConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='main']")));
		String header=driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
		

	}

}
