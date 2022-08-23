package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownTest {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		By countryLocator=By.id("Form_submitForm_Country");
		//doSelectByIndex(countryLocator,5);
		//doSelectByVisibleText(countryLocator,"Austria");
		doSelectByValue(countryLocator,"India");
		Thread.sleep(3000);
		By stateLoator=By.id("Form_submitForm_State");
		doSelectByValue(stateLoator,"Bihar");
		
		

	}
	public static WebElement getElement(By countryLocator) {
		return driver.findElement(countryLocator);
	}
	public static void doSelectByIndex(By countryLocator, int index) {
		Select select=new Select(getElement(countryLocator));
		select.selectByIndex(index);
		
	}
	public static void doSelectByVisibleText(By countryLocator, String visibleText) {
		Select select=new Select(getElement(countryLocator));
		select.selectByVisibleText(visibleText);
		
	}
	public static void doSelectByValue(By countryLocator, String value) {
		Select select=new Select(getElement(countryLocator));
		select.selectByValue(value);
		
	}

}
