package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionList {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.automationpractice.com");
		ElementUtil eleUtil=new ElementUtil(driver);
		By searchLocator=By.id("search_query_top");
		eleUtil.doSendKeys(searchLocator, "Dress");
		Thread.sleep(8000);
		selectItem("T-shirts > Faded Short Sleeve T-shirts");
		
	}
     
	public static void selectItem(String prodName) {
		
		driver.findElement(By.xpath("//li[text()='"+prodName+"']")).click();
	}
}

