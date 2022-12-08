Feature: Book a hotel

  Background:
    Given the login page is opened

  Scenario:
    Given the email is filled with "user@phptravels.com"
    And the password is filled with "demouser"
    And the Login button is clicked
    And Hotel link is clicked
    And Islamadabad Marriott Hotel link is clicked
    And Book now button is clicked