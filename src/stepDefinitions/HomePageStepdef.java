package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.HomePage;

public class HomePageStepdef {

	@Given("I launch flipkart$")
	public void iAmOnFlipKartHomePage() throws Exception{
		new HomePage().basePageNavigation();
	}
	
	@And("^I search \"([^\"]*)\" in search box$")
	public void i_search_in_search_box(String nm) throws Throwable {
		new HomePage().searchInSearchInputbox(nm);
	}
	
	@And("I verify that I am on flipkart home page$")
	public void iVerifyThatIAmOnFlipkartHomePage(){
		new HomePage().verifyIAmOnFlipKartHomePage();
	}
	
	
	
	@And("^I select add to compare checkbox$")
	public void iSelectAddToCompareCheckbox() throws Exception{
		new HomePage().selectAddToCompareChkbox();
	}
	
	@Given("^I verify count (\\d+) gets displayed for compare$")
	public void i_verify_count_gets_displayed_for_compare(int arg1) throws Throwable {
	    new HomePage().verifyCountOfOneInCompare();	
	}
}
