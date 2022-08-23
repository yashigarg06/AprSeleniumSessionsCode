package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/? ");
		//1.id:attribute
		//2.name:attribute
		//driver.findElement(By.name("email")).sendKeys("test@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("test@123");
		
		//By emailId=By.name("email");
		//String email_name="email";
		//String pwd_name="password";
		
		ElementUtil eleUtil=new ElementUtil(driver);
		//eleUtil.doSendKeys(emailId, "test@gmail.com");
		//eleUtil.doSendKeys("name",pwd_name,"test@123");
		
		//3.class_name:attribute. can be duplicate.can be only used when it's unique
		//assignment:send keys usign by.classname
		
		//4. xpath:not an attribute. address of element in html dom
		//driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
		//By pwd_id=By.xpath("//*[@id=\"input-password\"]");
		//String email_xpath="//*[@id=\"input-email\"]";
		//By login_btn= By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		//String loginbtn_xpath="//*[@id=\"content\"]/div/div[2]/div/form/input";
		//eleUtil.doSendKeys("xpath", email_xpath, "test@gmail.com");
		//eleUtil.doSendKeys(pwd_id, "test@123");
		//eleUtil.doClick(login_btn);
		//eleUtil.doClick("xpath", loginbtn_xpath);
		
		//5. css selector
		By firstName =By.cssSelector("#Form_submitForm_Name");
		eleUtil.doSendKeys(firstName, "Yashi");
		
		
		
		
	}


}
