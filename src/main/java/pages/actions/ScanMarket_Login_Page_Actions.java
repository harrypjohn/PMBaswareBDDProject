package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.ScanMarket_Login_Page_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class ScanMarket_Login_Page_Actions {
	
	ScanMarket_Login_Page_Locators objScanMarket_Login_Page_Locators;
	WebDriver driver=SeleniumDriver.getDriver();
	public ScanMarket_Login_Page_Actions()
	{
		this.objScanMarket_Login_Page_Locators=new ScanMarket_Login_Page_Locators();
		PageFactory.initElements(driver, objScanMarket_Login_Page_Locators);
	}
	public void UsernamePasswordEntryScanMarket(String username, String password) throws InterruptedException
	{
		objScanMarket_Login_Page_Locators.username.sendKeys(username);
		Thread.sleep(2000);
		objScanMarket_Login_Page_Locators.password.sendKeys(password);
		Thread.sleep(2000);
		CommonMethods.isElementVisible(objScanMarket_Login_Page_Locators.login_Button);
		if(objScanMarket_Login_Page_Locators.login_Button.isDisplayed())
		{
			System.out.println("Yes login button is visible");
		}
		objScanMarket_Login_Page_Locators.login_Button.click();
		
		Thread.sleep(5000);
         
	}
}
