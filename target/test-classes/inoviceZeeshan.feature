@regression
Feature: Validation of Reports Functionalities.
  @login
  Scenario: I want to login successfully
    Given i am on the application login page
    When i enter the username and password.
    And click on login button
    Then i should be able to login successfully
@salesreport
  Scenario: I want to generate sales report.

    Given i am on the application dashboard
    When i go to  sales report page from Reports
    And select required field,submit
    Then i should be able to generatre sales report.
@paymentreport
    Scenario: I want to generate Payment Report.

      Given i am on application dashboard
      When i go to payment report page from Reports
      And select required field
      Then i should be able to generate Payment report.
@nofield
    Scenario: I want to generate sales report without selecting any required field.

      Given i am on the application dashboard
      When i go to sales report page from Reports
      And not selecting any required field
      Then i should not be able to generate sales report.

