package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BWRTesting_In_Manual_Order_Matching_Locators {
	@FindBy(how=How.XPATH,using="//span[normalize-space()='In manual order matching']")
	public WebElement in_Manual_Order_Matching;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Open')]")
	public WebElement click_On_Open_Button;
	@FindBy(how=How.XPATH,using="//button[@class='pt-btn pt-dropdown-toggle use-dropdown']")
	public WebElement select_More_Options;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Retrieve purchase order data')]")
	public WebElement click_On_Retrieve_PO_DropDown;
	
	@FindBy(how=How.XPATH,using="//bw-matching-organization-filter[@pickername='retrieve-po-organization']//button[@title='Expand']")
	public WebElement company;
	@FindBy(how=How.XPATH,using="//input[@name='search']")
	public WebElement enter_Company_Name;
	
	@FindBy(how=How.XPATH,using="//button[@class='pt-select-toggle-btn']")
	public WebElement supplier;
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Search for supplier information']")
	public WebElement enter_Supplier;
	
	@FindBy(how=How.XPATH,using="//span[@class='pt-custom-checkbox']")
	public WebElement checkbox_Supplier;

	@FindBy(how=How.XPATH,using="//button[normalize-space()='Select']")
	public WebElement select_Supplier;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='field-col field-col-left po-number']//input[@type='text']")
    public WebElement PurchaseOrder;
	@FindBy(how=How.XPATH,using="//button[normalize-space()='OK']")
	public WebElement Ok;
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Create invoice']")
	public WebElement create_Invoice;
	
	@FindBy(how=How.XPATH,using="//button[@title='Collapse']")
	public WebElement organization_Button;
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-tns-c116-117 pt-tree-item-content-data actual-BW70_ID']")
	public WebElement select_Organization;
	
	@FindBy(how=How.XPATH,using="//div[@class='ng-tns-c116-117 pt-tree-item-content-data actual-BW70_ID']")
	public WebElement invoice_Type_Ok_Button;
	
	
	
	
	
}
