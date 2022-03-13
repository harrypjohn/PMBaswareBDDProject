package pages.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.BWRTesting_Invoicing_Locators;
import utils.CommonMethods;
import utils.SeleniumDriver;

public class BWRTesting_Invoicing_Actions {
	BWRTesting_Invoicing_Locators objBWRTesting_Invoicing_Locators;
	WebDriver driver=SeleniumDriver.getDriver();
	Finish_OR_Step2_cfm_Actions objFinish_OR_Step2_cfm_Actions=new Finish_OR_Step2_cfm_Actions();
	PO_Admin_List_cfm_Actions objPO_Admin_List_cfm_Actions=new PO_Admin_List_cfm_Actions();
	public BWRTesting_Invoicing_Actions() {
		
		this.objBWRTesting_Invoicing_Locators=new BWRTesting_Invoicing_Locators();
		PageFactory.initElements(driver, objBWRTesting_Invoicing_Locators);
		
	}
	public void select_Organization_and_Invoice_Type() throws AWTException, InterruptedException
	{
		objBWRTesting_Invoicing_Locators.organization.click();
		
		
		Robot robot = new Robot();
		for(int i=0; i<=200;i++)
		{
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		if(i==5||i==10||i==15||i==20||i==30)
		{
			Thread.sleep(2000);
		}
		}
		
		
		driver.findElement(By.xpath("//div[contains(text(),'BW70 Basware Inc.')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='OK']")).click();
		}
	public void click_On_Invoicing() throws InterruptedException
	{
		
		
		//This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "#alusta-navigation";
		Thread.sleep(1000);
		WebElement shadowDomHostElement = driver.findElement(By.cssSelector("#alusta-navigation"));
		SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);
		Thread.sleep(1000);
		last.findElement(By.cssSelector("a[aria-label='Invoicing']")).click();	Thread.sleep(5000);
	}
	public void click_On_Image_Button() throws InterruptedException
	{
	 objBWRTesting_Invoicing_Locators.add_Image.click();
	 Thread.sleep(4000);
	}
	public void select_Invoice_Image() throws IOException, AWTException
	{
	    Runtime.getRuntime().exec("C:\\Users\\harbanslal\\workspace\\BaswareBDD\\AutoIT.exe");	
	}
	
	public void click_Header_Data() throws AWTException, InterruptedException
	{		
		objBWRTesting_Invoicing_Locators.edit_Header.click();
		Thread.sleep(4000);		
	}
	public void select_Supplier() throws InterruptedException, AWTException
	{
		driver.findElement(By.xpath("//a[@class='btn btn-xs btn-link pull-right']//i[@class='glyphicon glyphicon-remove']")).click();
		driver.findElement(By.xpath("//div[@allow-clear='true']//span[@aria-label='Select box activate']")).click();
		driver.findElement(By.xpath(" //*[contains(@id,'pal-dropdown-panel')]/div/div[1]/div[1]/pal-detail-fields/div/pal-detail-field[1]/div/div/div/div/bw-field/pal-field-container/div/div/div/pal-field-container-edit-slot/div/bw-supplier-picker/div/div[2]/div[1]/input[1]")).sendKeys("Hotel Glo");
		driver.findElement(By.xpath("//span[@class='ui-select-choices-row-inner']")).click();	
	}
		
		
		
		
	

	public void enter_Other_Data(String purchase_Order_Number, String invoice_Total) throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@aria-label='Invoice number']")).sendKeys(purchase_Order_Number);
		CommonMethods.sendKeys(objBWRTesting_Invoicing_Locators.invoice_Date, "12/12/2022");
		CommonMethods.sendKeys(objBWRTesting_Invoicing_Locators.base_Date, "12/12/2022");
		CommonMethods.sendKeys(objBWRTesting_Invoicing_Locators.purchase_Order_Number, purchase_Order_Number);
		CommonMethods.sendKeys(objBWRTesting_Invoicing_Locators.gross_Total, invoice_Total);
		CommonMethods.clickelement(objBWRTesting_Invoicing_Locators.save_Button);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='createinvoicepage']/div/pal-title-bar[1]/div/div/div[2]/div/div[2]/pal-title-bar-actions/pal-actions/div/div/div/div[1]/div/button/span")).click();

	}
	public void more_Actions()
	{
		objBWRTesting_Invoicing_Locators.more_Actions.click();
		objBWRTesting_Invoicing_Locators.delete_Button.click();
		objBWRTesting_Invoicing_Locators.delete_OK.click();
	}
	public void search_Invoice(String invoicenumber)
	{
		objBWRTesting_Invoicing_Locators.enter_Invoice_Number.sendKeys(invoicenumber);
		objBWRTesting_Invoicing_Locators.click_Search_Button.click();
	}
}

	
	
/*Robot robot = new Robot();
for(int i=0; i<=200;i++)
{
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
if(i==5||i==10||i==15||i==20||i==30||i==40||i==50||i==60)
{
	Thread.sleep(2000);
}
}
CommonMethods.highLightMethod(driver.findElement(By.xpath("//div[@allow-clear='true']//span[@aria-label='Select box activate']")));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@allow-clear='true']//span[@aria-label='Select box activate']")).click();
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='value ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid open']/input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']")));
	    CommonMethods.highLightMethod(driver.findElement(By.xpath("//div[@class='value ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid open']/input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']")));
	  
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='value ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid open']/input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']")).sendKeys("Hotel Glo");
		
		Thread.sleep(5000);
*
*/


/*driver.findElement(By.xpath("//div[@allow-clear='true']//span[@aria-label='Select box activate']")).click();
Robot robot = new Robot();
int j=0;
for(int i=0; i<=5;i++)
{
robot.keyPress(KeyEvent.VK_DOWN);
robot.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']")).sendKeys("Hotel Glo");
CommonMethods.clickelement(driver.findElement(By.xpath("//div[@id='ui-select-choices-row-2-58']//span[@class='ui-select-choices-row-inner']")));
}
Thread.sleep(5000);*/

