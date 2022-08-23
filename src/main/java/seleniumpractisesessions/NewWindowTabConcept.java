package seleniumpractisesessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowTabConcept {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException  {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://google.com");
			//Actions act=new Actions(driver);
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://naveenautomationlabs.com/opencart/");
			System.out.println(driver.getTitle());
			
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://google.com");
			System.out.println(driver.getTitle());
			driver.close();
			
	}

}
