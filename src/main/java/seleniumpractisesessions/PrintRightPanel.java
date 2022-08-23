package seleniumpractisesessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintRightPanel {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By rightPanerLocator=By.xpath("//div[@class='list-group']/a");
		ElementUtil eleUtil=new ElementUtil(driver);
		List<String> rightPanelLinkList=eleUtil.getElementsTextList(rightPanerLocator);
		System.out.println("Links in rightmost panel are: ");
		for(String e:rightPanelLinkList) {
			System.out.println(e);
		}

		

	}

}
