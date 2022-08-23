package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchElement {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By search=By.name("search");
		ElementUtil eleUtil=new ElementUtil(driver);
		if(eleUtil.doIsDisplayed(search)) {
			System.out.println("element is displayed one time on screen");
		}
		By linkForgotPwd=By.linkText("Forgotten Password");
		if (eleUtil.checkElementMultipleExist(linkForgotPwd)) {
			System.out.println("forgot pwd is displayed multiple times");
			int count=eleUtil.getElementsCount(linkForgotPwd);
			System.out.println("forgot pwd link is displayed "+ count +" times");
		}
	}
}
