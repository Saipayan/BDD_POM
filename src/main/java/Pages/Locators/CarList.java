package Pages.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarList {

	@FindBy(how=How.XPATH,using ="//h1[@class='listing-search-title']")
	public WebElement Title;
}
