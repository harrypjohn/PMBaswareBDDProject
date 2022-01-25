package Steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.Dashboard_cfm_Actions;
import pages.actions.Finish_OR_cfm_Actions;
import pages.actions.Free_Form_OR_cfm_Actions;
import pages.actions.Login_cfm_Actions;
import pages.actions.ORs_Review_cfm_Actions;
import pages.locators.Finish_OR_cfm_Locators;
import pages.locators.Free_Form_OR_cfm_Locators;
import utils.SeleniumDriver;

public class PM_6473_Generate_BPO_GlueFile {
	Dashboard_cfm_Actions objDashboard_cfm_Actions=new Dashboard_cfm_Actions();
	Free_Form_OR_cfm_Actions objFree_Form_OR_cfm_Actions=new Free_Form_OR_cfm_Actions();
	Free_Form_OR_cfm_Locators objFree_Form_OR_cfm_Locators=new Free_Form_OR_cfm_Locators();
	ORs_Review_cfm_Actions objORs_Review_cfm_Actions=new ORs_Review_cfm_Actions();
	Finish_OR_cfm_Actions objFinish_OR_cfm_Actions=new Finish_OR_cfm_Actions();
	Finish_OR_cfm_Locators objFinish_OR_cfm_Locators=new Finish_OR_cfm_Locators();
	
	WebDriver driver=SeleniumDriver.getDriver();

	/*@Given("Launch browser for PM_{int}")
	public void launch_browser_for_pm(Integer int1) {
		SeleniumDriver.openPage("https://pm.baswareqa.com/qapd/cfms/security/login.cfm");
	}*/
	

	@Then("Select (.*) menu option1")
	public void select_requisitions_off_catalog_request_menu_option() throws InterruptedException {
		driver.navigate().refresh();
		objDashboard_cfm_Actions.click_On_Requisitions();
		//objDashboard_cfm_Actions.click_On_Requistions_Off_Catalog_Request();
		driver.navigate().to("https://pm.baswareqa.com/qapd/cfms/Ors/FreeFormOR.cfm");
		Thread.sleep(5000);
	}

	@And("^Configure Off Catalog Request with name (.*) desc (.*) cat (.*) Qty (.*) UnitPrice (.*)$")
	public void configure_off_catalog_request_with_name_st_apn_apple_desc_apple_mobile_cat_mobile(String str1, String str2, String str3,String str4, String str5) throws InterruptedException {
        
		objFree_Form_OR_cfm_Actions.click_On_Vendor_Selection_Search_Icon(str1);
		objFree_Form_OR_cfm_Actions.enter_Details_Of_FreeForm_Item(str2, str3, str4, str5);
	}

	@And("Validate that Order request is created successfully")
	public void and_validate_that_order_request_is_created_successfully() throws InterruptedException {
     
    objORs_Review_cfm_Actions.click_Special_Functions_DropDown();
    objFinish_OR_cfm_Actions.enter_Blanket_PO_Information_Free_Form_Invoicing("22/01/2025");
   // CommonMethods.returnSubStringOfBPORequest(objFinish_OR_cfm_Locators.return_Successfully_Processed_Request);
    System.out.println("ye second hai");
 
	}

}
