package seleniumpractisesessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SvgElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);
		driver.
		findElement(By.
				xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']//*[name()='g' and @id='new-mexico']")).click();
		Thread.sleep(2000);
		List<WebElement> mexicoStates=driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @class='counties']//*[name()='path' and @class='child']"));
		System.out.println(mexicoStates.size());
		for(WebElement e : mexicoStates) {
			 //System.out.println(e.getDomAttribute("text"));
		}
	}

}
