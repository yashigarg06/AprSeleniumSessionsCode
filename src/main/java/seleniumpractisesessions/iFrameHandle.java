package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrameHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver
		.findElement(By.cssSelector("div#imageTemplateContainer img"))
		.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("frame-one748593425")));
		driver.findElement(By.id("RESULT_TextField-7")).sendKeys("123445554");
		Select stateDropdown=new Select(driver.findElement(By.id("RESULT_RadioButton-12")));		

	}

}
