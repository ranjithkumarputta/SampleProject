Feature: Automate the Login/Logout functionality for IM

  @ValidCredentials
  Scenario:
    Given I am on application login page
    When I enter valid UserName as "admin@gic.com" and valid password as "Admin123"
    And I click on Login
    Then I will successfully log in

  @InvalidCredentials
  Scenario:
    Given I am on application login page
    When I enter valid UserName as "admin1@gic.com" and valid password as "Admin1234"
    And I click on Login
    Then I will not be able to log in

  @LogOut
  Scenario:
      Given I am logged in on the application
      When I click on my profile icon (top right)
      And I click on Logout
      Then I will successfully log out