package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PopUp_Win_Display_cfm_Locators {
@FindBy(how=How.XPATH,using="//a[normalize-space()='All']")
public WebElement click_All;
@FindBy(how=How.NAME,using="recordid")
public WebElement make_Selection_ShipToLocation;

@FindBy(how=How.XPATH,using="//input[@name='btnSelect']")
public WebElement click_Select_Button;


}
