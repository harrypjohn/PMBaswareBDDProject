package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features={"src/test/resources/features"}, glue={"Steps"},plugin = {"json:target/JsonReport/cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, publish=true,monochrome=true)
public class RunCuke1 extends AbstractTestNGCucumberTests{
	
	
}

//tags="@Search-Cars or @Used-Search-Cars"
//tags="@Search-Cars or @Used-Search-Cars",