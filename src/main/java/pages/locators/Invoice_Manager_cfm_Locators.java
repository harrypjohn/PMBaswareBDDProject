package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Invoice_Manager_cfm_Locators {
	public String cssSelectorForHost="alusta-navigation";
	public String cssSelectorElement="a[title='Accounts Payable']";
	
	@FindBy(how=How.ID,using="linkpitmenu_section_100")
	public WebElement Invoicing;
	
	@FindBy(how=How.XPATH,using="//a[@id='linkpitmenu_item_46568']")
	public WebElement ap_Automation_Approval;
	
	
	
	
	

}
