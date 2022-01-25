package Steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.messages.Messages.GherkinDocument.Feature.Scenario;
import utils.SeleniumDriver;

public class AfterActions {
	
	@AfterSuite
	public void close()
	{
		//if(SeleniumDriver.getDriver()!=null)
		{

			SeleniumDriver.tearDown();
		}
	}

	
	
	
	
	@AfterStep
	public void addScreenshot(io.cucumber.java.Scenario scenario){

		byte[] screenshot = ((TakesScreenshot) SeleniumDriver.getDriver()).getScreenshotAs(OutputType.BYTES);
	    scenario.attach(screenshot, "image/png", "name");
		
	}


}