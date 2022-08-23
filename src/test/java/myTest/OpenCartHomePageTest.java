package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartHomePageTest extends BaseTest{
	
	
	@Test
	public void searchFieldTest(){
		Assert.assertTrue(driver.findElement(By.cssSelector("div.input-group input.input-lg")).isDisplayed());	
	}
	@Test
	public void searchItemTest() {
		driver.findElement(By.cssSelector("div.input-group input.input-lg")).clear();
		driver.findElement(By.cssSelector("div.input-group input.input-lg")).sendKeys("mac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		String text=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(text);
		Assert.assertEquals(text, "Search - mac");
	}
	
}
