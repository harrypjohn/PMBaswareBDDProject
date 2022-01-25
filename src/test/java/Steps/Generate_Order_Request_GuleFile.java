package Steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CatSearchResults_cfm_Actions;
import pages.actions.Dashboard_cfm_Actions;
import pages.actions.Login_cfm_Actions;
import pages.actions.ORs_Review_cfm_Actions;
import utils.SeleniumDriver;

public class Generate_Order_Request_GuleFile {
	Login_cfm_Actions objlogin_cfm_Actions=new Login_cfm_Actions();
	Dashboard_cfm_Actions objDashboard_cfm_Actions=new Dashboard_cfm_Actions();
	CatSearchResults_cfm_Actions objCatSearchResults_cfm_Actions=new CatSearchResults_cfm_Actions();
	ORs_Review_cfm_Actions objORs_Review_cfm_Actions=new ORs_Review_cfm_Actions();
	WebDriver driver=SeleniumDriver.getDriver();

	@Given("Launch browser for {string}")
	public void launch_browser_for(String Url) throws AWTException 
	{
		SeleniumDriver.openPage(Url);
	}

	@When("^Login with (.*) and (.*)$")
	public void login_with_and(String username, String password) throws InterruptedException, AWTException {
		objlogin_cfm_Actions.UsernamePasswordEntry(username, password);
	/*	Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);*/
		Thread.sleep(5000);
		driver.navigate().refresh();
		 
		
		
	}

	@Then("Click on SearchCatalog button")
	public void click_on_search_catalog_button() throws InterruptedException {
		
		
		objDashboard_cfm_Actions.clickOnSearchCatalog();
	}

	@Then("Click on SearchIcon")
	public void click_on_search_icon_button() throws InterruptedException {	
		objDashboard_cfm_Actions.clickOnSearchIcon();

	}
	@Then("Click on Add to Cart button")
	public void click_on_add_to_cart_button() throws InterruptedException {

        objCatSearchResults_cfm_Actions.enterItemNameForSearch();
        
		objCatSearchResults_cfm_Actions.clickOnAddToCart();
		Thread.sleep(2000);
	}
	@Then("Click on Shopping Cart button")
	public void click_on_shopping_cart_button() throws InterruptedException {
		objORs_Review_cfm_Actions.clickOnShoppingCartIcon(); 

	}
	@Then("Click on Finish Request button")
	public void click_on_finish_request_button() throws InterruptedException {
	    objORs_Review_cfm_Actions.click_On_Finish_Request_Button();
	    
	}
	@Then("Close the testcase")
	public void close_the_testcase() throws InterruptedException {
		
	    objDashboard_cfm_Actions.logout();   
	}
}
