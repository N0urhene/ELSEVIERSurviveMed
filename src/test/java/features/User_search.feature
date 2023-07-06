Feature: Search a term on user mode

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

  Scenario: Search a term
    Given The user click on the tabBar search icon
    And The user is on the search screen
    And The user click on the search bar
    And The user search for medical keyword
    And The user see the search result and click on it
    Then The user is redirected to the information section