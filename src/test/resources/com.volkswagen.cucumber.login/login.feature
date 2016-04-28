Feature: Login As a VW User
  I would like to be able to log on as an existing user


  Background: Navigating to Login/sign up page
    Given I am on the sign in page

  Scenario: Login as existing user
    When I type into username field : 'ic66@hotmail.com'
    And I type into password field : 'Maymaymay1234!'
    And press login
    Then I should be able to log in