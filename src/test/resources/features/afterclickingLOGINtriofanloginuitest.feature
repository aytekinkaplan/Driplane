@LoginPageFunctionality
Feature: Login Page Functionality

  Background:
    Given the user is on the LOGIN page

  Scenario: Click LOGIN with empty Email and Password (TC02)
    When the user clicks the LOGIN button with empty Email and Password

  Scenario: Verify "Please write a valid email address" message (TC03)
    Then the user should see a validation message "Please write a valid email address"


  Scenario: Verify "Write your password" message (TC04)
    Then the user should see the message "Write your password"

  Scenario: Check the presence of LOGIN button (TC05)
    Then the user should see the LOGIN button

  Scenario: Verify LOGIN button is clickable (TC06)
    When the user attempts to click the LOGIN button
    Then the LOGIN button should be clickable

  Scenario: Check the presence of RESET PASSWORD button (TC07)
    Then the user should see the RESET PASSWORD button

  Scenario: Verify RESET PASSWORD button is clickable (TC08)
    When the user attempts to click the RESET PASSWORD button
    Then the RESET PASSWORD button should be clickable

  Scenario: Check the presence of CREATE ACCOUNT button (TC09)
    Then the user should see the CREATE ACCOUNT button

  Scenario: Verify CREATE ACCOUNT button is clickable (TC10)
    When the user attempts to click the CREATE ACCOUNT button
    Then the CREATE ACCOUNT button should be clickable

  Scenario: Verify the presence of "Driplane" (TC11)
    Then the user should see the text "Driplane"
