package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutorConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		JavascriptUtil jsUtil=new JavascriptUtil(driver);
		String title=jsUtil.getTitleByJS();
		System.out.println(title);
		//jsUtil.generateAlert("hi..this is my alert");
		//jsUtil.refreshBrowserByJS();
		//String pageText=jsUtil.getPageInnerTextByJS();
		//if (pageText.contains("Deals & Sales Pipeline")) 
			//System.out.println("PASS");
		//WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
		//jsUtil.drawBorder(login);
		//jsUtil.scrollPageDown();
		//Thread.sleep(2000);
		//jsUtil.scrollPageUp();
		//Thread.sleep(2000);
		//WebElement ele=driver.findElement(By.xpath("//span[text='Top Sellers in Books for you']"));
		
		jsUtil.sendKeysUsingWithId("input-email", "tom@gmail.com");
	}
}
