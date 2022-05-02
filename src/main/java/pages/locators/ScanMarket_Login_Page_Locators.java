package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ScanMarket_Login_Page_Locators {
@FindBy(how=How.XPATH,using="//input[@id='username']")
public WebElement username;

@FindBy(how=How.XPATH, using="//input[@id='password']")
public WebElement password;

@FindBy(how=How.XPATH,using="//form[@id='loginForm']//button[@type='submit']")
public WebElement login_Button;
}
