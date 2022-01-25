package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Finish_OR_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class Finish_OR_cfm_Actions {
Finish_OR_cfm_Locators objFinish_OR_cfm_Locators;
WebDriver driver= SeleniumDriver.getDriver();
public Finish_OR_cfm_Actions()
{
 this.objFinish_OR_cfm_Locators=new Finish_OR_cfm_Locators();
 PageFactory.initElements(driver, objFinish_OR_cfm_Locators);
}
public void enter_Blanket_PO_Information_Free_Form_Invoicing(String str) throws InterruptedException
{
	CommonMethods.sendKeys(objFinish_OR_cfm_Locators.deactivation_Date,str);
	CommonMethods.clickelement(objFinish_OR_cfm_Locators.free_Form_Invoicing_Radio_Button);
	Thread.sleep(5000);
	CommonMethods.highLightMethod(objFinish_OR_cfm_Locators.create_Blanket_PO_Request_Button);
	Thread.sleep(5000);
	CommonMethods.clickelement(objFinish_OR_cfm_Locators.create_Blanket_PO_Request_Button);
	Thread.sleep(5000);
}
}
