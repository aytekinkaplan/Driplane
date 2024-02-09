Feature: User Login

  @login
  Scenario Outline: User login with different email and password combinations
    Given User navigates to the login page
    When User enters "<email>" and "<password>"
    Then User should see "<outcome>"

    Examples:
      | email                | password              | outcome
      | emailcom             | qwerty                | Please write a valid email address
      | @com                 | qwerty                | Please write a valid email address
      | @gmail.com           | qwerty                | Please write a valid email address
      | emailcom             |                       | Please write a valid email address with Write your password
      | email@gmail.com      | 1                     | Login failed. Please check your e-mail address and password.
      | email@gmail.com      | 12                    | Login failed. Please check your e-mail address and password.
      | email@gmail.com      | 123                   | Login failed. Please check your e-mail address and password.
      | email@gmail.com      | a                     | Login failed. Please check your e-mail address and password.
      | email@gmail.com      | ab                    | Login failed. Please check your e-mail address and password.
      | email@gmail.com      | abc                   | Login failed. Please check your e-mail address and password.
      | email@gmail.com      | abc                   | Login failed. Please check your e-mail address and password.
      |                      | abc                   | Please write a valid email address
      | email@gmail.com      | null                  | Login failed. Please check your e-mail address and password.
      | aoniki2018@gmail.com | AytekinKaplan1184811  | Login failed. Please check your e-mail address and password.
      | aoniki2018@gmail.com | AytekinKaplan1184811@ | passes

