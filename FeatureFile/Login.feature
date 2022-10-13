

Feature: User will come  to an application and perfom activities
 
 
  Scenario: Registered user will come to an application and login and logout 
    Given User is on login page
    When User enters username
    And  User enters password
    And  Click on Login button
    Then User should be loggedin
   

