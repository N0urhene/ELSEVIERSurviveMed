@Before
Feature: Discover Home screen items

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
    And The user click on the previous button to back to the home page
    Then The user should see the home screen

  Scenario: Home screen second item: ANATOMY FLASHCARDS
    And The user open the flashcards item
    And The user click on the first element of the list
    And The user double-click the image to zoom-in
    And The user double-click the image to zoom-out
    And The user click on More to see the rest of the image description
    And The user click on the green button in the bottom of the page to hide the image labels
    And The user user swipe right to move to the next elements of the list
    And The user click on the exit button in the top
    Then The user click on the step-back button to back to the home screen

  Scenario: Home screen third item: LABORATORY VALUES
    And The user click to open the item
    And a pop up message appear
    And The user click on Not now
    Then The user should see the home screen

  Scenario: Home screen forth item: MEDICAL DICTIONARY
    And The user click on the item
    And The user scroll down to see all the information of the letter A
    And The user swipe right the alphabetic list
    And The user choose the next letter and click on it
    And The user should see all the information starting with that letter
    And The user long-click on an information
    And A pop up appears in the bottom of the page
    And The user click on Add to favorites
    And The user should see a message Added to favorites
    Then The user click on the top button to back to home screen

  Scenario: Home screen fifth item: GLOSSARIES BY SUBJECT
    And The user click to open the glossaries by subject item
    And The user click on the Anatomy element
    And The user should be in the Anatomy dictionary
    And The user swipe the letters list to choose a letter
    And The user scroll the information
    And The user can favor his important information
    And The user click to back to the list
    Then The user click on the top button to back to home screen

  Scenario: Home screen ESSENTIAL LATIN item
    And The user click to open the essential latin item
    And The user scroll down to see the results
    And The user click on the third information to add it to the favorites
    Then The user click back to home screen

  Scenario: Home screen SURVIVAL TIPS item
    And The user click to open the survival tips item
    And The user should see a list of tips
    And The user click on the first tip card
    And The user can scroll to read the rest of the tip
    And The user click on the back button on the top of the card
    And The user choose the second tip card and click on it
    And The user can read the tip and scroll down to see the arguments
    And The user can swipe left to see the rest of the arguments
    And The user back to home screen and choose the third card
    And The user can read the tip and scroll down to read the cots
    And The user click on the back button on the top of the card
    Then The user click back to home screen

  Scenario: Home screen TEST YOURSELF item
    And The user click to open test yourself item
    And a pop up message appear
    And The user click on Not now
    Then The user should see the home screen
