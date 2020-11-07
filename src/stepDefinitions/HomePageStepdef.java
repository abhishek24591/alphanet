package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.HomePage;

public class HomePageStepdef {

	@Given("I am on flipkart home page")
	public void iAmOnFlipKartHomePage() throws Exception{
		new HomePage().basePageNavigation();
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
