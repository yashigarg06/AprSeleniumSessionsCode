package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByLocatorsWithMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
		//By locatorByid=By.id("search");
		ElementUtil eleUtil=new ElementUtil(driver);
		eleUtil.doSendKeys("name", "search","mac");
		By locatorSearchBtn=By.xpath("//*[@id=\"search\"]/span");
		eleUtil.doClick(locatorSearchBtn);
		By iMacLinkLocator=By.linkText("iMac");
		eleUtil.doClick(iMacLinkLocator);
		By inputQuanLocator=By.id("input-quantity");
		eleUtil.getElement(inputQuanLocator).clear();
		eleUtil.doSendKeys("id", "input-quantity", "2");
		eleUtil.doClick("id","button-cart");
	}
}
