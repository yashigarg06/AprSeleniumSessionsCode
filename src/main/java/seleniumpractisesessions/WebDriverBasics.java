package seleniumpractisesessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//start the server by setting system path of .exe file
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\prate\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//Open the chrome browser
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println("title of page is: "+ title);
		if (title.equals("Google"))
			System.out.println("correct title");
		else
			System.out.println("Incorrect title");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.google.com"))
			System.out.println("currect url");
		else
			System.out.println("Incorrect url");
		driver.quit();	
	}

}
