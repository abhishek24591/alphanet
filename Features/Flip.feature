Feature: Verify flipkart flow

  @TC_01
  Scenario: Home page flow
    Given I launch flipkart  
    And I verify that I am on flipkart home page
    And I search "mobiles" in search box
    And I select add to compare checkbox 
    And I verify count 1 gets displayed for compare
    
   

  
