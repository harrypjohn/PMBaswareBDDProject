package Steps;

import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.actions.CatSearchResults_cfm_Actions;
import pages.actions.Finish_OR_cfm_Actions;
import utils.SeleniumDriver;

public class PM_6474_AutoReceiving_Generate_Purchase_Order_GlueFile {
	CatSearchResults_cfm_Actions objCatSearchResults_cfm_Actions=new CatSearchResults_cfm_Actions();
	Finish_OR_cfm_Actions objFinish_OR_cfm_Actions=new Finish_OR_cfm_Actions();
	WebDriver driver=SeleniumDriver.getDriver();
	@Then("Click on Add to Cart button with Item")
	public void click_on_add_to_cart_button_with_item(List<String> list) throws InterruptedException {
		
		objCatSearchResults_cfm_Actions.enterItemNameForSearch(list.get(1));
		objCatSearchResults_cfm_Actions.clickOnAddToCart();
		Thread.sleep(2000);
		driver.navigate().refresh();
		objCatSearchResults_cfm_Actions.enterItemNameForSearch(list.get(2));
		objCatSearchResults_cfm_Actions.clickOnAddToCart();
		Thread.sleep(2000);
		driver.navigate().refresh();
		objCatSearchResults_cfm_Actions.enterItemNameForSearch(list.get(3));
		objCatSearchResults_cfm_Actions.clickOnAddToCart();
		Thread.sleep(2000);
	   
	}
	

}
