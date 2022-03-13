package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.locators.Dashboard_cfm_Locators;
import pages.locators.ORs_Review_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class Dashboard_cfm_Actions {
	  WebDriver driver=SeleniumDriver.getDriver();
Dashboard_cfm_Locators objDashboard_cfm_Locators;


public Dashboard_cfm_Actions()
{
	this.objDashboard_cfm_Locators=new Dashboard_cfm_Locators();
	PageFactory.initElements(driver, objDashboard_cfm_Locators);
}

public void clickOnSearchCatalog() throws InterruptedException
{ 
objDashboard_cfm_Locators.Requisition.click();
Thread.sleep(5000);
objDashboard_cfm_Locators.searchcatalog.click();
}

public void click_On_Requisitions() throws InterruptedException
{
	CommonMethods.click_element(objDashboard_cfm_Locators.Requisition);
	Thread.sleep(5000);
}
public void click_On_Requistions_Off_Catalog_Request() throws InterruptedException
{
	CommonMethods.highLightMethod(objDashboard_cfm_Locators.requistions_Off_Catalog_Request);
	CommonMethods.click_element(objDashboard_cfm_Locators.requistions_Off_Catalog_Request);
	Thread.sleep(5000);
}
public void click_Purchase_Orders() throws InterruptedException
{ 
objDashboard_cfm_Locators.purchase_Orders.click();
Thread.sleep(5000);
objDashboard_cfm_Locators.manage_Track_Purchase_Orders.click();
}
public void clickOnSearchIcon() throws InterruptedException
{
    CommonMethods.highLightMethod(objDashboard_cfm_Locators.smallsearchbutton);
	WebElement webElement = objDashboard_cfm_Locators.smallsearchbutton;
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", webElement);
	Thread.sleep(2000);
}

public void logout() throws InterruptedException
{   Thread.sleep(2000);
	CommonMethods.clickelement(objDashboard_cfm_Locators.adminDropDown);
	Thread.sleep(2000);
	CommonMethods.clickelement(objDashboard_cfm_Locators.logout);
}

}
