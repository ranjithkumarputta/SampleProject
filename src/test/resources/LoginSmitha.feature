Feature: Sales validation

  Scenario: Validate Login page
    Given user on IM login page
    When user enters username "admin@gic.com" and password"Admin123"
  Then  user should able to login
