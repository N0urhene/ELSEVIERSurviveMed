@Before
Feature: Log in to the application as a medical Professional

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

  Scenario: A medical Professional login to the application
    Given The user enter correct email address "soueidnourhene@gmail.com" and correct password "Nour1234"
    When The user click on the CONNEXION button
    And The user is successfully connected and redirected to Complete your profile screen
    And The user enter his first name and last name
    And The user click on the Next button
    And The user is in the login welcome screen
    And The user click on the I am element to select a role
    And The user is on the I am list
    And The user click on the second choice a medical Professional
    And The user click on the second element I go to school in
    And The user scroll to choose his country or enter the name on the search bar
    And The user click on the Next button
    And The user is in the welcome screen
    And The user click on the Next button
    Then The user should be logged in to the home screen