package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import pages.locators.Finish_OR_Step2_cfm_Locators;
import utils.SeleniumDriver;

public class Finish_OR_Step2_cfm_Actions {
Finish_OR_Step2_cfm_Locators objFinish_OR_Step2_cfm_Locators;
WebDriver driver=SeleniumDriver.getDriver();
public Finish_OR_Step2_cfm_Actions()
{
	this.objFinish_OR_Step2_cfm_Locators=new Finish_OR_Step2_cfm_Locators();
	PageFactory.initElements(driver, objFinish_OR_Step2_cfm_Locators);
}

public String return_Purchase_Order()
{
	String purchaseOrder=objFinish_OR_Step2_cfm_Locators.purchase_Order_Number.getText();
	return purchaseOrder;
}
}
