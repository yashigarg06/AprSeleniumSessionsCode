package seleniumpractisesessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\prate\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://wwww.naveenautomationlabs.com");
		System.out.println("Page title is :" + driver.getTitle());
		System.out.println("Page URL is :"+ driver.getCurrentUrl());
		
		
	}
}
