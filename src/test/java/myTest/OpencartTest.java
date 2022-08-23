package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartTest extends BaseTest{
	
	@Test(priority = 1)
	public void logoTest() {
		boolean flag=driver.findElement(By.cssSelector("img[title='naveenopencart']")).isDisplayed();
		Assert.assertEquals(flag, true);
	}
	@Test(priority = 3)
	public void forgotPwdLinkExistTest() {
		Assert.assertTrue(driver.findElement(By.linkText("Forgotten Password")).isDisplayed());
	}
	@Test(priority = 2)
	public void loginNegativeTest() {
		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		String errorMsg=driver.findElement(By.cssSelector("div.alert-dismissible")).getText().trim();
		System.out.println(errorMsg);
	    Assert.assertEquals(errorMsg, "Warning: No match for E-Mail Address and/or Password.");
	}
	
}
