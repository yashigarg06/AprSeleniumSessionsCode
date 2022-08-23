package seleniumpractisesessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFooterPrint {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		ElementUtil eleUtil=new ElementUtil(driver);
		By footerLocator=By.xpath("//div[@class='KxwPGc SSwjIe']//a");
		List <String> footerList=eleUtil.getElementsTextList(footerLocator);
		System.out.println(footerList.size());
		System.out.println(footerList);
		
	}

}
