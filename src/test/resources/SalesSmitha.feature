Feature: IMSales functionality validation
  Background:
    Given user on IM login page
    When user enters username "admin@gic.com" and password"Admin123"
    Then  user should able to login
  Scenario: Verify sales navigation
    Given user on IM home page
    When user clicks on sales menu
    Then user should able to see options under sales
  Scenario: validate show entry of  List invoices page
    Given user  on  invoice page
    When user clicks on  show entry selection box
    Then user should be able to select no of entries per page by clicking on entries
  Scenario:  validate Copy,Exel,CSV, PDf, Column button of Invoice page
    Given user  on  invoice page
    When user navigates to sales page and click on copy button
    Then able to copy the data
    When user navigates to sales page and click on csv button
    Then user should able to download in csv format
    When user navigates to sales page and click on Excel button
    Then user should able to download in Excel format
    When user navigates to sales page and click on PDF button
    Then user should able to download in PDF format
  Scenario: Validate action functionality of Invoice page
    Given user  on  invoice page
    When user clicks on action button user should  able to see all options under action button
    Then clicking on each options able to see popup page  related to that option
  Scenario:  Validate payment option under action dropdown
  Given user  on  invoice page
  When user clicks on payment option
  Then user should able to see popup page payment
  Scenario:  Validate add payment option under action dropdown
    Given user  on  invoice page
    When user clicks on add payment option
    Then user should able to see popup page add payment
  Scenario:  Validate edit invoice option under action dropdown
    Given user  on  invoice page
    When user clicks on edit invoice option
    Then user should able to see popup page edit invoice
  Scenario:  Validate download as pdf option under action dropdown
    Given user  on  invoice page
    When user clicks on download as pdf option
    Then user should able to  perform download action
  Scenario:  Validate email invoice under action dropdown
    Given user  on  invoice page
    When user clicks on email invoice option
    Then user should able to  send invoice
  Scenario:  Validate delete invoice under action dropdown
    Given user  on  invoice page
    When user clicks on delete invoice option
    Then user should able to  see popup message and able to close it


