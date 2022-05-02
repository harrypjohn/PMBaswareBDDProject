package Steps;

import java.awt.AWTException;
import java.io.IOException;

import io.cucumber.java.en.When;
import pages.actions.ScanMarket_Login_Page_Actions;

public class E2E_89_PM_Scanmarket_Integration {
ScanMarket_Login_Page_Actions objScanMarket_Login_Page_Actions=new ScanMarket_Login_Page_Actions();

@When("^ScanMarket Login with (.*) and (.*)$")
public void scanmarketlogin(String username, String password) throws InterruptedException {
    System.out.println(username);
    System.out.println(password);
	objScanMarket_Login_Page_Actions.UsernamePasswordEntryScanMarket(username, password);
	objScanMarket_Login_Page_Actions.UsernamePasswordEntryScanMarket(username, password);

}
}
