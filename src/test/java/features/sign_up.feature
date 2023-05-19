@appium
Feature: Sign Up to the application

  Scenario: Register from the main interface
    Given The user is on the main screen
    When  The user click on the Register button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    And The user is redirected to the inscription web page
    And The user switch to the Sign Up field
    And The user enter invalid email address in the address field "nourhenesoueid"
    And The user click on the Sign Up blue button in the bottom of the page
    And The user receives an error messages under the fields with reddening of the field frame
    And The user enter in invalid email "nourhene.soueid@gmail" and in the password field "nour"
    And The user click on the Sign Up blue button in the bottom of the page
    And The user receives an error messages under the fields with reddening of the field frame
    And The use enter in invalid email "nourhenesoueid.gmail.com" and in the password field "Nourhene"
    And The user click on the Sign Up blue button in the bottom of the page
    And The user receives an error messages under the fields with reddening of the field frame
    And The user enter a valid email address "soueidnourhene@gmail.com" and a valid password "Nour1234"
    And The user click on the Sign Up blue button in the bottom of the page
    Then The user should see a successful message
    And The user should receive a verification email


  Scenario: Activate account
    Given The user is in his mailbox
    When The user click on the validation email received in his mailbox
    And The user open the email
    And The user click on the blue button confirm my account
    Then The user should see a successful message
    And The user should receive a welcome email
    And The user should be redirected to the login web page
