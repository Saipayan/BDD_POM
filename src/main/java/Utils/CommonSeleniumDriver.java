package Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSeleniumDriver {
	
	private static CommonSeleniumDriver commonSeleniumDriver;
	
	//init webdriver 
	
	private static WebDriver driver ;
	
	private static WebDriverWait waitDriver ;
	public static int TIMEOUT = 30;
	public static int PAGELOADTIMEOUT = 50;
	
	
	private CommonSeleniumDriver()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		waitDriver = new WebDriverWait(driver,TIMEOUT);
		driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(PAGELOADTIMEOUT, TimeUnit.SECONDS);
		
		
	}
	
	public static void OPenPage(String Url)
	{
		driver.get(Url);
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	public static void setUPDriver()
	{
		if(commonSeleniumDriver==null)
		{
			commonSeleniumDriver= new CommonSeleniumDriver();
		}
	}
	
	public static void tearDown()
	{
		if(driver != null)
		{
			driver.close();
			driver.quit();
		}
		commonSeleniumDriver=null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
