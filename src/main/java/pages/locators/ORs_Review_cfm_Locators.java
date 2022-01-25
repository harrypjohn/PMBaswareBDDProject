package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ORs_Review_cfm_Locators {
@FindBy(how=How.XPATH,using="//ul[@class='user nav navbar-nav navbar-right uncollapse-user-nav']//li[@id='cartItem']//a")
public WebElement shoppingCartIcon;
@FindBy (how=How.XPATH, using="//div[@class='col-sm-10 col-md-10']/div/select")
public WebElement accountCodeDropDown;
@FindBy(how=How.XPATH,using="//input[@name='Finish']")
public WebElement finish_Request_Button;
@FindBy(how=How.XPATH,using="//input[@id='UsrItem3']")
public WebElement note3;
@FindBy(how=How.XPATH,using="//input[@name='Save']")
public WebElement create_Order_Request_Button;
@FindBy(how=How.XPATH,using="//h4[1]")
public WebElement Successfully_created_order_request;


@FindBy(how=How.XPATH,using="//button[@id='btnSFDropDown']")
public WebElement special_Functions;

@FindBy(how=How.XPATH,using="//a[@id='cartBlanketPO']")
public WebElement create_Blank_PO_Request_Button;


}
