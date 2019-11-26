Feature: Challenge Validation

  Scenario: Register User


    Given I open home page
    When I click on sign in button
    And I Click Create an account option
    And I Fill all fields with correct data
    And I Click Register button
    Then I should be able to login and see my username and logout button


    Scenario Outline: Existing Customer
      Given I open home page
      When I click on sign in button
      And I login with credentials <username>,<password>
      Then I should be able to login and see my username and logout button

      Examples:
        |username|password|
        |maxine.armstrong@gmail.com|jv5tzjqv2gp9ze|


    Scenario Outline: Order Details
     Given I open home page
     When I click on sign in button
     And I login with credentials <username>,<password>
     And I add to cart the product
      And I confirm the order
      Then I should see my order confirmed



    Examples:
      |username|password|
      |maxine.armstrong@gmail.com|jv5tzjqv2gp9ze|







