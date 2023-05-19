@appium
Feature: signup to the application

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

  Scenario: Register to the app
    And The user switch to the Sign Up field
    And The user enter a valid email address and a valid password
    And The user click on the Sign Up button
    Then The user should see the home screen