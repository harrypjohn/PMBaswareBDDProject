package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Admin_List_cfm_Locators {
	
	@FindBy(how=How.XPATH,using="//input[@id='quick-filter-fieldfilter']")
	public WebElement enter_PO_Number;
	
	@FindBy(how=How.XPATH,using="//button[@id='quick-filter-refresh']//i[@class='fa fa-search']")
	public  WebElement search_Icon;
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div[3]/div[1]/div[4]/div[2]/div[1]/div[3]/div[3]/div/table/tbody/tr[2]/td[11]")
	public  WebElement po_Total;
	@FindBy(how=How.XPATH,using="//input[@id='cb_grid-table']")
	public  WebElement click_Checkbox;
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='More Actions']")
	public  WebElement click_More_Actions;
	
	@FindBy(how=How.XPATH,using="//a[@id='btn-receivePO']")
	public  WebElement receive_PO;
	
	@FindBy(how=How.XPATH,using="//input[@name='Reference']")
	public  WebElement receiving_Reference_Number;
	
	@FindBy(how=How.XPATH,using="//input[@name='BGSubmit']")
	public  WebElement process_Items;
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[5]/div[3]/div/div[1]/div/div[2]/form/table/tbody/tr/td/div[1]/div[2]/table/tbody/tr[2]/td[8]/div/nobr/input")
	public  WebElement Received_Quantity;
	
	
	
	
	
	
}
