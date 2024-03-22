@createAccountFunction
Feature: Driplane Signup

  Scenario: Navigate to Driplane signup page (Test Case 001)
    Given I am on the Driplane signup page

  Scenario: Verify presence on Driplane signup page (Test Case 002)
    When I am on the Driplane signup page
    Then I should be on the Driplane signup page

  Scenario: Provide valid email, password, and confirm password (Test Case 003)
    Given I am on the Driplane signup page
    When I enter a valid standard email
    And I enter a valid standard password
    And I confirm the password
    Then the email, password, and confirm password fields should be filled with valid information

  Scenario: Click on the Register Button (Test Case 007)
    Given I am on the Driplane signup page
    When I click on the Register Button
    Then I should be directed to the account creation process

  Scenario: Successfully create an account (Test Case 008)
    Given I am on the account creation page
    When I successfully fill out the required information
    And I submit the form
    Then my account should be created successfully
