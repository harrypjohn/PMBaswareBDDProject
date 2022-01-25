package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
public static WebDriver driver=SeleniumDriver.getDriver();
public static void highLightMethod(WebElement element) throws InterruptedException
{
	WebElement selectedElement = element ;  
	JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;  
	jsExecutor1.executeScript("arguments[0].style.border='2px solid red'", selectedElement);  
	Thread.sleep(2000);
}
public static void clickelement(WebElement element1) throws InterruptedException
{
	WebElement webElement1 = element1;
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", webElement1);
	Thread.sleep(5000);
}
public static void click_element(WebElement element3) throws InterruptedException
{
	WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOf(element3));
	element3.click();
}

public static void selectDropDown(WebElement element2,String str)
{
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(ExpectedConditions.visibilityOf(element2));
	Select dropdown=new Select(element2);
	System.out.println("Before"+str);
   if(str.equalsIgnoreCase("123Hallway"))
   {
	  
   dropdown.selectByIndex(1);
   }
   else
   {
	dropdown.selectByValue(str);
   }
	
}
public static void sendKeys(WebElement element, String str)
{
	element.sendKeys(str);
}
public static void returnSubString(WebElement element)
{
	String str=element.getText();
	int length=str.length();
	System.out.println("Length of the string is:- "+length);
	int index1=str.indexOf('#');
	int index2=index1+8;
	System.out.println("Newly created standard order request is "+str.substring(index1+1, index2));
	
}
public static void returnSubStringOfBPORequest(WebElement element)
{
	String str=element.getText();
	int length=str.length();
	System.out.println("Length of the string is:- "+length);
	int index1=str.indexOf('.');
	int index2=index1+8;
	System.out.println("Newly created Blankt order request is"+str.substring(index1+1, index2));
	
}
public static void isElementVisible(WebElement element)
{
	 WebDriverWait wait = new WebDriverWait(driver, 20);
	    wait.until(ExpectedConditions.visibilityOf(element));
}
}
