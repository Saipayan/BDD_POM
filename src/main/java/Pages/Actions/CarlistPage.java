package Pages.Actions;

import org.openqa.selenium.support.PageFactory;

import Pages.Locators.CarList;
import Utils.CommonSeleniumDriver;

public class CarlistPage {
	
	CarList carlist = null;
	public CarlistPage()
	{
		this.carlist= new CarList();
		PageFactory.initElements(CommonSeleniumDriver.getDriver(),carlist );
	}
	
	public String getTitle()
	{
		String Title=carlist.Title.getText();
		return Title;
	}

}
