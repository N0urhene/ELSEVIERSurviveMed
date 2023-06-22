@Before
Feature: Search

  Background:
    Given The user is on the main screen
    When The user click the Use without account button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    And The user should see the home screen

  Scenario: Do a search
    And The user click on the tabBar search icon
    And The user is on the search screen
    And The user click on the search bar
    And The user search for medical keyword
    Then The user should see the search result

