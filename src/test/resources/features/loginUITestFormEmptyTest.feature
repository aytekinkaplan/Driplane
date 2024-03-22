@emptyFormTest
Feature: Login Form Validation
  As a user,
  I want to see warning messages when the form fields are empty,
  In order to log in.

  Scenario: Displaying the webpage
    Given I am on the Login Page

  Scenario: Display warning message when no email is entered but a password is entered
    Then the warning message "Please provide a valid email address" should be displayed for the email field

  Scenario: Display warning message when an email is entered but no password is entered
    Then the warning message "Please enter your password" should be displayed for the password field

  Scenario: Display both email and password warning messages when neither is entered
    Then the warning messages "Please provide a valid email" and "Please enter your password" should be displayed for both fields

