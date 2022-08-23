package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest{


	@Test(priority = 1)
	public void  titleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS");
	}
	@Test(priority = 2)
	public void  contactSalesLinkTest() {
		
		Assert.assertTrue(driver.findElement(By.linkText("CONTACT SALES")).isDisplayed());
	}
	
}
