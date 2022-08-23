package seleniumpractisesessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	//Total number of links on page
	//Print text of each link on console
	//print only those links which are not blank
	//Print each text with their index
	//find out blank or broken links ---discuss later
	static WebDriver driver;
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
			By links=By.tagName("a");
			
			By images=By.tagName("img");
			//By links_xpath= By.xpath("//a[@href]");
			//System.out.println("total link on amazon.com are "+linksList.size());
			//for (int i=0;i<linksList.size();i++) {
				//String text=linksList.get(i).getText();
				//if (!text.isEmpty())
					//System.out.println(i+". "+text);
			//}
			//use foreach loop for the same
			//int count=0;
			//for(WebElement e:linksList)
			//{
				//String text=e.getText();
				//if (!text.isEmpty()) {
					//System.out.println(count+". "+text);
				//}
				//count++;
				
			//}
			System.out.println("Total number of links are "+ getPageElementsCount(links));
			System.out.println("Total number of images on page are "+ getPageElementsCount(images));
			List <String> eleTextList=getElementsTextList(links);
			if (eleTextList.contains("Careers")) {
				System.out.println("carrers is present");
			}
			else
			{
				System.out.println("Fail");
			}
			System.out.println(eleTextList.contains(""));
			System.out.println();
	}

	public static void getEmptyElementTextList(By locator) {
		
	}
	public static int getElementsTextCount(By locator) {
	
		return getElementsTextList(locator).size();
	}
	public static List <String> getElementsTextList(By locator) {
		List <WebElement> eleList = getElements(locator);
		List <String> eleTextList = new ArrayList <String> ();
		for(WebElement e : eleList) {
			String text=e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	public static int getPageElementsCount(By locator) {
		return getElements(locator).size();
	}
	public static List <WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
