Feature: Book a hotel

  Background:
    Given the login page is opened

  Scenario:
    Given the email is filled with "user@phptravels.com"
    And the password is filled with "demouser"
    And the Login button is clicked
    And my profile link clicked
    And First name is filled with 'Salma'
    And Last name is filled with 'Elbakry'
    And Phone is filled with '+3650268594'
    And update profile button is clicked
    Then 'Profile updated successfully.' is shown

