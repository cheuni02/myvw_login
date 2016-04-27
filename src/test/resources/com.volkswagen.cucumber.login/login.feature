Feature: Login As a VW User
  I would like to be able to log on as an existing user


  Background: Navigating to Login/sign up page
    Given I am on the sign in page

  Scenario: Login as existing user
    When I type into username field : 'automatedtestdragon-A1@example.com'
    And I type into password field : 'Abcd!2345'
    And press login
    Then I should be able to log in