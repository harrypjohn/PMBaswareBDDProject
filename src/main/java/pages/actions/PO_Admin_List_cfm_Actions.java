package pages.actions;

import java.sql.Date;
import java.util.Calendar;

import org.omg.CORBA.COMM_FAILURE;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.PO_Admin_List_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class PO_Admin_List_cfm_Actions {
PO_Admin_List_cfm_Locators objPO_Admin_List_cfm_Locators;
WebDriver driver=SeleniumDriver.getDriver();
Finish_OR_Step2_cfm_Actions objFinish_OR_Step2_cfm_Actions=new Finish_OR_Step2_cfm_Actions();
public PO_Admin_List_cfm_Actions()
{
	this.objPO_Admin_List_cfm_Locators=new PO_Admin_List_cfm_Locators();
	PageFactory.initElements(driver, objPO_Admin_List_cfm_Locators);
}
public void enter_Purchase_Order_Number(String poNumber)
{
	CommonMethods.sendKeys(objPO_Admin_List_cfm_Locators.enter_PO_Number,poNumber);
}
public void click_Search_Icon() throws InterruptedException
{
	CommonMethods.highLightMethod(objPO_Admin_List_cfm_Locators.search_Icon);
	CommonMethods.clickelement(objPO_Admin_List_cfm_Locators.search_Icon);
	
}
public String get_PO_Total() throws InterruptedException
{
	String po_Total=objPO_Admin_List_cfm_Locators.po_Total.getText();
	return po_Total;
}
public void receiving_Purchase_Order(String ponumber) throws InterruptedException
{
	CommonMethods.clickelement(objPO_Admin_List_cfm_Locators.click_Checkbox);
	CommonMethods.clickelement(objPO_Admin_List_cfm_Locators.click_More_Actions);
	CommonMethods.clickelement(objPO_Admin_List_cfm_Locators.receive_PO);
	CommonMethods.clickelement(objPO_Admin_List_cfm_Locators.Received_Quantity);
	CommonMethods.sendKeys(objPO_Admin_List_cfm_Locators.receiving_Reference_Number,ponumber );
	CommonMethods.clickelement(objPO_Admin_List_cfm_Locators.process_Items);
}
}
