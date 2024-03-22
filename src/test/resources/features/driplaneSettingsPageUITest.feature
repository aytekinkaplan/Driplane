@DriplaneSettings
Feature: Driplane Settings
  Scenario: Test Case 001 - Navigating to the Driplane Settings Page
    Given I am on the Driplane Settings page

  Scenario: Test Case 002 - Verifying Presence on the Driplane Settings Page
    Given I am on the Driplane Settings page
    Then I should understand that I am on the Driplane Settings page

  Scenario: Test Case 003 - Viewing Driplane Text
    Given I am on the Driplane Settings page
    Then I should see the Driplane text

  Scenario: Test Case 004 - Locating the Mail Field
    Given I am on the Driplane Settings page
    Then I should identify the mail field

  Scenario: Test Case 005 - Viewing Dashboard
    Given I am on the Driplane Settings page
    Then I should see the Dashboard

  Scenario: Test Case 006 - Viewing Default Project Button
    Given I am on the Driplane Settings page
    Then I should see the Default Project button

  Scenario: Test Case 007 - Viewing Account Settings
    Given I am on the Driplane Settings page
    Then I should see the Account Settings

  Scenario: Test Case 008 - Viewing Sign Out Option
    Given I am on the Driplane Settings page
    Then I should see the Sign Out option

  Scenario: Test Case 009 - Viewing Project Info
    Given I am on the Driplane Settings page
    Then I should see the Project Info

  Scenario: Test Case 010 - Viewing Project Name
    Given I am on the Driplane Settings page
    Then I should see the Project Name

  Scenario: Test Case 011 - Viewing Project Client ID
    Given I am on the Driplane Settings page
    Then I should see the Project Client ID

  Scenario: Test Case 012 - Viewing Project Client Secret
    Given I am on the Driplane Settings page
    Then I should see the Project Client Secret

  Scenario: Test Case 013 - Viewing Project API Keys
    Given I am on the Driplane Settings page
    Then I should see the Project API Keys

  Scenario: Test Case 014 - Creating a New Key
    Given I am on the Driplane Settings page
    Then I should see the option to Create a New Key

  Scenario: Test Case 015 - Viewing Project Events
    Given I am on the Driplane Settings page
    Then I should see the Project Events
