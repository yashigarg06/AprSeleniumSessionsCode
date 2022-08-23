package seleniumpractisesessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownOptions {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		By countryLocator=By.id("Form_submitForm_Country");
		int numOfCountries=getDropDownCount(countryLocator);
		if ((numOfCountries)-1==231)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		List<String> dropdownValues=getDropdownValuesList(countryLocator);
		if(dropdownValues.contains("India")) 
			System.out.println("PASS");
		else
			System.out.println("FAIL");
		

	}
	public static WebElement getElement(By countryLocator) {
		return driver.findElement(countryLocator);
	}
	public static int getDropDownCount(By countryLocator) {
		Select select=new Select(getElement(countryLocator));
		List<WebElement> countryList=select.getOptions();
		return countryList.size();
	}
	public static List<String> getDropdownValuesList(By countryLocator) {
		Select select=new Select(getElement(countryLocator));
		List <WebElement> optionsList=select.getOptions();
		List <String> dropdownValues=new ArrayList<String>();
		for (WebElement e:optionsList) {
			String text=e.getText();
			dropdownValues.add(text);
		}
		return dropdownValues;
		
	}

}
