package Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarsSearchPage {

	
	@FindBy(how=How.XPATH,using ="//*[@id='makes']")
	public WebElement Car_Make;
	
	@FindBy(how=How.XPATH,using ="//*[@id='models']")
	public WebElement Car_Models;
	
	@FindBy(how=How.XPATH,using ="//*[@id='locations']")
	public WebElement Car_Locations;
	
	@FindBy(how=How.XPATH,using ="//*[@id='priceTo']")
	public WebElement Price_To;
	
	@FindBy(how=How.XPATH,using ="//*[@id='search-submit']")
	public WebElement Search_Button;
	
	
	
}
