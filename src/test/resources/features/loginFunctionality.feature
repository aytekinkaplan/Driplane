@LoginFunctionality
Feature: Login functionality

  # Basic Scenarios
  Scenario Outline: Verify login functionality with different input combinations
    Given I am on the login page
    When I enter "<email>" and "<password>" and click the login button
    Then I should see an outcome message

    Examples:
      | email                | password              |
      | aoniki2018@gmail.com | Aytekinkaplan1184811@ |
      | aoniki2018@gmail.com | invalidPass           |
      | aoniki@gmail.com     | Aytekinkaplan1184811@ |
      |                      | Aytekinkaplan1184811@ |
      | aoniki2018@gmail.com |                       |
      |                      |                       |

  # Boundary Conditions
  Scenario Outline: Verify login functionality with email length boundary conditions
    Given I am on the login page
    When I enter an email with "<emailLength>" characters and valid password and click the login button
    Then I should see an outcome message

    Examples:
      | emailLength                 |
      | a                           |
      | aaaaaaaaaaaaaaaaa@gmail.com |
      | bbbbbbbbbbbbbb@gmail.com    |

  Scenario Outline: Verify login functionality with password length boundary conditions
    Given I am on the login page
    When I enter valid email and a password with "<passwordLength>" characters and click the login button
    Then I should see an outcome message

    Examples:
      | passwordLength |
      | 324            |
      | zxdf5456       |
      | 256            |

  # Special Characters
  Scenario Outline: Verify login functionality with special characters in email and password
    Given I am on the login page
    When I enter an email with special characters "<email>" and valid password and click the login button
    Then I should see an outcome message

    Examples:
      | email           |
      | spec!al@email   |
      | valid@email.com |

  Scenario Outline: Verify login functionality with special characters in password
    Given I am on the login page
    When I enter valid email and a password with special characters "<password>" and click the login button
    Then I should see an outcome message

    Examples:
      | password       |
      | spec!alPass123 |
      | password123    |

  # Error Messages
  Scenario Outline: Verify error messages for different login scenarios
    Given I am on the login page
    When I enter "<email>" and "<password>" and click the login button
    Then I should see an error message

    Examples:
      | email                | password              |
      | aoniki2018@email.com | Aytekinkaplan1184811@ |
      | aoniki2018@gmail.com | invalidPass           |
      | invalid@email        | Aytekinkaplan1184811@ |
      |                      | Aytekinkaplan1184811@ |
      | aoniki2018@gmail.com |                       |
      |                      |                       |

  Scenario: Error message for empty login fields
    Given I am on the login page
    When I leave login fields empty and click the login button
    Then I should see an error message
