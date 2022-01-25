package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Dashboard_cfm_Locators;
import pages.locators.Free_Form_OR_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class Free_Form_OR_cfm_Actions {
	Dashboard_cfm_Locators objDashboard_cfm_Locators;
	Dashboard_cfm_Actions objDashboard_cfm_Actions;
	WebDriver driver=SeleniumDriver.getDriver();
	Free_Form_OR_cfm_Locators objFree_Form_OR_cfm_Locators;
	public  Free_Form_OR_cfm_Actions() {
		this.objDashboard_cfm_Locators=new Dashboard_cfm_Locators();
		PageFactory.initElements(driver, objDashboard_cfm_Locators);
		this.objFree_Form_OR_cfm_Locators=new Free_Form_OR_cfm_Locators();
		PageFactory.initElements(driver, objFree_Form_OR_cfm_Locators);
	}
	
	public void click_On_Vendor_Selection_Search_Icon(String str) throws InterruptedException
	{
		
		CommonMethods.clickelement(objFree_Form_OR_cfm_Locators.vendor_search_button);
	
		Thread.sleep(5000);
		CommonMethods.click_element(objFree_Form_OR_cfm_Locators.filter);
		
		Thread.sleep(5000);
		CommonMethods.click_element(objFree_Form_OR_cfm_Locators.reset_button);
		Thread.sleep(5000);
	
		
		CommonMethods.click_element(objFree_Form_OR_cfm_Locators.filter);
		Thread.sleep(5000);
		
	
		CommonMethods.sendKeys(objFree_Form_OR_cfm_Locators.criteria, str);
		Thread.sleep(5000);


		CommonMethods.click_element(objFree_Form_OR_cfm_Locators.apply_button);
		Thread.sleep(5000);
	
		CommonMethods.highLightMethod(objFree_Form_OR_cfm_Locators.titleselect_buttons);
		Thread.sleep(5000);

		CommonMethods.clickelement(objFree_Form_OR_cfm_Locators.checkbox);
		Thread.sleep(5000);
		
		CommonMethods.highLightMethod(objFree_Form_OR_cfm_Locators.select_button);
		Thread.sleep(10000);
		CommonMethods.clickelement(objFree_Form_OR_cfm_Locators.select_button);
		Thread.sleep(10000);
		
	}
	public void enter_Details_Of_FreeForm_Item(String str2,String str3,String str4,String str5) throws InterruptedException{
		CommonMethods.highLightMethod(objFree_Form_OR_cfm_Locators.item_Description);
	    CommonMethods.sendKeys(objFree_Form_OR_cfm_Locators.item_Description, str2);
	    CommonMethods.highLightMethod(objFree_Form_OR_cfm_Locators.category);
		CommonMethods.selectDropDown(objFree_Form_OR_cfm_Locators.category, str3);
		CommonMethods.sendKeys(objFree_Form_OR_cfm_Locators.quantity, str4);
		CommonMethods.sendKeys(objFree_Form_OR_cfm_Locators.unitPrice, str5);
		CommonMethods.clickelement(objFree_Form_OR_cfm_Locators.process_Button);
		CommonMethods.clickelement(objFree_Form_OR_cfm_Locators.add_To_Shopping_Cart_Button);
		Thread.sleep(5000);
	}
	
	
	
}
