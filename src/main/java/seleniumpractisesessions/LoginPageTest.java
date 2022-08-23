package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.initDriver("chrome");
	
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		try {
			System.out.println(brUtil.getPageTitle());
			System.out.println(brUtil.getPageUrl());
			
			ElementUtil eleUtil=new ElementUtil(driver);
			By emailId=By.id("input-email");
			By pwdId=By.id("input-password");
			eleUtil.doSendKeys(emailId, "naveen@gmail.com");
			eleUtil.doSendKeys(pwdId, "test@123");
		    if(brUtil.getPageTitle().equals("Account Login"))
		    	System.out.println("correct page");
		    else
		    	System.out.println("incorrect page");
		    if(brUtil.getPageUrl().equals("https://naveenautomationlabs.com/opencart/index.php?route=account/login"))
		    	System.out.println("correct url in browser");
		    else
		    	System.out.println("incorrect url in browser");

		}
		catch(Exception e)
		{
			System.out.println("exception is coming");
		}
		
		
		//brUtil.closeBrowser();
	}

}
