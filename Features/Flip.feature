Feature: Verify flipkart flow

  @TC_01
  Scenario: Verify login popup opens after clicking on first wishlist icon 
    And I verify that I am on flipkart home page
    And I select "tshirt" under "Men" section
    And I click on wishlist icon of first tshirt
    And I verify login popup opens  
    
   

  
