@createAccountPageUI
Feature: Driplane Create Account Page

  Scenario: Navigate to Driplane Create Account Page (Test Case 001)
    Given I am on the Driplane Create Account page

  Scenario: Verify the presence of "Driplane" text (Test Case 002)
    Then I should see the text "Driplane"

  Scenario: Verify the presence of "Create Account" text (Test Case 003)
    Then User should see the text "Create account"

  Scenario: Verify the usability of the E-mail input field (Test Case 004)
    Then the E-mail input field should be enabled

  Scenario: Verify the usability of the New Password input field (Test Case 005)
    Then the New Password input field should be enabled

  Scenario: Verify the usability of the Verify Password input field (Test Case 006)
    Then the Verify Password input field should be enabled

  Scenario: Verify the presence of the Register button (Test Case 007)
    Then I should see the Register button

  Scenario: Verify the Register button is clickable (Test Case 008)
    Then I should be able to click on the Register button

  Scenario: Verify the presence of "Do you already have an account?" text (Test Case 009)
    Then All users should see the text "Do you already have an account?"

  Scenario: Verify the presence of the Login button (Test Case 010)
    Then I should see the Login button

  Scenario: Verify the Login button is clickable (Test Case 011)
    Then I should be able to click on the Login button

  Scenario: Verify the transition from the Create Account Page to the Login Page (Test Case 012)
    When I click the Login button
    Then I should be redirected to the login page
