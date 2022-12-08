  Feature: PHPtravels Login page test

    Background:
    Given the login page is opened
    Scenario:
    Given the email is filled with "user@phptravels.com"
    And the password is filled with "demouser"
    When the Login button is clicked
    Then a "Welcome Back" message is shown

