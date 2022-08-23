package seleniumpractisesessions;

import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {

	public static void main(String[] args) {
		
		BrowserUtil browUtil=new BrowserUtil();
		WebDriver driver=browUtil.initDriver("chrome");
		browUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementUtil eleUtil=new ElementUtil(driver);
		String firstName_id="input-firstname";
		String lastName_id="input-lastname";
		String email_id="input-email";
		String telephone_id="input-telephone";
		String password_id="input-password";
		String confirm_pwd_id="input-confirm";
		String subscribe_yes_xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input";
		String subscribe_no_xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]";
		String priv_policy_name="agree";
		String cont_btn_xpath="//*[@id=\"content\"]/form/div/div/input[2]";
		
		eleUtil.doSendKeys("id", firstName_id, "yashi");
		eleUtil.doSendKeys("id", lastName_id, "garg");
		eleUtil.doSendKeys("id", email_id, "yashi.garg20@gmail.com");
		eleUtil.doSendKeys("id", telephone_id, "9033340066");
		eleUtil.doSendKeys("id", password_id, "yashi@123");
		eleUtil.doSendKeys("id", confirm_pwd_id, "yashi@123");
		eleUtil.doClick("xpath", subscribe_yes_xpath);
		eleUtil.doClick("name", priv_policy_name);
		eleUtil.doClick("xpath", cont_btn_xpath);
		
		
		
		
		
		
		
		
		
	}

}
