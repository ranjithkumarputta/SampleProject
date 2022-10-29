@Invoice
Feature: Product Module Validation.
  Scenario: Validate Add Product with valid data
    Given I login to the application and on home page
    When I navigate to Add Product page
    And enter all the valid data and click on Add product
    Then a new product should be added successfully

  Scenario: Validate new added Product and edit
    Given I login to the application and on home page
    When I am on Products page and search new added product
    And click on Edit Product and I edited product and click on update product
    Then I should be able to update product


