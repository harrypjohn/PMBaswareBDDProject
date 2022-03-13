package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BWRTesting_Invoicing_Locators {
	public String cssSelectorForHost="#alusta-navigation";
	public String cssSelectorElement="a[title='Invoicing']";
	
	@FindBy(how=How.XPATH,using="//button[@title='Add']")
	public WebElement add_Image;
	
	@FindBy(how=How.XPATH,using="//button[@title='Edit']")
	public WebElement edit_Header;
	
	
	@FindBy(how=How.XPATH,using="//div[@allow-clear='true']//span[@aria-label='Select box activate']")
	public WebElement select_Supplier_Code;
	
	@FindBy(how=How.XPATH,using="//div[@id='ui-select-choices-row-2-0']//span[@class='ui-select-choices-row-inner']")
	public WebElement type_Supplier_Code1;
	
	@FindBy(how=How.XPATH,using="//div[@id='ui-select-choices-row-2-58']//span[@class='ui-select-choices-row-inner']")
	public WebElement type_Supplier_Code;
	
	@FindBy(how=How.XPATH,using="//span[@class='badge glow ng-binding ng-scope value-1']")
	public WebElement count_Of_Image;
	
	public String xpath_Of_Count_Image="//span[@class='badge glow ng-binding ng-scope value-0']";
	
	
	@FindBy(how=How.XPATH,using="//input[@aria-label='Invoice number']")
	public WebElement invoice_Number;
	
	@FindBy(how=How.XPATH,using="//input[@aria-label='Invoice date']")
	public WebElement invoice_Date;
	
	@FindBy(how=How.XPATH,using="//input[@aria-label='Base date']")
	public WebElement base_Date;
	
	@FindBy(how=How.XPATH,using="//input[@aria-label='Purchase order numbers']")
	public WebElement purchase_Order_Number;
	
	@FindBy(how=How.XPATH,using="//input[@aria-label='Gross total']")
	public WebElement gross_Total;
	
	
	@FindBy(how=How.XPATH,using="//div[@class='margin-bottom-md pull-right ng-scope']//button[@title='Save'][normalize-space()='Save']")
	public WebElement save_Button;
	
	@FindBy(how=How.XPATH,using="//div[@class='panel panel-rounded pal-title-bar clearfix col-width-xxl']//span[@class='ng-binding ng-scope'][normalize-space()='Send to validation']")
	public WebElement send_To_Validation_Button;
	
	@FindBy(how=How.XPATH,using="//div[@aria-label='Organization']//span[@aria-label='Select box activate']")
	public WebElement organization;
	
	@FindBy(how=How.XPATH,using="//div[contains(text(),'BW70 Basware Inc.')]")
	public WebElement type_Organization;
	
	@FindBy(how=How.XPATH,using="//button[@title='OK']")
	public WebElement ok;

	//span[normalize-space()='OK']
	public String xpath_Of_Count_Zero_Image="//span[@class='badge glow ng-binding ng-scope value-0']";
	
	public String header_Data="//span[contains(text(),'Header data')]";
	
	@FindBy(how=How.XPATH,using="//*[@id='createinvoicepage']/div/pal-title-bar[1]/div/div/div[2]/div/div[2]/pal-title-bar-actions/pal-actions/div/div/div/div[1]/button")
	public WebElement more_Actions;
	
	@FindBy(how=How.XPATH,using="//button[@title='Delete']")
	public WebElement delete_Button;
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Yes']")
	public WebElement delete_OK;
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Supplier Name, Invoice Number']")
	public WebElement enter_Invoice_Number;
	
	

	@FindBy(how=How.XPATH,using="//button[normalize-space()='Search']")
	public WebElement click_Search_Button;
	
	
	
	
	
	
	
	
	//div[@class='panel panel-rounded pal-title-bar clearfix col-width-xxl']//span[@class='ng-binding ng-scope'][normalize-space()='Send to validation']
	//div[@class='panel panel-rounded pal-title-bar clearfix col-width-xxl']//span[@class='ng-binding ng-scope'][normalize-space()='Send to validation']
	//div[@class='panel panel-rounded pal-title-bar clearfix col-width-xxl']//button[@title='Send to validation']
		}
