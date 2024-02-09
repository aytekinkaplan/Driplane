@triofanLogin
Feature: Triofan Login UI Test

  @triofanLogin
  Scenario: User navigates to the login page
    Given the user is on the login page

  @triofanLogin @driplaneText
  Scenario: User should see the "Driplane" text
    Given the user is on the login page
    Then the user should see the text "Driplane"

  @triofanLogin @emailInput
  Scenario: User should see the Email input field
    Given the user is on the login page
    Then the user should see the Email input field

  @triofanLogin @passwordInput
  Scenario: User should see the Password input field
    Given the user is on the login page
    Then the user should see the Password input field

  @triofanLogin @loginButton
  Scenario: User should see the LOGIN button
    Given the user is on the login page
    Then the user should see the LOGIN button

  @triofanLogin @clickLoginButton
  Scenario: User should be able to click on the LOGIN button
    Given the user is on the login page
    Then the user should see the LOGIN button

  @triofanLogin @resetPasswordButton
  Scenario: User should see the RESET PASSWORD button
    Given the user is on the login page
    Then the user should see the RESET PASSWORD button

  @triofanLogin @clickResetPasswordButton
  Scenario: User should be able to click on the RESET PASSWORD button
    Given the user is on the login page
    Then the user should see the RESET PASSWORD button

  @triofanLogin @createAccountButton
  Scenario: User should see the CREATE ACCOUNT button
    Given the user is on the login page
    Then the user should see the CREATE ACCOUNT button

  @triofanLogin @clickCreateAccountButton
  Scenario: User should be able to click on the CREATE ACCOUNT button
    Given the user is on the login page
    Then the user should see the CREATE ACCOUNT button
