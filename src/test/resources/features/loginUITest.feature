@loginPageUI
Feature: User Authentication

  Scenario: Viewing the Login Page
    Given the user is on the login page
    Then they should see the "Driplane" logo
    And they should see the "Email" input
    And they should see the "Password" input
    And they should see the "Forgot password?" link
    And they should see the "Login" button
    And they should see the "Create Account" button

  Scenario: Clicking the Login Button
    Given the user is on the login page
    When they click the "Login" button
    Then they should be able to proceed with the login process

  Scenario: Clicking the Create Account Button
    Given the user is on the login page
    When they click the "Create Account" button
    Then they should be redirected to the account creation page
