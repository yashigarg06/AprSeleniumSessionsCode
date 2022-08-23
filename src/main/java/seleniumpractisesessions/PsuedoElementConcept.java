package seleniumpractisesessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PsuedoElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String mandatoryText=js
				.executeScript("return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')").toString();
		if(mandatoryText.contains("*")) {
			System.out.println("First Name is mandatory field");
		}
		

	}

}
