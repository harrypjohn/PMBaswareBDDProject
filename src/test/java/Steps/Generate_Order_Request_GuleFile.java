package Steps;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.BWRTesting_Accounts_Payable_Actions;
import pages.actions.BWRTesting_In_Manual_Order_Matching_Actions;
import pages.actions.BWRTesting_Invoicing_Actions;
import pages.actions.CatSearchResults_cfm_Actions;
import pages.actions.Dashboard_cfm_Actions;
import pages.actions.Finish_OR_Step2_cfm_Actions;
import pages.actions.Invoice_Manager_cfm_Actions;
import pages.actions.Login_cfm_Actions;
import pages.actions.ORs_Review_cfm_Actions;
import pages.actions.PO_Admin_List_cfm_Actions;
import pages.locators.BWRTesting_Invoicing_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class Generate_Order_Request_GuleFile {
	Login_cfm_Actions objlogin_cfm_Actions = new Login_cfm_Actions();
	Dashboard_cfm_Actions objDashboard_cfm_Actions = new Dashboard_cfm_Actions();
	CatSearchResults_cfm_Actions objCatSearchResults_cfm_Actions = new CatSearchResults_cfm_Actions();
	ORs_Review_cfm_Actions objORs_Review_cfm_Actions = new ORs_Review_cfm_Actions();
	Invoice_Manager_cfm_Actions objInvoice_Manager_cfm_Actions = new Invoice_Manager_cfm_Actions();
	BWRTesting_Accounts_Payable_Actions objBwreleasetesting1_p2p_Edge_home_Actions = new BWRTesting_Accounts_Payable_Actions();
	BWRTesting_In_Manual_Order_Matching_Actions objBWRTesting_In_Manual_Order_Matching_Actions = new BWRTesting_In_Manual_Order_Matching_Actions();
	BWRTesting_Invoicing_Actions objBWRTesting_Invoicing_Actions = new BWRTesting_Invoicing_Actions();
	BWRTesting_Invoicing_Locators objBWRTesting_Invoicing_Locators = new BWRTesting_Invoicing_Locators();
	PO_Admin_List_cfm_Actions objPO_Admin_List_cfm_Actions = new PO_Admin_List_cfm_Actions();
	Finish_OR_Step2_cfm_Actions objFinish_OR_Step2_cfm_Actions = new Finish_OR_Step2_cfm_Actions();
	WebDriver driver = SeleniumDriver.getDriver();
	public String invoice_Total;
	public static String purchase_Order_Number;
	public static String purchase_Order_Number1;

	@Given("Launch browser for {string}")
	public void launch_browser_for(String Url) throws AWTException {
		SeleniumDriver.openPage(Url);
	}

	@When("^Login with (.*) and (.*)$")
	public void login_with_and(String username, String password)
			throws InterruptedException, AWTException, IOException {
		objlogin_cfm_Actions.UsernamePasswordEntry(username, password);
		
	}

	@Then("Click on SearchCatalog button")
	public void click_on_search_catalog_button() throws InterruptedException {

		driver.navigate().refresh();
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
		purchase_Order_Number = objFinish_OR_Step2_cfm_Actions.return_Purchase_Order();
		System.out.println("This is the first purchase order created" + purchase_Order_Number);

	}

	@Then("Get Purchase Order Total")
	public void get_purchase_order_total() throws InterruptedException {
		objDashboard_cfm_Actions.click_Purchase_Orders();
		objPO_Admin_List_cfm_Actions.enter_Purchase_Order_Number(purchase_Order_Number);

		Thread.sleep(5000);
		objPO_Admin_List_cfm_Actions.click_Search_Icon();
		invoice_Total = objPO_Admin_List_cfm_Actions.get_PO_Total();
		System.out.println("This is purchase order : " + purchase_Order_Number);
		System.out.println("This is invoice total : " + invoice_Total);

	}

	@Then("Click on AP Automation Approval")
	public void click_on_ap_automation_approval() throws InterruptedException {
		objInvoice_Manager_cfm_Actions.click_On_Invoicing();
		objInvoice_Manager_cfm_Actions.click_On_APAutomation_Approval();
		objBwreleasetesting1_p2p_Edge_home_Actions.click_On_Accounts_Payable();
		Thread.sleep(5000);

	}

	@Then("Click on Retrieve Purchase Order Data")
	public void click_on_retrieve_purchase_order_data() throws InterruptedException, AWTException {
		objBWRTesting_In_Manual_Order_Matching_Actions.click_On_In_Manual_Order_Matching();
		objBWRTesting_In_Manual_Order_Matching_Actions.click_Open_Open_Button();
		objBWRTesting_In_Manual_Order_Matching_Actions.click_On_More_Options();
		objBWRTesting_In_Manual_Order_Matching_Actions.select_Retrieve_PurChase_OrderOption();
		objBWRTesting_In_Manual_Order_Matching_Actions.retrieve_Purchase_Order(purchase_Order_Number);
		driver.navigate().refresh();

	}

	@Then("Create Invoice")
	public void create_invoice() throws InterruptedException, IOException, AWTException {

		objBWRTesting_Invoicing_Actions.click_On_Invoicing();
		if (CommonMethods.element_Present(objBWRTesting_Invoicing_Locators.header_Data)) {
			objBWRTesting_Invoicing_Actions.more_Actions();
			Thread.sleep(2000);
			objBWRTesting_Invoicing_Actions.select_Organization_and_Invoice_Type();
		} else {
			objBWRTesting_Invoicing_Actions.select_Organization_and_Invoice_Type();
		}

		if (CommonMethods.element_Present(objBWRTesting_Invoicing_Locators.xpath_Of_Count_Image)) {
			objBWRTesting_Invoicing_Actions.click_On_Image_Button();
			Thread.sleep(2000);
			Runtime.getRuntime().exec("D:\\Harbans\\Softwares\\AutoIT\\FileUpload.exe");
			Thread.sleep(5000);
			System.out.println("Auto IT run");

		} else {
			System.out.println("Auto IT did not run");
		}
		objBWRTesting_Invoicing_Actions.click_Header_Data();
		objBWRTesting_Invoicing_Actions.select_Supplier();
		objBWRTesting_Invoicing_Actions.enter_Other_Data(purchase_Order_Number, invoice_Total);
		objBwreleasetesting1_p2p_Edge_home_Actions.click_On_Accounts_Payable();
		objBWRTesting_Invoicing_Actions.search_Invoice(purchase_Order_Number);

	}

	public String purchaseoder() {
		System.out.println("This method called to get Purchase Order: " + purchase_Order_Number);
		return purchase_Order_Number;
	}

	@Then("Search and Verify processed invoice")
	public void search_and_verify_processed_invoice() throws InterruptedException {

		objBWRTesting_Invoicing_Actions.search_Invoice(purchase_Order_Number);
		if (objBWRTesting_Invoicing_Actions.check_Processed_Status().equalsIgnoreCase("Processed")) {
			System.out.println("Alusta Invoice is showing Processed Status");
		} else {
			System.out.println("Alusta Invoice is showing " + objBWRTesting_Invoicing_Actions.check_Processed_Status()
					+ " Status");
		}

		objBWRTesting_Invoicing_Actions.click_On_Invoicing();
		objBWRTesting_Invoicing_Actions.click_On_Purchase_Manager();
		objDashboard_cfm_Actions.click_Purchase_Orders();
		objPO_Admin_List_cfm_Actions.enter_Purchase_Order_Number(purchase_Order_Number);

		Thread.sleep(5000);
		objPO_Admin_List_cfm_Actions.click_Search_Icon();

		if (objPO_Admin_List_cfm_Actions.get_PO_Status().equalsIgnoreCase("fully received, reconciled")) {
			System.out.println("PM Purchase Order is showing fully received, reconciled Status");
		} else {
			System.out.println("PM Purchase Order Invoice is showing "
					+ objPO_Admin_List_cfm_Actions.get_PO_Status() + " Status");
		}
	}

	@Then("Close the testcase")
	public void close_the_testcase() throws InterruptedException {

		objDashboard_cfm_Actions.logout();
	}
}
