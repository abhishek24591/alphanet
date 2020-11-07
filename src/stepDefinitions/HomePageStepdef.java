package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.HomePage;

public class HomePageStepdef {

	@Given("I launch flipkart")
	public void iAmOnFlipKartHomePage() throws Exception{
		new HomePage().basePageNavigation();
	}
	
	@And("^I search \"([^\"]*)\" in search box$")
	public void i_search_in_search_box(String nm) throws Throwable {
		new HomePage().searchInSearchInputbox(nm);
	}
	
	@And("I verify that I am on flipkart home page")
	public void iVerifyThatIAmOnFlipkartHomePage(){
		new HomePage().verifyIAmOnFlipKartHomePage();
	}
	
	@And("I login into application")
	public void iLoginIntoApplication() throws Exception{
		new HomePage().loginIntoApplication();
	}
}
