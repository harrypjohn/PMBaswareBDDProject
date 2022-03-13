package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	public static WebDriver driver = SeleniumDriver.getDriver();

	public static void highLightMethod(WebElement element) throws InterruptedException {
		WebElement selectedElement = element;
		JavascriptExecutor jsExecutor1 = (JavascriptExecutor) driver;
		jsExecutor1.executeScript("arguments[0].style.border='2px solid red'", selectedElement);
		Thread.sleep(2000);
	}

	public static void clickelement(WebElement element1) throws InterruptedException {
		WebElement webElement1 = element1;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", webElement1);
		Thread.sleep(5000);
	}

	public static void click_element(WebElement element3) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element3));
		element3.click();
	}

	public static void selectDropDown(WebElement element2, String str) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element2));
		Select dropdown = new Select(element2);
		System.out.println("Before" + str);
		if (str.equalsIgnoreCase("123Hallway")) {

			dropdown.selectByIndex(1);
		} else {
			dropdown.selectByValue(str);
		}

	}

	public static void sendKeys(WebElement element, String str) {
		element.sendKeys(str);
	}

	public static void returnSubString(WebElement element) {
		String str = element.getText();
		int length = str.length();
		System.out.println("Length of the string is:- " + length);
		int index1 = str.indexOf('#');
		int index2 = index1 + 8;
		System.out.println("Newly created standard order request is " + str.substring(index1 + 1, index2));

	}

	public static void returnSubStringOfBPORequest(WebElement element) {
		String str = element.getText();
		int length = str.length();
		System.out.println("Length of the string is:- " + length);
		int index1 = str.indexOf('.');
		int index2 = index1 + 8;
		System.out.println("Newly created Blankt order request is" + str.substring(index1 + 1, index2));
	}
	public static void isElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void switch_To_ChildWindow() {
		String currentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();
		while (i.hasNext()) {
			String childWindow = i.next();
			if (!childWindow.equalsIgnoreCase(currentWindow))
			{
				System.out.println("this is child window" + childWindow);
				driver.switchTo().window(childWindow);
			}
		}
		System.out.println("This is parent window" + currentWindow);
	}

	public static void switch_To_ParentWindow() {
		Set<String> windows = driver.getWindowHandles();
		int totalWin = windows.size();
		String winTitle = null;
		winTitle = windows.toArray()[0].toString();
		driver.switchTo().window(winTitle);

	}
    public static void open_Shadow_Dom_Element_Click(String cssSelectorHost1, String cssSelectorElement ) throws InterruptedException
    {
    	//This Element is inside single shadow DOM.
    			String cssSelectorForHost1 = cssSelectorHost1;
    			Thread.sleep(1000);
    			WebElement shadowDomHostElement = driver.findElement(By.cssSelector(cssSelectorForHost1));
    			SearchContext last = (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", shadowDomHostElement);
    			Thread.sleep(1000);
    			last.findElement(By.cssSelector(cssSelectorElement)).click();
    }
    public static void double_Click(WebElement element)
    {
    	Actions actions = new Actions(driver);
    	
    	actions.doubleClick(element).perform(); 
    }
    public static boolean element_Present(String xpath)
    {
    	if(driver.findElements(By.xpath(xpath)).size() > 0)
    	{
    	 return true;
    	}
    	else
    	{
    		return false;
    	}
    	
    }
    public static void sendkeys() throws InterruptedException {
    	WebElement webl = driver.findElement(By.xpath("//input[@class='form-control ui-select-search ng-pristine ng-valid ng-empty ng-touched']"));

    	JavascriptExecutor js = (JavascriptExecutor)driver;

    	js.executeScript("arguments[0].value='Hotel Glo';", webl);
    }
}
