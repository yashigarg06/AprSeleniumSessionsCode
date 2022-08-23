package seleniumpractisesessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetTextName {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.orangehrm.com/");
		ElementUtil eleUtil=new ElementUtil(driver);
		By linkText= By.linkText("CONTACT SALES");
		String text=eleUtil.doElementGetText(linkText);
		System.out.println(text);
		

	}

}
