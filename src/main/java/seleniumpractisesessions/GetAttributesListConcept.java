package seleniumpractisesessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributesListConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		By links=By.tagName("a");
		By image=By.tagName("img");
		List <String> attributeList = getEleAttributeList(links,"href");
		System.out.println(attributeList);
		attributeList=getEleAttributeList(image,"alt");
		System.out.println(attributeList);
		//System.out.println(getEleAttributeList(image,"alt"));
		//System.out.println(getEleAttributeList(image,"height"));
		
	}
	public static List <String> getEleAttributeList(By locator, String attributeName) {
		List<WebElement> eleList=getElements(locator);
		List <String> attributeList= new ArrayList<String> ();
		for(WebElement e:eleList) {
			String attrText=e.getAttribute(attributeName);
			attributeList.add(attrText);
		}
		return attributeList;
		
	}
	public static List <WebElement> getElements(By locator){
		
		List <WebElement> eleList = driver.findElements(locator);
		return eleList;
	}

}
