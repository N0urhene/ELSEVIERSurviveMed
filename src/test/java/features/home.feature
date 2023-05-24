@appium @done
Feature: Discover Home screen items

  Scenario: Home screen first item: ANATOMY THE BARE BONES
    And The user open the Anatomy item
    And The user choose the first element of the screen list
    And The user is in the element screen
    And The user click on the figure to be opened on full screen
    And The user double click the figure to zoom_in
    And The user double click the figure to zoom_out
    And The user click on the exit button to quit the figure
    And The user scroll down to find the table
    And The user click on the table to be opened on full screen
    And The user double click the table to zoom_in
    And The user double click the table to zoom_out
    And The user click on the exit button to quit the table
    And The user click on the previous button to back to list
    And The user choose the second element of the screen list
    And The user double click the figure to zoom_in
    And The user double click the figure to zoom_out
    And The user click on the exit button to quit the figure
    And The user scroll down to find the table
    And The user click on the table to be opened on full screen
    And The user double click the table to zoom_in
    And The user double click the table to zoom_out
    And The user click on the exit button to quit the table
    And The user click on the previous button to back to list
    And The user click on the previous button to back to the home page
    Then The user should see the home screen

  Scenario: Home screen second item: ANATOMY FLASHCARDS
    And The user open the flashcards item
    And The user click on the first element of the list
    And The user double-click the image to zoom-in
    And The user double-click the image to zoom-out
    And The user click on the green button in the bottom of the page to hide the image labels
    And The user user swipe right to move to the next elements of the list
    And The user click on the exit button in the top
    Then The user click on the step-back button to back to the home screen

  Scenario: Home screen third item: LABORATORY VALUES
    And The user click to open the item
    And a pop up message appear
    And The user click on Not now
    Then The user should see the home screen
