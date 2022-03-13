package pages.actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.PopUp_Win_Display_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class PopUp_Win_Display_cfm_Actions {
PopUp_Win_Display_cfm_Locators objPopUp_Win_Display_cfm_Locators;
 WebDriver driver=SeleniumDriver.getDriver();
 public PopUp_Win_Display_cfm_Actions()
 {
	this.objPopUp_Win_Display_cfm_Locators=new PopUp_Win_Display_cfm_Locators();
	PageFactory.initElements(driver, objPopUp_Win_Display_cfm_Locators);
 }
 public void select_ShipTo_BaswareInc() throws InterruptedException
 {
	 CommonMethods.switch_To_ChildWindow();
	 CommonMethods.highLightMethod(objPopUp_Win_Display_cfm_Locators.click_All);
	 CommonMethods.clickelement(objPopUp_Win_Display_cfm_Locators.click_All);
	 CommonMethods.selectDropDown(objPopUp_Win_Display_cfm_Locators.make_Selection_ShipToLocation, "89397");
	 CommonMethods.highLightMethod(objPopUp_Win_Display_cfm_Locators.click_Select_Button);
	 Thread.sleep(5000);
	 String window=driver.getWindowHandle();
	 CommonMethods.clickelement(objPopUp_Win_Display_cfm_Locators.click_Select_Button);	
	 CommonMethods.switch_To_ParentWindow();
    
 }
 public void select_BillTo_BaswareInc() throws InterruptedException
 {
	 
	 CommonMethods.switch_To_ChildWindow();		   
	 CommonMethods.highLightMethod(objPopUp_Win_Display_cfm_Locators.click_All);
	 CommonMethods.clickelement(objPopUp_Win_Display_cfm_Locators.click_All);
	 CommonMethods.selectDropDown(objPopUp_Win_Display_cfm_Locators.make_Selection_ShipToLocation, "89397");
     CommonMethods.clickelement(objPopUp_Win_Display_cfm_Locators.click_Select_Button);
     CommonMethods.switch_To_ParentWindow();
 }

}
