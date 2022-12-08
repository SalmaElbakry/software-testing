Feature: Book a tour

  Background:
    Given the login page is opened

  Scenario:
    Given the email is filled with "user@phptravels.com"
    And the password is filled with "demouser"
    When the Login button is clicked
    And Tours link is clicked
    And Big Bus Tour link is clicked
    And Book the tour now button is clicked
    Then a "USD 66 " price message is shown