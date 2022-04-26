package Steps;

import io.cucumber.java.en.Then;
import pages.actions.Dashboard_cfm_Actions;
import pages.actions.Finish_OR_Step2_cfm_Actions;
import pages.actions.ORs_Review_cfm_Actions;
import pages.actions.PO_Admin_List_cfm_Actions;

public class E2E_242_Multiple_POs_at_one_invoice {
	Dashboard_cfm_Actions objDashboard_cfm_Actions = new Dashboard_cfm_Actions();
	PO_Admin_List_cfm_Actions objPO_Admin_List_cfm_Actions = new PO_Admin_List_cfm_Actions();
	ORs_Review_cfm_Actions objORs_Review_cfm_Actions = new ORs_Review_cfm_Actions();
	Finish_OR_Step2_cfm_Actions objFinish_OR_Step2_cfm_Actions = new Finish_OR_Step2_cfm_Actions();

	public String invoice_Total1;

	public static String purchase_Order_Number1;
	@Then("Click on Finish Request button for second Purchase Order")
	public void click_on_finish_request_button_for_second_purchase_order() throws InterruptedException {
		objORs_Review_cfm_Actions.click_On_Finish_Request_Button();
		purchase_Order_Number1 = objFinish_OR_Step2_cfm_Actions.return_Purchase_Order();
		System.out.println("This is the Second purchase order created : " + purchase_Order_Number1);	
	}

	@Then("Get Purchase Order Total for second Purchase Order")
	public void get_purchase_order_total_for_second_purchase_order() throws InterruptedException {
		objDashboard_cfm_Actions.click_Purchase_Orders();
		objPO_Admin_List_cfm_Actions.enter_Purchase_Order_Number(purchase_Order_Number1);
		Thread.sleep(5000);
		objPO_Admin_List_cfm_Actions.click_Search_Icon();
		invoice_Total1 = objPO_Admin_List_cfm_Actions.get_PO_Total();
		System.out.println("This is second purchase order : " + purchase_Order_Number1);
		System.out.println("This is second invoice total : " + invoice_Total1);   
	}
	@Then("Receive Purchase Order for second Purchase Order")
	public void receive_purchase_order_for_second_purchase_order() throws InterruptedException {

		
		System.out.println("This is Receive Purchase Order method to check Purchase Order"+purchase_Order_Number1);
		objPO_Admin_List_cfm_Actions.receiving_Purchase_Order(purchase_Order_Number1);
	}
}
