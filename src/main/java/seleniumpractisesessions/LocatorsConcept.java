package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	static WebDriver driver;
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
		
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public static void doSendKeys(String locatorType, String selector,String value)
	{
		By locator=getBy(locatorType,selector);
		getElement(locator).sendKeys(value);
		
	}
	public static By getBy(String locatorType,String selector) {
		By locator=null;
		switch(locatorType) {
		case  "id":
			locator=By.id(selector);
			break;
		default:
			break;
		}
		return locator;
	}
	
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		
		//By locator approach
		/*By emailEle=By.id("input-email");
		By pwdEle=By.id("input-password");
		WebElement emailId=driver.findElement(emailEle);
		WebElement password=driver.findElement(pwdEle);
		emailId.sendKeys("naveen@gmail.com");
		password.sendKeys("test@123");*/
		
		//by locator+generic function
		//By emailId=By.id("input-email");
		//By pwdId=By.id("input-password");
		//getElement(emailId).sendKeys("naveen@gmail.com");
		//getElement(pwdId).sendKeys("test@123");
		
		//by locator + generic function for element and functions
		
		//ElementUtil eleUtil=new ElementUtil(driver);
		//doSendKeys(emailId,"naveen@gmail.com");
		//doSendKeys(pwdId,"test@123");
		
		//string locator+ browser util and element util
		String email_id="input-email";
		String pwd_id="input-password";
		//By emailid=By.id(email_id);
		//By pwdid=By.id(pwd_id);
		
		//doSendKeys(getBy(email_id),"naveen@gmail.com");
		//doSendKeys(getBy(pwd_id),"test@123");
		doSendKeys("id",email_id,"naveen@gmail.com");
		doSendKeys("id",pwd_id,"test@123");
		
	}

}
