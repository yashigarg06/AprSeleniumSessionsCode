package seleniumpractisesessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassCRMCreateContact {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(); 
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.name("username")).sendKeys("yashig");
		driver.findElement(By.name("password")).sendKeys("yashi@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(10000);
		WebElement contacts=driver.findElement(By.xpath("//a[@title='Contacts']"));
		Actions action=new Actions(driver);
		
		action.clickAndHold(contacts).perform();
		WebElement newContact=driver.findElement(By.linkText("New Contact"));
		action.click(newContact).perform();
		Thread.sleep(2000);
		Select select=new Select(driver.findElement(By.name("title")));
		List<WebElement> titleOptions=select.getOptions();
		for(WebElement e:titleOptions) {
			if(e.getText().equals("Miss")) {
				e.click();
				break;
			}
		}
		driver.findElement(By.id("first_name")).sendKeys("Tom");
		driver.findElement(By.id("surname")).sendKeys("Stone");
		driver.findElement(By.id("image_file")).sendKeys("C:\\Users\\prate\\Downloads\\Reading_week.pdf");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Tom Stone'and @context='contact']/parent::td/preceding-sibling::td")).click();
		List<WebElement> contactDet=driver.findElements(By.xpath("//a[text()='rakesh gupta' and @context='contact']/parent::td/following-sibling::td"));
		for(WebElement e:contactDet) {
			System.out.println(e.getText());

	}
	}
}
