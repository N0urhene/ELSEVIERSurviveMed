@appium
Feature: Login to the application

  Background:
    Given The user is on the main screen
    When  The user click on the Register button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    And The user is redirected to the inscription web page

  Scenario 1: Log in with blank fields
    Given The user is in the login web page
    When The user click on the CONNEXION button
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
    Then The user should be logged in to the home screen
