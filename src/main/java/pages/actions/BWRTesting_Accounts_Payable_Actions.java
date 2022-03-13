package pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BWRTesting_Accounts_Payable_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class BWRTesting_Accounts_Payable_Actions {
	BWRTesting_Accounts_Payable_Locators objBwreleasetesting1_p2p_Edge_home_Locators;
	WebDriver driver=SeleniumDriver.getDriver();
	public BWRTesting_Accounts_Payable_Actions()
	{
		this.objBwreleasetesting1_p2p_Edge_home_Locators=new BWRTesting_Accounts_Payable_Locators();
		PageFactory.initElements(driver, objBwreleasetesting1_p2p_Edge_home_Locators);
		
	}
	public void click_On_Accounts_Payable() throws InterruptedException
	{
		CommonMethods.open_Shadow_Dom_Element_Click(objBwreleasetesting1_p2p_Edge_home_Locators.cssSelectorForHost,objBwreleasetesting1_p2p_Edge_home_Locators.cssSelectorElement);

		Thread.sleep(5000);
	}
	
}
