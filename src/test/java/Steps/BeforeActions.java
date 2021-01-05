package Steps;

import Utils.CommonSeleniumDriver;
import cucumber.api.java.Before;

public class BeforeActions {

	
	@Before
	public static void setUP()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Test Started~~~~~~~~~~~~~~~~~~~~");
		CommonSeleniumDriver.setUPDriver();
	}
}
