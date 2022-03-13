package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Invoice_Manager_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class Invoice_Manager_cfm_Actions {

	Invoice_Manager_cfm_Locators objInvoice_Manager_cfm_Locators;
	WebDriver driver=SeleniumDriver.getDriver();
	public Invoice_Manager_cfm_Actions()
	{
		this.objInvoice_Manager_cfm_Locators=new Invoice_Manager_cfm_Locators();
		PageFactory.initElements(driver, objInvoice_Manager_cfm_Locators);
	}
	public void click_On_Invoicing() throws InterruptedException
	{
		objInvoice_Manager_cfm_Locators.Invoicing.click();
		Thread.sleep(5000);
		
	}
	public void click_On_APAutomation_Approval() throws InterruptedException
	{
		objInvoice_Manager_cfm_Locators.ap_Automation_Approval.click();
		Thread.sleep(5000);
		
	}
}
