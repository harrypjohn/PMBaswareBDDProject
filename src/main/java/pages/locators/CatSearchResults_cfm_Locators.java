package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CatSearchResults_cfm_Locators {
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Add to cart']")
	public WebElement AddtoCart;
	@FindBy(how=How.XPATH,using="//input[@id='escatalogsearch']")
	public WebElement search_Item_By_Name;
	@FindBy(how=How.XPATH,using="//a[@id='escatalogsearchicon']//span[@class='glyphicon glyphicon-search']")
	public WebElement search_Icon;
	
	
}  


/*//div[@class='container main col-sm-12 col-md-12 col-lg-12 search-results-v3']//div[1]//div[2]//div[3]//div[2]//div[1]//div[1]//button[1]*/