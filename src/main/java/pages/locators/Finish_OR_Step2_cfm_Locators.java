package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Finish_OR_Step2_cfm_Locators {
	@FindBy(how=How.XPATH,using="//ol[contains(text(),'1.')]/a[@class='FBPONumber']")
	public  WebElement purchase_Order_Number;
	
}
