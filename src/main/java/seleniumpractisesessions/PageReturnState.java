package seleniumpractisesessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageReturnState {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		String currentState;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		while(true) {
			currentState=js.executeScript("return document.readyState").toString();
			System.out.println(currentState);
			if (currentState.equals("complete")) {
				break;
			}
		}
		
		
		
	}

}
