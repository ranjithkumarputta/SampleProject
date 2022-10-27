Feature: Validate "Add Event" Functionality
  In oder to test the Add Event page
  As a registered or authorized user
  I want to verify the Add event function/Condition


  @Positive
  Scenario: Enter Valid inputs in Add event pop-up
    Given user is on the IM Application login page, enter username as "admin@gic.com" and password as "Admin123"
    When  user change clients url to home url
    And   click on Calendar button on the right top panel
    And   user click on a date to open add event pop up
    And   user Input Title as  "HALLOWEEN PARTY" , Startdate as "29.10.2022 17:00" , Enddate as "29.10.2022 22:00" ,  EventColor as "#1fda17" , Description as "Halloween theme dress"
    And   user click on Add Event
    Then  User should be able to create an event

  @Negative
  Scenario: Verify Create Event feature with Blank Title
    Given user is on the IM Application login page, enter username as "admin@gic.com" and password as "Admin123"
    When  user change clients url to home url
    And   click on Calendar button on the right top panel
    And   user click on a date to open add event pop up
    And   user leave all the input field as blank and click on Add Event
    Then  user should get warning message as “Title & Start is required“


