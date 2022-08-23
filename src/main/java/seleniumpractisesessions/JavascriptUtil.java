package seleniumpractisesessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptUtil {
	private WebDriver driver;
	public JavascriptUtil(WebDriver driver) {
		this.driver=driver;
	}

	public String getTitleByJS() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		return js.executeScript("return document.title;").toString();
	}
	public void generateAlert(String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	public void sendKeysUsingWithId(String id,String value) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('"+ id +"').value='"+ value +"'");
	}
	public void refreshBrowserByJS() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	public void goBackByJS() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(-1)");
	}
	public void goForwardByJS() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(1)");
	}
	public String getPageInnerTextByJS() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	public void drawBorder(WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public void scrollPageDown() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	public void scrollPageDown(String height) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,'"+height+"');");
	}
	public void scrollPageUp() {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	}
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo();",element);
	}
}
