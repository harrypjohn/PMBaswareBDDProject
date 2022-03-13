package pages.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BWRTesting_Accounts_Payable_Locators;
import pages.locators.BWRTesting_In_Manual_Order_Matching_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class BWRTesting_In_Manual_Order_Matching_Actions {
	BWRTesting_In_Manual_Order_Matching_Locators objBWRTesting_In_Manual_Order_Matching_Locators;
	WebDriver driver=SeleniumDriver.getDriver();

	public BWRTesting_In_Manual_Order_Matching_Actions() {

		this.objBWRTesting_In_Manual_Order_Matching_Locators =new BWRTesting_In_Manual_Order_Matching_Locators();
		PageFactory.initElements(driver, objBWRTesting_In_Manual_Order_Matching_Locators);

	}

	public void click_On_In_Manual_Order_Matching() throws InterruptedException {
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.in_Manual_Order_Matching);
	}
	public void click_Open_Open_Button() throws InterruptedException {
		
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.click_On_Open_Button);
	}
	public void click_On_More_Options() throws InterruptedException {
		CommonMethods.highLightMethod(objBWRTesting_In_Manual_Order_Matching_Locators.select_More_Options);
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.select_More_Options);
	}
	public void select_Retrieve_PurChase_OrderOption() throws InterruptedException {
		CommonMethods.highLightMethod(objBWRTesting_In_Manual_Order_Matching_Locators.click_On_Retrieve_PO_DropDown);
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.click_On_Retrieve_PO_DropDown);
	}
	public void retrieve_Purchase_Order() throws InterruptedException, AWTException {
		CommonMethods.highLightMethod(objBWRTesting_In_Manual_Order_Matching_Locators.company);
		
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.company);
        CommonMethods.highLightMethod(objBWRTesting_In_Manual_Order_Matching_Locators.enter_Company_Name);
		
		CommonMethods.sendKeys(objBWRTesting_In_Manual_Order_Matching_Locators.enter_Company_Name,"BW70");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.supplier);
		CommonMethods.sendKeys(objBWRTesting_In_Manual_Order_Matching_Locators.enter_Supplier, "Hotel Glo");
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.checkbox_Supplier);
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.select_Supplier);
		CommonMethods.clickelement(objBWRTesting_In_Manual_Order_Matching_Locators.Ok);
		
		
	}
}
