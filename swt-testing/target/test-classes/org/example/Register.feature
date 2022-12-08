Feature: Registration form testing

  Background:
    Given the homepage is open

  Scenario Outline:
    Given Name filled in '<name>'
    And Phone filled in with '<phone>'
    And Email filled in '<email>'
    And City filled in '<city>'
    And Username filled in '<username>'
    And Password filled in '<password>'
    And Submit button clicked
    Then 'This is just a dummy form, you just clicked SUBMIT BUTTON' is shown
    Examples:
      |name  | phone        | email              | city      | username | password      |
      |Salma | +3680554664  | someone@gmail.com  | CITY      | myuser   | mypassword    |
      |Name1 | +156486512564| something@gmail.com| SOMEWHERE | myuseris | thisispassword|
      |NAme2 | +96852354477 | bhsdefh@gmail.com  | huruheiw  | usernames| userspasswords|
      |Nina  | +53548784124 | sone@gmail.com     | hoemtown  | mser58   | m5685214      |
      |people| +5465487798  | 4uifejt@gmail.com  | Cairo     | thisuser | myunique_pass |
      |LINA  | +78764531287 | 58rotk@gmail.com   | New Delhi | LinaKIS  | hithisisme%^U*|

