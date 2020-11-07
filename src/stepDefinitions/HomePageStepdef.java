package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.HomePage;

public class HomePageStepdef {

	@And("I verify login popup opens")
	public void iVerifyLoginPopUpOpens() throws Exception{
		new HomePage().verifyLoginPopupOpens();
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
}
