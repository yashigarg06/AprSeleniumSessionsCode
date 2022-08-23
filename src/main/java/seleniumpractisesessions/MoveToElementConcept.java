package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://mrbool.com/search/");
	    Actions act=new Actions(driver);
	    By parentMenu=By.className("menulink");
	    By childMenu=By.linkText("COURSES");
	    handleTwoLevelMenuItems(parentMenu,childMenu);

	}

	public static void handleTwoLevelMenuItems(By parentMenu, By childMenu) throws InterruptedException {
		Actions act=new Actions(driver);
		
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(3000);
		getElement(childMenu).click();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
