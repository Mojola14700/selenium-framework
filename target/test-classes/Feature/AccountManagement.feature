@AccountManagement
Feature: Account Management

  @CreateAccount
  Scenario Outline: Create an account with a valid email address
    Given I am on create an account page
    When I enter "<Firstname>" "<Lastname>" "<Email>" "<Password>" "<ConfirmPassword>"
    And I click on create an account
    Then my account page should be displayed


    Examples:
      | Firstname | Lastname | Email                      | Password       | ConfirmPassword |
      | Joris     | Johnson  | Borisjohnson147@yahoo.com | Borisisnotnice5@ | Borisisnotnice5@  |


