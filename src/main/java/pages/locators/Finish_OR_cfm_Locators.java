package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Finish_OR_cfm_Locators {
	@FindBy(how=How.XPATH,using="//input[@id='PODateDeActivate']")
	public WebElement deactivation_Date;
	
	@FindBy(how=How.XPATH,using="//input[@id='flagAddFreeFormInvoice1']")
	public WebElement free_Form_Invoicing_Radio_Button;

	
	@FindBy(how=How.XPATH,using="//input[@name='Save']")
	public WebElement create_Blanket_PO_Request_Button;
	
	@FindBy(how=How.XPATH,using="//h4[contains(text(),'Successfully processed request')]")
	public WebElement return_Successfully_Processed_Request;


	
	
	
}
