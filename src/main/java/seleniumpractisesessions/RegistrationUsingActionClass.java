package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationUsingActionClass {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act=new Actions(driver);
		WebElement fname=driver.findElement(By.id("input-firstname"));
		WebElement lname=driver.findElement(By.id("input-lastname"));
		WebElement email=driver.findElement(By.id("input-email"));
		WebElement telNum=driver.findElement(By.id("input-telephone"));
		WebElement pwd=driver.findElement(By.id("input-password"));
		WebElement conPwd=driver.findElement(By.id("input-confirm"));
		WebElement chkBox=driver.findElement(By.xpath("//input[@name='newsletter'and @ value='1']"));
		WebElement agreeChkbok=driver.findElement(By.xpath("//input[@name='agree' and @value='1']"));
		WebElement submitBtn=driver.findElement(By.xpath("//input[@type='submit']"));
		
		act.sendKeys(fname, "Tom").perform();
		act.sendKeys(lname, "vance").perform();
		act.sendKeys(email, "tom@gmail.com").perform();
		act.sendKeys(telNum,"7895555333").perform();
		act.sendKeys(pwd, "test123").perform();
		act.sendKeys(conPwd, "test123").perform();
		act.click(chkBox).perform();
		act.click(agreeChkbok).perform();
		act.click(submitBtn).perform();

	}

}
