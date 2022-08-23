package myTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationOpenCartUsingDataProvider extends BaseTest{

	@DataProvider
	public Object[][] registrationData() {
		return new Object[][]{
			{"Yashi","Singhal","yashi.singhal@gmail.com","9033330081","yashi@123"},
			{"Prateek","Garg","prateek@gmail.com","6787887878","prateek@gmail.com"},
			{"Ramesh","Giri","giri@gmail.com","6565655556","giri@123"}
		};
	}
	@Test(dataProvider="registrationData")
	public void regitration(String firstName,String lastName,String emailId,String telNum,String pwd) {
		driver.findElement(By.id("input-firstname")).sendKeys("Yashi");
		driver.findElement(By.id("input-lastname")).sendKeys("Singhal");
		driver.findElement(By.id("input-email")).sendKeys("yashi.singhal@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9033330081");
		driver.findElement(By.id("input-password")).sendKeys("yashi@123");
		driver.findElement(By.id("input-confirm")).sendKeys("yashi@123");
		driver.findElement(By.xpath("(//label[@class='radio-inline']/input)[1]")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit' and @value='Continue']")).click();
		String msg=driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		System.out.println(msg);
		Assert.assertEquals(msg, "Your Account Has Been Created!");
	}
}
