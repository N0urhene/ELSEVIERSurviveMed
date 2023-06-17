Feature: Manage favorites

  Scenario:
    Given the user is in the favorite screen
    When The user click on an item
    And The user is redirected to the item's section
    And The user click on the step-back button to back to the list
    And The user long-click on an item
    And A pop up appears in the bottom of the page
    And The user click on remove from favorites
    Then The item is deleted