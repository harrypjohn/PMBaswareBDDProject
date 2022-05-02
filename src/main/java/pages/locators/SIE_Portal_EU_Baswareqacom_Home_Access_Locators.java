package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SIE_Portal_EU_Baswareqacom_Home_Access_Locators {

	@FindBy(how=How.XPATH,using="//input[@id='userName']")
	public WebElement Username;
	
	@FindBy(how=How.XPATH,using="//button[@id='sendRequest']")
	public WebElement next_Button;
	
	@FindBy(how=How.XPATH,using="//input[@id='password']")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@id='submitButton']")
	public WebElement submit_Button;
	
}
