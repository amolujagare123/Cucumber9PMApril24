Feature: all login scenarios

  Scenario: to test the functionality of login button for valid input
    Given We should be on login page
    When I enter correct username and password
    And I click on login button
    Then We should on home page

  Scenario: to test the functionality of login button for invalid input
    Given We should be on login page
   When I enter incorrect username and password
    And I click on login button
    Then We should on home page

  Scenario: to test the functionality of login button for valid input
    Given We should be on login page
    When I enter blank username and password
    And I click on login button
    Then We should on home page