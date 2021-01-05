package Runner;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = "C:/Users/Sreyoshi/eclipse-workspace/RestAPI_RestAssured/CucumberpageObjects/src/test/resources/Features/SearchCar.Feature", //the path of the feature files
		glue={"/CucumberpageObjects/src/test/java/Steps/SearchCAaSteps.java"},
		tags={"@SearchCars_Positive"}		
		)
public class RunTests extends AbstractTestNGCucumberTests  {
	

	
}
