Feature: Email verification

  Background:
    Given The user is in his mailbox

  Scenario: Activate account email verification
    When The user click to open the validation email received in his mailbox
    And The user read the email
    And The user click on the blue button confirm my account
    And The user should receive a successful message
    Then The user should be redirected to the login web page

  Scenario: Reset password email verification
    When The user click to open the received email
    And The user read the email
    And The user click on the Set password blue button
    And The user is redirected to the Set password web page
    And The user click on the Submit button
    And The cursor shifted to the first field
    And The user enter a new invalid password
    And The user click on the Submit button
    And The cursor shifted to the first field and the list of password rules should be displayed
    And The user enter a new valid password
    And The user click on the Submit button
    And The cursor shifted to the next field
    And The user re-enter the password to confirm it
    And The user click on the Submit button
    Then The user should receive a successful messages
