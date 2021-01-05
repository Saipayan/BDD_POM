package Pages.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.Locators.CarsSearchPage;
import Utils.BrowserActions;
import Utils.CommonSeleniumDriver;

public class SearchCarPageActions extends BrowserActions{

	CarsSearchPage carsearchpage = null;
	
	public SearchCarPageActions()
	{
		this.carsearchpage = new CarsSearchPage();
		PageFactory.initElements(CommonSeleniumDriver.getDriver(), carsearchpage);
	}
	
	
	public void SelectCarMake(String Car_Brand)
	{
		selectFROMdropdown(carsearchpage.Car_Make,Car_Brand);
	}
	
	public void SelectCarModel(String Car_Model)
	{
		selectFROMdropdown(carsearchpage.Car_Models,Car_Model);
	}
	
	public void SelectCarLocation(String Location)
	{
		selectFROMdropdown(carsearchpage.Car_Locations,Location);
	}
	
	public void SelectPrice(String Price)
	{
		selectFROMdropdown(carsearchpage.Price_To,Price);
	}
	
	public void ClickONSearchButton()
	{
		do_CLICK(carsearchpage.Search_Button);
	}
	
	
	
}
