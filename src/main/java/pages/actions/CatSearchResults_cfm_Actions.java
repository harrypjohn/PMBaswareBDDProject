package pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CatSearchResults_cfm_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class CatSearchResults_cfm_Actions {

	CatSearchResults_cfm_Locators objCatSearchResults_cfm_Locators;
	WebDriver driver=SeleniumDriver.getDriver();
	public CatSearchResults_cfm_Actions()
	{
		this.objCatSearchResults_cfm_Locators=new CatSearchResults_cfm_Locators();
		PageFactory.initElements(driver, objCatSearchResults_cfm_Locators);
	}
	public void enterItemNameForSearch() throws InterruptedException
	{
		
		CommonMethods.sendKeys(objCatSearchResults_cfm_Locators.search_Item_By_Name, "Office Supplies Item 2 Name");
		Thread.sleep(5000);
		
		CommonMethods.clickelement(objCatSearchResults_cfm_Locators.search_Icon);
		Thread.sleep(10000);
	}
	public void clickOnAddToCart() throws InterruptedException
	{   
		CommonMethods.highLightMethod(objCatSearchResults_cfm_Locators.AddtoCart);
		Thread.sleep(5000);
		CommonMethods.clickelement(objCatSearchResults_cfm_Locators.AddtoCart);
		
		
	}
	public void enterItemNameForSearch(String item) throws InterruptedException
	{
		
		CommonMethods.sendKeys(objCatSearchResults_cfm_Locators.search_Item_By_Name, item);
		Thread.sleep(5000);
		
		CommonMethods.clickelement(objCatSearchResults_cfm_Locators.search_Icon);
		Thread.sleep(10000);
	}
}
