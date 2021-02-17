Feature: All login scenarios


  @loginReal
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
    When I enter valid username and valid password
    And I click on login button
    Then I should be redirected to the home page



  @dummyLogin
  Scenario: to test the functionality of login button for valid input
    Given I am on stock login page
    When I enter "admin" and "admin" to the stock login page
    And I click on login button on stock login page
    Then I should be redirected to the welcome page


  @dummyLogin
  Scenario: to test the functionality of login button for valid input
    Given I am on stock login page
    When I enter "abcd" and "xyz" to the stock login page
    And I click on login button on stock login page
    Then I should get error message


  @dummyLogin
  Scenario: to test the functionality of login button for valid input
    Given I am on stock login page
    When I enter " " and " " to the stock login page
    And I click on login button on stock login page
    Then I should another error message


    @userReg
    Scenario:  to test the user registration functionality
      Given I am on user registration page
      When I enter below data
      | amol | ujagare | 78788 | amol@gmail.com |
      And I click on submit button
      Then user should be registred successfully

