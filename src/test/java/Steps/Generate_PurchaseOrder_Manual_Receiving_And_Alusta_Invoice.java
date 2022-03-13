package Steps;

import io.cucumber.java.en.Then;
import pages.actions.Finish_OR_Step2_cfm_Actions;
import pages.actions.PO_Admin_List_cfm_Actions;

public class Generate_PurchaseOrder_Manual_Receiving_And_Alusta_Invoice {
	
	PO_Admin_List_cfm_Actions objPO_Admin_List_cfm_Actions=new PO_Admin_List_cfm_Actions();
	Finish_OR_Step2_cfm_Actions objFinish_OR_Step2_cfm_Actions=new Finish_OR_Step2_cfm_Actions();
	
	
	@Then("Receive Purchase Order")
	public void receive_purchase_order() throws InterruptedException {
		
		String ponumber=new Generate_Order_Request_GuleFile().purchaseoder();
		System.out.println("LLLLLLLLLLLLLLL"+ponumber);
		objPO_Admin_List_cfm_Actions.receiving_Purchase_Order(ponumber);
	}
}
