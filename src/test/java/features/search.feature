@appium
Feature: Search

  Scenario: Do a search
    Given The user is in the search screen
    When The user click on the search bar
    And The user search for medical keyword
    Then The user should see the search result
