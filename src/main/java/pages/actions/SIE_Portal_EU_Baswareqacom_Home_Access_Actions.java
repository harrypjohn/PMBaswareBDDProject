package pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.locators.SIE_Portal_EU_Baswareqacom_Home_Access_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class SIE_Portal_EU_Baswareqacom_Home_Access_Actions {
SIE_Portal_EU_Baswareqacom_Home_Access_Locators objSIE_Portal_EU_Baswareqacom_Home_Access_Locators=new SIE_Portal_EU_Baswareqacom_Home_Access_Locators();
WebDriver driver=SeleniumDriver.getDriver();

public SIE_Portal_EU_Baswareqacom_Home_Access_Actions()
{
	PageFactory.initElements(driver, objSIE_Portal_EU_Baswareqacom_Home_Access_Locators);
}
public void login() throws InterruptedException
{
	CommonMethods.sendKeys(objSIE_Portal_EU_Baswareqacom_Home_Access_Locators.Username, "arunSupplier_ville@yopmail.com");
    CommonMethods.clickelement(objSIE_Portal_EU_Baswareqacom_Home_Access_Locators.next_Button);
    CommonMethods.sendKeys(objSIE_Portal_EU_Baswareqacom_Home_Access_Locators.password, "Basware@1234567");
    CommonMethods.clickelement(objSIE_Portal_EU_Baswareqacom_Home_Access_Locators.submit_Button);
}
}
