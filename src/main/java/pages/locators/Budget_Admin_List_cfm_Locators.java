package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Budget_Admin_List_cfm_Locators {
@FindBy(how=How.XPATH,using="//input[@id='Filter']")
public WebElement Keyword_Budget_Search;


@FindBy(how=How.XPATH,using="//input[@name='FilterSubmit']")
public WebElement submit_Button;
}
