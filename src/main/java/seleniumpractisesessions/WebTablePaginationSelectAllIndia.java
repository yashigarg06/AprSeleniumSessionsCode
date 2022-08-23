package seleniumpractisesessions;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePaginationSelectAllIndia {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(2000);
		//Actions act=new Actions(driver);
		while(true) {
			Thread.sleep(2000);
			List<WebElement> countryList=driver.findElements(By.xpath("//td[text()='India']"));
			if(countryList.size()>0) {
			List<WebElement> countryCheckBox=driver.findElements(By.xpath("(//td[text()='India']//preceding-sibling::td/input[@type='checkbox'])"));
			for (WebElement e: countryCheckBox) {
				e.click();
				Thread.sleep(500);
			}
			
			WebElement next=driver.findElement(By.linkText("Next"));
			if(next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is finished");
				break;
			}
			
			next.click();
			Thread.sleep(3000);
		}
	}

}
}

	

