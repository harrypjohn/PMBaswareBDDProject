package Steps;

import io.cucumber.java.Before;
import utils.SeleniumDriver;

public class BeforeActions {
	@Before
	public static void setUp()
	{
		System.out.println("I am before method");
		SeleniumDriver.setUpDriver();
	}

}
