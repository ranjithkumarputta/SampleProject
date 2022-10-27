Feature: Validate new customer added to Customers table

  @ValidateNewCustomer
  Scenario:
    Given I successfully tested Add Customer functionality
    When I go to Customers List
    And check last entry to Customers Table
    Then I should be able to see my last entry as per @AddCustomer scenario