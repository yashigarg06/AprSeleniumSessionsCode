package seleniumpractisesessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinksAttributeValue {

	public static void main(String[] args) {
		BrowserUtil brUtil=new BrowserUtil();
		WebDriver driver=brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.orangehrm.com/");
		ElementUtil eleUtil=new ElementUtil(driver);
		By locator=By.tagName("a");
		List <WebElement> linksList=eleUtil.getElements(locator);
		List <String> linksTextList=new ArrayList <String>();
		for (WebElement e:linksList) {
			
			if(e.getText().length()!=0) {
				linksTextList.add(e.getText());
			}
		}
		System.out.println(linksTextList);
		List <String> linksAttributeList=eleUtil.getEleAttributeList(locator, "href");
		System.out.println(linksAttributeList);
		
	}

}
