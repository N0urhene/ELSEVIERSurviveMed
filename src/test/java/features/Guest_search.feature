Feature: Search a term on guest mode

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

  Scenario: Do a search
    Given The user click on the tabBar search icon
    And The user is on the search screen
    And The user click on the search bar
    And The user search for medical keyword
    And The user see the search result and click on it
    Then The user is redirected to the information section

