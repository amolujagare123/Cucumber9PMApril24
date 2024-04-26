Feature: all login scenarios

  @valid @login
  Scenario: to test the functionality of login button for valid input
    Given We should be on login page
  #  When I enter correct username and password
    When I enter "admin" as username and "admin" as password
    And I click on login button
    Then We should on home page


  @invalid @login
  Scenario: to test the functionality of login button for invalid input
    Given We should be on login page
   # When I enter incorrect username and password
    When I enter "dsdsd" as username and "dsdsd" as password
    And I click on login button
    Then We should get an error

  @blank @login
  Scenario: to test the functionality of login button for valid input
    Given We should be on login page
   # When I enter blank username and password
    When I enter "" as username and "" as password
    And I click on login button
    Then We should get another error