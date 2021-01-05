package Steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.CommonSeleniumDriver;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	@After
	public static void tearDown(Scenario scenario) throws IOException
	{
		WebDriver driver =CommonSeleniumDriver.getDriver();
		System.out.println("######################################Test Finished##################");
		System.out.println(scenario.isFailed());
		if(scenario.isFailed())
		{
			System.out.println(scenario.isFailed());
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			// Now you can do whatever you need to do with it, for example copy somewhere
			FileUtils.copyFile(scrFile, new File("/CucumberpageObjects/src/test/resources/ScreenShots/image.png"));
		}
		CommonSeleniumDriver.tearDown();
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}
