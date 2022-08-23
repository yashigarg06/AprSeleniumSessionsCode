package seleniumpractisesessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		By searchBoxLocator=By.name("q");
		By suggListLocator=By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']");
		
		performSearch(searchBoxLocator,suggListLocator,"Naveen Automation Labs","youtube");
		}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static void performSearch(By searchBoxLocator,By suggListLocator, String searchKey,String SuggName) throws InterruptedException  {
		doSendKeys(searchBoxLocator,searchKey);
		Thread.sleep(3000);
		List <WebElement> suggList=driver.findElements(suggListLocator);
		System.out.println("Total items in sugestion list are "+suggList.size());
		for(WebElement e:suggList) {
			String text=e.getText();
			System.out.println(text);
			if (text.contains(SuggName))
			{
				e.click();
				break;
			}
		
	}
 }
}

