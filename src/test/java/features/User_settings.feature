@Before
Feature: Manage user profile

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

  Scenario: Profile settings
    Given The user is in the profile screen
    When The user click on the list's first element
    And The user is in the Further reading and credits screen
    And The user click on the step-back button to back to the Settings
    And The user click on the list's second item
    And The user is redirected to the Privacy Policy web page
    And The user click to back to the Settings screen
    And The user click on the list's third item
    And The user is in the Terms and Conditions web page
    And The user click to back to the Settings screen
    And The user click on the list's forth element
    And The user is redirected to the About Elsevier screen web page
    And The user click to back to the Settings screen
    And The user click to the list's fifth element
    And The user is redirected to the Support Center web page
    And The user click to back to the Settings screen
    And The user click on the last element in the list
    And The user is in My account screen
    And The user click on Delete my account link
    Then The user is redirected to Elsevier Support Center

  Scenario: Sign out of the application
    Given The user is in the profile screen
    When The user click on the sign out link
    And A confirmation pop up appeared
    And The user click on Yes
    Then The user is signed out and redirected to the application main screen