@Invoice
Feature: Users Module Validation.

  Scenario: Validate new user with valid data.
    Given I login to the application and on home page
    When I navigate to Add Users page
    And enter all the valid data and click on Add user
    Then a new user should be created successfully
    And that user should be able to login successfully.

  Scenario: Validate new user with invalid data.
    Given I login to the application and on home page
    When I navigate to Add Users page
    And enter all the invalid data and click on Add user
    Then error messages should popUp to enter valid data.

  Scenario: Validate updating user information.
    Given I login to the application and on home page
    When I navigate to List Users page and navigate to Edit User page
    And enter  the updated data and click on Edit user
    Then  user updated successfully message should be dispalyed.

  Scenario: Validate search user functionality.
    Given I login to the application and on home page
    When I navigate to List Users page
    And search for a user
    Then searched user data should appear in the search results data table.

