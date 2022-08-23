package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleLinksElement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		
		//driver.findElement(By.linkText("MacBook")).click();
		//links will always have html tag as a
		ElementUtil eleUtil=new ElementUtil(driver);
		//By contactSales=By.linkText("CONTACT SALES");
		
		//6.linktexte- safe approach
		//By macLink=By.linkText("MacBook");
		//eleUtil.doClick(contactSales);
		//String contactSales="CONTACT SALES";
		//eleUtil.doClick("linktext", contactSales);
		
		//7. partiallinktext - not a safe approach.can be used in case of long text link.
		driver.findElement(By.partialLinkText("SALES")).click();
		
		
		
		

	}

}
