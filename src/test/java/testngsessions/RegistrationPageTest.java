package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPageTest {
	WebDriver driver;
	@BeforeTest
	public void setup() { 
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	}
	@Test
	public void regitration() {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys("Yashi");
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys("Singhal");
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys("yashi.singhal@gmail.com");
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys("9033330081");
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys("yashi@123");
		driver.findElement(By.id("input-confirm")).clear();
		driver.findElement(By.id("input-confirm")).sendKeys("yashi@123");
		driver.findElement(By.xpath("(//label[@class='radio-inline']/input)[1]")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']")).click();
		String msg=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(msg);
		Assert.assertEquals(msg, "Your Account Has Been Created!");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
