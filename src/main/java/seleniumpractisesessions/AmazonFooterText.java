package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonFooterText {


	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//String header=driver.findElement(By.xpath("//a[text()='Careers']//ancestor::div[@class='navFooterLinkCol navAccessibility']/div")).getText();
		//System.out.println(header);
		System.out.println(getHeaderValue("Careers"));
		System.out.println(getHeaderValue("Become an Affiliate"));
		System.out.println(getHeaderValue("Reload Your Balance"));
	}

	public static String getHeaderValue(String footerLinkText) {
	
		String header=driver
				.findElement(By.xpath("//a[text()='"+footerLinkText+"']//ancestor::div[@class='navFooterLinkCol navAccessibility']/div"))
				.getText();
		return header;
	}
}
