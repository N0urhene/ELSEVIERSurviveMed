@appium
Feature: Login to the application

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

  Scenario: Log in to the application
    And The user click on the CONNEXION button
    And The user should see an error message
    And The user enter invalid email address "soueid@gmail" and invalid password "12345678"
    And The user click on the CONNEXION button and see an error message
    And The user enter valid unverified email address "soueidnour@gmail.com" and valid unverified password "Nh123456"
    And The user click on the CONNEXION button and see an error message
    And The user enter a valid email address "soueidnour@gmail.com" and incorrect password "nour"
    And The user click on the CONNEXION button and see an error message
    And The user enter a valid verified email address "soueidnourhene@gmail.com" and incorrect password "noou1"
    And The user click on the CONNEXION button and see an error message
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
