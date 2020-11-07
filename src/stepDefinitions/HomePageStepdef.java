package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.HomePage;

public class HomePageStepdef {

	
	@And("^I search in search box$")
	public void i_search_in_search_box() throws Exception {
		new HomePage().searchInSearchInputbox();
	}
	
	@And("I verify login popup opens")
	public void iVerifyLoginPopUpOpens(){
		
	}
	
	@And("I click on wishlist icon of first tshirt")
	public void i_click_on_wishlist_icon_of_first_tshirt() throws Exception{
		new HomePage().clickOnFirstWishListIcon();
	}
	
	@And("I verify that I am on flipkart home page$")
	public void iVerifyThatIAmOnFlipkartHomePage() throws Exception{
		new HomePage().verifyIAmOnFlipKartHomePage();
	}
	
	@And("^I select \"([^\"]*)\" under \"([^\"]*)\" section$")
	public void i_select_under_section(String val1,String val2) throws Throwable {
		new HomePage().selectItemUnderMens();
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
