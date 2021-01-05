package Pages.Actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Pages.Locators.CArdGuideHomePageLocators;
import Utils.BrowserActions;
import Utils.CommonSeleniumDriver;

public class CarsGuideHomePageActions extends BrowserActions {

	CArdGuideHomePageLocators carsguidehomepagelocators = null;
	
	
	public CarsGuideHomePageActions()
	{
		this.carsguidehomepagelocators= new CArdGuideHomePageLocators();
		PageFactory.initElements(CommonSeleniumDriver.getDriver(),carsguidehomepagelocators );
	}
	
	
	public void MoveToBuyandSell()
	{
		MoveToELEMENT(CommonSeleniumDriver.getDriver(),carsguidehomepagelocators.BUY_AND_SELL_LINK);
	}
	
	public void MoveToSearchCars()
	{
		do_CLICK(carsguidehomepagelocators.SearchCars);
	}
	
	public void MoveToUsedCArs()
	{
		do_CLICK(carsguidehomepagelocators.User_Cars_Link);
	}
	
	public void ClickOnSellMycar()
	{
		do_CLICK(carsguidehomepagelocators.SellMyCAr);
	}
	
	public void EnterMake(String Brand_name)
	{
		selectFROMdropdown(carsguidehomepagelocators.Makes,Brand_name);
	}
	
	public void EnterModel(String ModelName)
	{
		selectFROMdropdown(carsguidehomepagelocators.Models,ModelName);
	}
	
	public void ClickOn_Show()
	{
		do_CLICK(carsguidehomepagelocators.Show_Button);
	}
	
	
	
}
