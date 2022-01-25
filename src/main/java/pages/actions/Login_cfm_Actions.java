package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.Dashboard_cfm_Locators;
import pages.locators.Login_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;



public class Login_cfm_Actions {

    WebDriver driver=SeleniumDriver.getDriver();
	Login_cfm_Locators objlogin_cfm_Locators;
	
    
	public Login_cfm_Actions()
	{
		this.objlogin_cfm_Locators=new Login_cfm_Locators();
		PageFactory.initElements(driver, objlogin_cfm_Locators);
	}
	public void UsernamePasswordEntry(String username, String password) throws InterruptedException
	{
		objlogin_cfm_Locators.username.sendKeys(username);
		Thread.sleep(5000);
		objlogin_cfm_Locators.Password.sendKeys(password);
		Thread.sleep(5000);
		CommonMethods.isElementVisible(objlogin_cfm_Locators.LoginButton);
		if(objlogin_cfm_Locators.LoginButton.isDisplayed())
		{
			System.out.println("Yes login button is visible");
		}
		objlogin_cfm_Locators.LoginButton.click();
		
		
         
	}
	
	
}
