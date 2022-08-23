package seleniumpractisesessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	private WebDriver driver;
	/**
	 * this method is used to initialize the driver on basis of browsername
	 * @param browserName
	 * @return this returns driver
	 * creating wrapper functions for use in selenium projects
	 */
	public WebDriver initDriver(String browserName) {
		
		System.out.println("browsername is :"+ browserName);
		switch(browserName) {
		case "chrome":
		{
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    break;
		}
		case "firefox":
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		}
		case "edge":
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
		}
			
		default: {
			System.out.println("Please pass the right browser.. "+ browserName);
			break;
		}
	   }
		return driver;
		
	}
	
	//method to launch the url
	public void launchUrl(String url) {
		if (url==null)
		{
			System.out.println("url is null..");
			return;
		}
		if (url.length()==0)
		{
			System.out.println("url is blank");
			return;
		}
		if (url.startsWith("http://")==false && url.startsWith("https://")==false)
		{
			System.out.println("url doesn't contain http or https..");
			return;
		}
		
		
		driver.get(url);
		
	}
	//method is used to return page title
	public String getPageTitle(){
		String title=driver.getTitle();
		System.out.println("Page title is:" + title);
		return title;
	}
	//method is used to return page url
	public String getPageUrl() {
		String url=driver.getCurrentUrl();
		System.out.println("page source is: "+ url);
		return url;
	}
	//Check if url contains a fraction
	public Boolean isUrlFractionExist(String urlFraction) {
		if(getPageUrl().contains(urlFraction)) {
			return true;
		}
		return false;
	}
	//function to get the pagesource
	public String getPageSource() {
		String pageSource = driver.getPageSource();
		//System.out.println("page source is :"+ pageSource);
		return(pageSource);
	}
	//function to check if a info is present in page source
	public Boolean isInfoExistInPageSource(String info) {
		if(driver.getPageSource().contains(info))
		{
			return true;
		}
		else 
		{	
		    return false;
		}
		}
	//function to close the browser
	public void closeBrowser() {
		driver.close();
	}
	public void quitBrowser() {
		driver.quit();
	}
	}



