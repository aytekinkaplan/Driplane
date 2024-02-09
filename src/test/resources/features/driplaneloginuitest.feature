@driplaneLogin
Feature: Triofan Login UI Test

  @driplaneLogin
  Scenario: User navigates to the login page
    Given the user is on the login page

  @driplaneLogin @driplaneText
  Scenario: User should see the "Driplane" text
    Given the user is on the login page
    Then the user should see the text "Driplane"

  @driplaneLogin @emailInput
  Scenario: User should see the Email input field
    Given the user is on the login page
    Then the user should see the Email input field

  @driplaneLogin @passwordInput
  Scenario: User should see the Password input field
    Given the user is on the login page
    Then the user should see the Password input field

  @driplaneLogin @loginButton
  Scenario: User should see the LOGIN button
    Given the user is on the login page
    Then the user should see the LOGIN button

  @driplaneLogin @clickLoginButton
  Scenario: User should be able to click on the LOGIN button
    Given the user is on the login page
    Then the user should see the LOGIN button

  @driplaneLogin @resetPasswordButton
  Scenario: User should see the RESET PASSWORD button
    Given the user is on the login page
    Then the user should see the RESET PASSWORD button

  @driplaneLogin @clickResetPasswordButton
  Scenario: User should be able to click on the RESET PASSWORD button
    Given the user is on the login page
    Then the user should see the RESET PASSWORD button

  @driplaneLogin @createAccountButton
  Scenario: User should see the CREATE ACCOUNT button
    Given the user is on the login page
    Then the user should see the CREATE ACCOUNT button

  @driplaneLogin @clickCreateAccountButton
  Scenario: User should be able to click on the CREATE ACCOUNT button
    Given the user is on the login page
    Then the user should see the CREATE ACCOUNT button
