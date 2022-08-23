package seleniumpractisesessions;

//import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.amazon.com");
		
		if (brUtil.isUrlFractionExist("amazon"))
		
			System.out.println("url is corrent with amazon...pass");
		else
			System.out.println("Fail");
		
		if (brUtil.isInfoExistInPageSource("htts://amazon.com"))
			System.out.println("htts://amazon.completion.com is present in pagesource..pass");
		else
			System.out.println("Fail");
		
		if (brUtil.getPageTitle().equals("Amazon.com. Spend less. Smile more."))
			System.out.println("title is Pass");
		else
			System.out.println("Fail");
		
		brUtil.quitBrowser();
			
		
	}

}
