package pages.actions;

import org.apache.hc.core5.http.EndpointDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Finish_OR_cfm_Locators;
import pages.locators.ORs_Review_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class ORs_Review_cfm_Actions {
ORs_Review_cfm_Locators objORs_Review_cfm_Locators;
PopUp_Win_Display_cfm_Actions objPopUp_Win_Display_cfm_Actions=new PopUp_Win_Display_cfm_Actions();
Finish_OR_Step2_cfm_Actions objFinish_OR_Step2_cfm_Actions=new Finish_OR_Step2_cfm_Actions();
WebDriver driver=SeleniumDriver.getDriver();
public ORs_Review_cfm_Actions()
{
	this.objORs_Review_cfm_Locators=new ORs_Review_cfm_Locators();
	PageFactory.initElements(driver, objORs_Review_cfm_Locators);
}

public void clickOnShoppingCartIcon() throws InterruptedException
{
	CommonMethods.highLightMethod(objORs_Review_cfm_Locators.shoppingCartIcon);
	CommonMethods.clickelement(objORs_Review_cfm_Locators.shoppingCartIcon);
}
public void click_On_Finish_Request_Button() throws InterruptedException
{
	/*CommonMethods.highLightMethod(objORs_Review_cfm_Locators.accountCodeDropDown);
	CommonMethods.selectDropDown(objORs_Review_cfm_Locators.accountCodeDropDown,"10000185");*/
	CommonMethods.highLightMethod(objORs_Review_cfm_Locators.finish_Request_Button);
	CommonMethods.clickelement(objORs_Review_cfm_Locators.finish_Request_Button);
	CommonMethods.clickelement(objORs_Review_cfm_Locators.Ship_To_Location);
	//objPopUp_Win_Display_cfm_Actions.select_ShipTo_BaswareInc();
	objPopUp_Win_Display_cfm_Actions.select_ShipTo_BaswareInc();
	CommonMethods.clickelement(objORs_Review_cfm_Locators.Bill_To_Location);
	objPopUp_Win_Display_cfm_Actions.select_BillTo_BaswareInc();
	
	
	
	
	objORs_Review_cfm_Locators.note3.sendKeys("abc");
	
	
	CommonMethods.highLightMethod(objORs_Review_cfm_Locators.create_Order_Request_Button);
	CommonMethods.clickelement(objORs_Review_cfm_Locators.create_Order_Request_Button);
	Thread.sleep(5000);
	if(objORs_Review_cfm_Locators.Successfully_created_order_request.getText().contains("Successfully created order request"))
	{
		
	}
	else
	{
	 System.out.println("Test case is fail ");
	}
}
public void click_Special_Functions_DropDown() throws InterruptedException
{
	CommonMethods.clickelement(objORs_Review_cfm_Locators.special_Functions);
	CommonMethods.clickelement(objORs_Review_cfm_Locators.create_Blank_PO_Request_Button);
	
	
}

}
