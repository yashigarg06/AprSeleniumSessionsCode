package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters({"url"})
	@BeforeTest
	public void setup(String url) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(url);
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
