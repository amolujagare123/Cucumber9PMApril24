Feature: all login scenarios

  @userReg
  Scenario: to test the functionality of submit button
    Given We are on registration page
    When I enter Below Data
      | amol | Ujagare | 8989898 |  amol@gmail.com |

  #  When I enter Below Data
  #    | name | surname | phone   | email          |
  #    | amol | Ujagare | 8989898 | amol@gmail.com |
    And I click on submit
    Then user should be added


    @AddUser
    Scenario Outline: to test the functionality of submit button on add user page
      Given I am on login page
      When I login with correct user details
      And I click on add customer link
      And I enter <name> , <address> , <contact1> , <contact2>
      And I clcik on submit button
      Then Customer should be added
      Examples:
        | name        | address     | contact1 | contact2 |
        | John Doe    | 123 Main St | 555-1234 | 555-5678 |
        | Alice Smith | 456 Elm St  | 555-9876 | 555-5432 |
        | Bob Johnson | 789 Oak St  | 555-1111 | 555-2222 |
        | Sarah Lee   | 101 Pine St | 555-3333 | 555-4444 |
