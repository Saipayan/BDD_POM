package Steps;

import Pages.Actions.CarlistPage;
import Pages.Actions.CarsGuideHomePageActions;
import Pages.Actions.SearchCarPageActions;
import Utils.CommonSeleniumDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SearchCAaSteps {

	
	CarsGuideHomePageActions carsguidehomePageActions = new CarsGuideHomePageActions();
	SearchCarPageActions searchcarpageactions = new SearchCarPageActions();
	CarlistPage carlistpage = new CarlistPage();
	
	@Given("^I am on the Home Page \"([^\"]*)\"$")
	public void i_am_on_the_Home_Page(String WebUrl) throws Throwable {
		CommonSeleniumDriver.OPenPage(WebUrl);
	}

	@When("^I move to BUY \\+ SELL Menu$")
	public void i_move_to_BUY_SELL_Menu() throws Throwable {
	  
		carsguidehomePageActions.MoveToBuyandSell();
	}

	@When("^I Click on Search Cars option$")
	public void i_Click_on_Search_Cars_option() throws Throwable {
	    
		carsguidehomePageActions.MoveToSearchCars();
	}

	@When("^select car brand as \"([^\"]*)\"$")
	public void select_car_brand_as(String CarBrandName) throws Throwable {
	    
		searchcarpageactions.SelectCarMake(CarBrandName);
		
	}

	@When("^Select Model as \"([^\"]*)\"$")
	public void select_Model_as(String CarModel) throws Throwable {
		searchcarpageactions.SelectCarModel(CarModel);
	}

	@When("^select Location as \"([^\"]*)\"$")
	public void select_Location_as(String Location) throws Throwable {
		searchcarpageactions.SelectCarLocation(Location);
	}

	@When("^select Price-max as \"([^\"]*)\"$")
	public void select_Price_max_as(String MaxPrice) throws Throwable {
		searchcarpageactions.SelectPrice(MaxPrice);
	}

	@When("^I Click on Find My Next Car$")
	public void i_Click_on_Find_My_Next_Car() throws Throwable {
		searchcarpageactions.ClickONSearchButton();
	}

	@Then("^I should See List of Cars$")
	public void i_should_See_List_of_Cars() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should Be in the new PAge$")
	public void i_should_Be_in_the_new_PAge() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



	@When("^I Enter Make as \"([^\"]*)\"$")
	public void i_Enter_Make_as(String Brand_Name) throws Throwable {
		carsguidehomePageActions.EnterMake(Brand_Name);
	}
    
	
	@When("^I ENter Model as \"([^\"]*)\"$")
	public void i_ENter_Model_as(String Model_Name) throws Throwable {
		carsguidehomePageActions.EnterModel(Model_Name);
	}
	
	@When("^I Click Show$")
	public void i_Click_Show() throws Throwable {
		
		carsguidehomePageActions.ClickOn_Show();
	}
	    
	
	@Then("^I am in new page$")
	public void i_am_in_new_page() throws Throwable {
		String Title = carlistpage.getTitle();
		Assert.assertTrue(Title.contains("BMW"));
	}

	
	
}
