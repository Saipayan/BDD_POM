package Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CArdGuideHomePageLocators {
	
	@FindBy(how=How.LINK_TEXT,using ="buy + sell")
	public WebElement BUY_AND_SELL_LINK;
	
	@FindBy(how=How.XPATH,using ="//button[text()='Sell my car']")
	public WebElement SellMyCAr;
	
	@FindBy(how=How.LINK_TEXT,using ="Search Cars")
	public WebElement SearchCars;
	
	@FindBy(how=How.LINK_TEXT,using ="Used")
	public WebElement User_Cars_Link;
	
	
	@FindBy(how=How.XPATH,using ="//*[@id='makes']")
	public WebElement Makes;
	
	@FindBy(how=How.XPATH,using ="//*[@id='models']")
	public WebElement Models;
	
	@FindBy(how=How.XPATH,using ="//button[@id='search-submit']")
	public WebElement Show_Button;
	
	

}
