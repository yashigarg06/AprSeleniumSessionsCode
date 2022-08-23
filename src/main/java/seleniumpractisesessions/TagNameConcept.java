package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/product&product_id=43");
		By prdTag=By.tagName("h1");
		String  actualProdName=doElementGetText(prdTag);
		
		if(actualProdName.equals("MacBook"))
		{
			System.out.println("product name is correct");
		}
		else
		{
			System.out.println("Fail");
		}
		By eleText=By.linkText("Terms & Conditions");
		System.out.println(doElementGetText(eleText));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		By labelPath=By.xpath("//*[@id=\"account\"]/div[2]/label");
		System.out.println(doElementGetText(labelPath));
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/?");
		By contLinkName=By.linkText("CONTACT SALES");
		System.out.println("Text name of contact sales is: "+ doElementGetText(contLinkName));
		

	}
	public static String doElementGetText(By locator)
	{
		return getElement(locator).getText();
	}
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

}
