  Feature: PHPtravels Login page test

    Background:
    Given the login page is opened
    Scenario:
    Given the email is filled with "user@phptravels.com"
    And the password is filled with "demouser"
    When the Login button is clicked
    Then a "Hi, Demo Welcome Back" message is shown
#    Scenario Outline:
#    Given the '<field>' is filled with '<parameter>'
#    When the Sign In button is clicked
#    Then the '<msg>' error message is shown
#    Examples:
#      | field | parameter         | msg                        |
#      | email |                   | An email address required. |
#      | email | invalid.email.com | Invalid email address.     |
#      | email | user@phptravels.com   | Password is required   |
#      | password|
