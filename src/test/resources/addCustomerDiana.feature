Feature: Validate Add Customer functionality

  @AddCustomer
  Scenario Outline: Add Customer - enter all required fields
    Given I am on application homepage
    When I select Add Customer option in Customers
    And I enter all required fields "<Field>"
    Then I should be able to add new customer to Customers table
    Examples:
      |Field    |
      |#123 Gic, DM Gic, dm@gic.com, 07444567890, 1st Street, London, Greater London, SN2 4HG, UK|

  @AddCustomerSingleField
  Scenario Outline: Add Customer - enter all required fields
    Given I am on application homepage
    When I select Add Customer option in Customers
    And I enter a value only in one field "<Field>"
    Then I should not be able to add new customer to Customers table
    Examples:
      |Field    |
      |#123 Gic, DM Gic, dm@gic.com, 07444567890, 1st Street, London, Greater London, SN2 4HG, UK|
