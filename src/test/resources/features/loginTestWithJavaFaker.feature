@loginTestWithJavaFaker
Feature: Login Process Test

  Scenario: User logs in with valid credentials
    Given User is on the Driplane login page
    And User clicks on the login button
    Then User should be redirected to the dashboard page

