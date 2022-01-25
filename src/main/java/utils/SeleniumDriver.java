package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {
private static WebDriver driver;
private static WebDriverWait waitdriver;
public static SeleniumDriver seleniumDriver;
private SeleniumDriver()
{
	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
}
public static void openPage(String url)
{
	driver.get(url);
}

public static WebDriver getDriver()
{
	return driver;
}
public static void setUpDriver()
{
	if(seleniumDriver==null)
	{
		seleniumDriver=new SeleniumDriver();
	}
}
public static void tearDown()
{
	if(driver!=null)
	{
		System.out.println("i am in tear down");
		driver.close();
		driver.quit();
	}
	
}
}
