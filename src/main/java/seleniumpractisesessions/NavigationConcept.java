package seleniumpractisesessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, MalformedURLException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://amazon.com");
		Thread.sleep(1000);
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		driver.navigate().to(new URL("https://naveenautomationlabs.com/opencart/"));
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		

	}

}
