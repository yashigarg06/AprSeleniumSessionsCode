package myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithNegativeTestData {
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@DataProvider
	public Object[][] getLoginNegativeData() {
		return new Object[][] {
			{"test@gmail.com","test@123"},
			{"yashi@gmail.com","yashi@123"},
			{"yashi123@gmail.com","yashig@123"},
		};
	}
	@Test()
	public void logoTest() {
		boolean flag=driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	@Test(priority = 3, enabled=false)
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	}
	@Test(priority = 2, dataProvider="getLoginNegativeData")
	public void loginNegativeTest(String userName,String pwd) {
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMsg=driver.findElement(By.cssSelector("div.alert-dismissible")).getText().trim();
		System.out.println(errorMsg);
	    Assert.assertEquals(errorMsg, "Warning: No match for E-Mail Address and/or Password.");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
