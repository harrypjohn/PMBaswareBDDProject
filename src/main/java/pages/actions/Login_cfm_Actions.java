package pages.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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
	public void UsernamePasswordEntry(String username, String password) throws InterruptedException, AWTException
	{
		objlogin_cfm_Locators.username.sendKeys(username);
		Thread.sleep(2000);
		objlogin_cfm_Locators.Password.sendKeys(password);
		Thread.sleep(2000);
		CommonMethods.isElementVisible(objlogin_cfm_Locators.LoginButton);
		if(objlogin_cfm_Locators.LoginButton.isDisplayed())
		{
			System.out.println("Yes login button is visible");
		}
		objlogin_cfm_Locators.LoginButton.click();
		
		Thread.sleep(5000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_MINUS);
         
	}
	
	
	
}
