package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableCheckBox {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");
		selectUsername("Joe.Root");
		
	}
	
	public static void selectUsername(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td//preceding-sibling::td/input[@name='chkSelectRow[]']")).click();
	}

}
