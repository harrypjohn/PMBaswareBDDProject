package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Free_Form_OR_cfm_Locators {

	@FindBy(how=How.XPATH,using="//a[@id='searchIconvendorsAdvanceSearch']")
	public WebElement vendor_search_button;
	
	@FindBy(how=How.XPATH,using="//button[@id='gridFilterDropDown']")
	public WebElement filter;
	@FindBy(how=How.XPATH,using="//button[@id='resetFilter_vendorsAdvanceSearchGrid']")
	public WebElement reset_button;
	
	@FindBy(how=How.XPATH,using="//select[@id='FilterColumns1']")
	public WebElement filter_on;
	
	@FindBy(how=How.XPATH,using="//input[@id='FilterColumnValue1']")
	public WebElement criteria;
	
	@FindBy(how=How.XPATH,using="//button[@id='submitFilter_vendorsAdvanceSearchGrid']")
	public WebElement apply_button;
	
	@FindBy(how=How.XPATH,using="//input[@id='jqg_vendorsAdvanceSearchGrid_280253']")
	public WebElement checkbox;
	
	@FindBy(how=How.XPATH,using="//input[@id='vendorsAdvanceSearchGridSelect']")
	public WebElement select_button;
	
	@FindBy(how=How.XPATH,using="//span[@class='ui-jqgrid-title']")
	public WebElement titleselect_buttons;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='ItemName_1']")
	public WebElement item_Description;
	
	@FindBy(how=How.ID,using="CategoryID_1")
	public WebElement category;
	
	@FindBy(how=How.XPATH,using="//input[@id='Qty_1']")
	public WebElement quantity;
	
	@FindBy(how=How.XPATH,using="//input[@id='UnitPrice_1']")
	public WebElement unitPrice;
	
	@FindBy(how=How.XPATH,using="//input[@name='Finish']")
	public WebElement process_Button;
	
	@FindBy(how=How.XPATH,using="//input[@name='Add']")
	public WebElement add_To_Shopping_Cart_Button;
	


	/*# 22/01/2022*/
}
