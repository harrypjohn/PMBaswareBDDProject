package Steps;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import pages.actions.Budget_Admin_List_cfm_Actions;
import pages.actions.Dashboard_cfm_Actions;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class E2E_87_PM_Alusta_Integration_with_Budgets {
	Dashboard_cfm_Actions objDashboard_cfm_Actions=new Dashboard_cfm_Actions();
	Budget_Admin_List_cfm_Actions objBudget_Admin_List_cfm_Actions=new Budget_Admin_List_cfm_Actions();
	@Then("Add a New Budget")
	public void add_a_new_budget() throws InterruptedException {
	   objDashboard_cfm_Actions.click_On_Manage_Budgets();
	   objBudget_Admin_List_cfm_Actions.search_Budget();
	   List<WebElement> budgets= SeleniumDriver.getDriver().findElements(By.xpath("//div/select[@name='RecordList']/option"));
	   Iterator<WebElement> itr=budgets.iterator();
	   while (itr.hasNext()) {
	   
		
	}

	}
}
