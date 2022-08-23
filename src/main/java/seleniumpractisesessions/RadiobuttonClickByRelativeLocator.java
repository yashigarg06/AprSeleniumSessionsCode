package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadiobuttonClickByRelativeLocator {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement radioLabelYes=driver.findElement(By.xpath("(//label[@class='radio-inline'])[1]"));
		System.out.println(radioLabelYes.getText());
		
		WebElement rbtn= driver.findElement(with(By.tagName("input")).toRightOf(radioLabelYes));
		System.out.println(rbtn.getAttribute("type"));
		rbtn.click();
	}

}
