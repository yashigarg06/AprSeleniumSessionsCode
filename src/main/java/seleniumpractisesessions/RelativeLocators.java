package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement baseElement=driver.findElement(By.linkText("Barrie, Canada"));
		String rightIndex=driver.findElement(with(By.tagName("p")).toRightOf(baseElement)).getText();
		System.out.println(rightIndex);
		String leftIndex=driver.findElement(with(By.tagName("p")).toLeftOf(baseElement)).getText();
		System.out.println(leftIndex);
		String belowIndex=driver.findElement(with(By.tagName("p")).below(baseElement)).getText();
		System.out.println(belowIndex);
		String aboveIndex=driver.findElement(with(By.tagName("p")).above(baseElement)).getText();
		System.out.println(aboveIndex);
		String nearIndex=driver.findElement(with(By.tagName("p")).near(baseElement)).getText();
		System.out.println(nearIndex);
		List<WebElement> belowElements= driver.findElements(with(By.tagName("p")).below(baseElement));
		System.out.println(belowElements.size());
		for(WebElement e:belowElements) {
			
			System.out.println(e.getText());
		}
		

	}

}
