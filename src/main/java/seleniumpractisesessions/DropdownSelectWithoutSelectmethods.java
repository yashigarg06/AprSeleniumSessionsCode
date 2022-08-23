package seleniumpractisesessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSelectWithoutSelectmethods {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		//By countryLocator=By.id("Form_submitForm_Country");
		//driver.findElement(countryLocator).sendKeys("India");
		//doSelectValueUsingOptions(countryLocator);
	   //By countryLocator=By.cssSelector("select#Form_submitForm_Country option");
	   By countryLocator=By.xpath("//select[@id='Form_submitForm_Country']/option");
	   doSelectValueFromDropDown(countryLocator,"India");
	}

	public static void doSelectValueFromDropDown(By countryLocator, String value) {
		List<WebElement> dropdownList=driver.findElements(countryLocator);
		for(WebElement e : dropdownList) {
			String text=e.getText();
			System.out.println(text);
			if (text.equals("India")) {
				e.click();
				break;
			}
		}
	}
	public static void doSelectValueUsingOptions(By countryLocator) {
		Select select=new Select(driver.findElement(countryLocator));
		List<WebElement> dropdownList=select.getOptions();
		for(WebElement e : dropdownList) {
			String text=e.getText();
			if (text.equals("India")) {
				e.click();
				break;
			}
		}
	}
}
