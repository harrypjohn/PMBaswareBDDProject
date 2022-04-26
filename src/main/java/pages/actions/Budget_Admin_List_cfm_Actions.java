package pages.actions;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Budget_Admin_List_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class Budget_Admin_List_cfm_Actions {

	Budget_Admin_List_cfm_Locators objBudget_Admin_List_cfm_Locators;
	WebDriver driver= SeleniumDriver.getDriver();
	
	public Budget_Admin_List_cfm_Actions()
	{
		this.objBudget_Admin_List_cfm_Locators=new Budget_Admin_List_cfm_Locators();
		PageFactory.initElements(driver, objBudget_Admin_List_cfm_Locators);
	}
	
	public void search_Budget() throws InterruptedException
	{
		CommonMethods.sendKeys(objBudget_Admin_List_cfm_Locators.Keyword_Budget_Search, "Harbans Budget 2222");
		CommonMethods.click_element(objBudget_Admin_List_cfm_Locators.submit_Button);
	
		
		
		
		
		
	}
}
