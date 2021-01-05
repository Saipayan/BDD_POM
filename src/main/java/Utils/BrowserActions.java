package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BrowserActions {
	
	public static void do_CLICK( WebElement element)
	{
		element.click();
	}
	
	public static void selectFROMdropdown(WebElement element , String SelectorVAl)
	{
		Select selectCArBrand = new Select(element);
		selectCArBrand.selectByVisibleText(SelectorVAl);
	}
	
	public static void MoveToELEMENT(WebDriver driver,WebElement element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element);
	}
	
	

}
