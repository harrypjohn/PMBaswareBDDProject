package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_cfm_Locators {
@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
public WebElement username;
@FindBy(how=How.XPATH, using="//input[@placeholder='Password']")
public WebElement Password;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/button[1]")
public WebElement LoginButton;







}
