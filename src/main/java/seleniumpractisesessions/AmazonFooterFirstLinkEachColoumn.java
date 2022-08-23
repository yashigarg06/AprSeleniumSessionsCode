package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterFirstLinkEachColoumn {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		ElementUtil eleUtil=new ElementUtil(driver);
		for(int i=3;i>=0;i--) {
			By locator =By.xpath("(//div[@class= 'navFooterLinkCol navAccessibility'])[last()-"+i+"]//a");
			String text=eleUtil.doElementGetText(locator);
			System.out.println(text);
		}
	}

}
