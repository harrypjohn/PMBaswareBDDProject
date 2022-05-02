package Steps;

import io.cucumber.java.en.Then;
import pages.actions.SIE_Portal_EU_Baswareqacom_Home_Access_Actions;

public class E2E_180_PO_send_to_Network_via_REST_API {
SIE_Portal_EU_Baswareqacom_Home_Access_Actions objSIE_Portal_EU_Baswareqacom_Home_Access_Actions=new SIE_Portal_EU_Baswareqacom_Home_Access_Actions();

@Then("SIE Login with T3043admin and {int}$hockedMonk3y")
public void sie_login_with_t3043admin_and_$hocked_monk3y(Integer int1) throws InterruptedException {
    objSIE_Portal_EU_Baswareqacom_Home_Access_Actions.login();
}

}
