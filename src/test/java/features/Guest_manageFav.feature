Feature: Favorite management

  Background:
    Given The user is on the main screen
    When The user click the Use without account button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    Then The user should see the home screen

  Scenario: Guest manage favorites
    Given the user is in the favorite screen
    Then the screen is blank