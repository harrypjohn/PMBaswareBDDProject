package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dashboard_cfm_Locators {

	@FindBy(how=How.XPATH,using="//a[@id='linkpitmenu_section_15']")
	public WebElement Requisition;
	@FindBy(how=How.XPATH,using="//a[@id='linkpitmenu_item_100']")
	public WebElement searchcatalog;
	@FindBy(how=How.XPATH,using="//a[@id='simple-search-submit']")
	public WebElement smallsearchbutton;
	@FindBy(how=How.XPATH, using="//a[@id='linkpitmenu_item_125']")
	public WebElement requistions_Off_Catalog_Request;
	@FindBy(how=How.XPATH,using="//li[@id='pitmenu_item_110']")
	public WebElement requisitions_Shopping_Cart_Button;
	@FindBy(how=How.XPATH,using="//a[@id='linkpitmenu_section_20']")
	public WebElement purchase_Orders;
	
	@FindBy(how=How.XPATH,using="//a[@id='linkpitmenu_item_220']")
	public WebElement manage_Track_Purchase_Orders;
	@FindBy(how=How.XPATH,using="//div[@class='north']//div[@id='menuBar']//a[1][1]//b[1]")
	public WebElement adminDropDown;
	
	@FindBy(how=How.XPATH,using="//li[contains(@class,'li-menu-item open')]//a[@id='profile-logout']")
	public WebElement logout;
	
	
	
	


}
