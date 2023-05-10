@appium
Feature: Search

  Scenario: Do a search
    Given The user is in the home screen
    When The user click on the tabBar search icon
    And The user is on the search screen
    And The user click on the search bar
    And The user search for medical keyword
    Then The user should see the search result

