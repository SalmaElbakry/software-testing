Feature: Book a hotel

  Background:
    Given the login page is opened

  Scenario:
    Given the email is filled with "user@phptravels.com"
    And the password is filled with "demouser"
    And the Login button is clicked
    And Hotel link is clicked
    And Hotel Name is clicked
    And Book now button is clicked
#    Then a "USD  " total price message is shown