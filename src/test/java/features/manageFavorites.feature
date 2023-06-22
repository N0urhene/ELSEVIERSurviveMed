Feature: Manage favorites

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
    And The user click on the first choice a medical student
    And The user click on the second element i go to school in
    And The user scroll to choose his country
    And The user click on the next element
    And The user choose his university
    And The user click on the last element My year of study is
    And The user choose his study year
    And The user click on the Next button
    And The user is in the welcome screen
    Then The user should be logged in to the home screen

  Scenario:
    Given the user is in the favorite screen
    When The user click on an item
    And The user is redirected to the item's section
    And The user click on the step-back button to back to the list
    And The user long-click on an item
    And A pop up appears in the bottom of the page
    And The user click on remove from favorites
    Then The item is deleted