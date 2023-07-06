Feature: The user is in the home page

  Background:
    Given The user is on the main screen
    When The user click on the Register button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    And The user is redirected to the inscription web page
    And The user enter correct email address "soueidnourhene@gmail.com" and correct password "Nour1234"
    And The user click on the CONNEXION button
    And The user is successfully connected and redirected to Complete your profile screen
    And The user enter his first name and last name
    And The user click on the Next button
    And The user is in the login welcome screen
    And The user click on the I am element to select a role
    And The user is on the I am list
    And The user click on the third choice just curious
    And The user click on the Next button
    And The user is in the welcome screen
    Then The user should be logged in to the home screen

  Scenario: Home screen first item: ANATOMY THE BARE BONES
    Given The user open the Anatomy item
    When The user choose the first element of the screen list
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
    Given The user open the flashcards item
    When The user click on the first element of the list
    And The user double-click the image to zoom-in
    And The user double-click the image to zoom-out
    And The user click on More to see the rest of the image description
    And The user click on the green button in the bottom of the page to hide the image labels
    And The user user swipe right to move to the next elements of the list
    And The user click on the exit button in the top
    Then The user click on the step-back button to back to the home screen

  Scenario: Home screen third item: LABORATORY VALUES
    Given The user click to open the item
    When The user scroll down to see all the alphabetic laboratory values
    And The user swipe the alphabetic list
    And The user click on an value of the list to see the details
    And The user long-click on the value
    And The user add the value to his favorite list
    And The user switch to the Category option
    And The user swipe the categories list
    And The user click a value to see the details
    And The user long-click the value to add it to his favorite list
    And The user click on the information icon
    And A popup appears presenting the Reference of the information
    And The user click the exit icon
    And The user click to back to home screen
    Then The user should see the home screen

  Scenario: Home screen forth item: MEDICAL DICTIONARY
    Given The user click on the item
    When The user scroll down to see all the information of the letter A
    And The user swipe right the alphabetic list
    And The user choose the next letter and click on it
    And The user should see all the information starting with that letter
    And The user long-click on an information
    And A pop up appears in the bottom of the page
    And The user click on Add to favorites
    And The user should see a message Added to favorites
    Then The user click on the top button to back to home screen

  Scenario: Home screen fifth item: GLOSSARIES BY SUBJECT
    Given The user click to open the glossaries by subject item
    When The user click on the Anatomy element
    And The user should be in the Anatomy dictionary
    And The user swipe the letters list to choose a letter
    And The user scroll the information
    And The user can favor his important information
    And The user click to back to the list
    Then The user click on the top button to back to home screen

  Scenario: Home screen ESSENTIAL LATIN item
    Given The user click to open the essential latin item
    When The user scroll down to see the results
    And The user click on the third information to add it to the favorites
    Then The user click back to home screen

  Scenario: Home screen SURVIVAL TIPS item
    Given The user click to open the survival tips item
    When The user should see a list of tips
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
    Given The user click to open test yourself item
    When The user click the Drug Calculations section
    And The user find the question card and tap on it to see the answer
    And The user swipe left to see the rest of the questions
    And The user click on the exit button
    And The user click the icon to back to home screen
    Then The user should see the home screen
