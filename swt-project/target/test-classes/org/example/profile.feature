Feature: Update Profile

  Background:
    Given the login page is opened

  Scenario Outline:
    Given the email is filled with "user@phptravels.com"
    And the password is filled with "demouser"
    And the Login button is clicked
    And my profile link clicked
    And First name is filled with <name>
    And Last name is filled with 'Elbakry'
    And Phone is filled with <number>
    And update profile button is clicked
    And 'Profile updated successfully. ' is shown
    Then Click Log out button
    Examples:
    | name                       | number          |
    | 'user@phptravels.com'      | '+3650268594'   |
    | 'someemail_test@email.com' | '+54123456789'  |
    | 'salmamoh@gmail.com'       | '+985132874'    |
    | 'uhfdsjcxn@yahoo.com'      | '+84615320846'  |
    | 'agent@phptravels.com'     | '+74512874577'  |
    | 'yfghbcd@email.com'        | '+98522148547'  |

