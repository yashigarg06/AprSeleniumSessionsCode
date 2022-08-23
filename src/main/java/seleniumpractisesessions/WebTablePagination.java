package seleniumpractisesessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePagination {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(1500);
		//List<WebElement> countryList=driver.findElements(By.xpath("Hong Kong"));
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='Hong Kong']")).size()>0) {
				driver.findElement(By.xpath("//td[text()='Hong Kong']/preceding-sibling::td/input[@type='checkbox']")).click();
				break;
			}
			else
			{
				
				WebElement next=driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("No such country is found..pagination is over");
					break;
				}
				next.click();
				Thread.sleep(2000);
					
			}
		}
		

	}

	/*public static void selectCountry(String country) {
		driver
		.findElement(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/input[@type='checkbox']")).click();
	}*/
}
