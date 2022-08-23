package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest{

	

	@Test(priority=1)
	public void cartLinkTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@title='Shopping Cart']")).isDisplayed());
	}
	@Test(priority = 2)
	public void goToShoppingCartTest() {
		driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
		String text=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Shopping Cart");
	}
	
	
}
