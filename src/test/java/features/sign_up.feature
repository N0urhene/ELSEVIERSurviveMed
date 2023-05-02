Feature: Sign Up to the application

  Scenario 1: Register from the main interface
    Given The user is in the main screen of the application
    When  The user click on the "Register" button
    Then The user should see the "Terms and conditions" screen

  Scenario 2: Scroll the terms and conditions screen with scroll button
    Given The user is in the terms and conditions screen
    When The user click on the "Scroll to accept" button a first click
    And The user click on the "Scroll to accept" button a second click
    And The user click on the "Scroll to accept" button a third time
    Then The user should see the terms and conditions to accept
    And The user should see a "Continue" button grayed out

  Scenario 3: Accept terms and conditions
    Given The user is in the bottom of the terms and conditions screen
    When The user accept both conditions
    And The user click on the "Continue" button
    Then The user should be redirected to the inscription web page

  Scenario 4: Register with blank fields
    Given The user is in the inscription web page
    When The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see an error message under the fields  with reddening of the field frame

  Scenario 5: Sign up with a valid email address and a blank password
    Given The user is in the inscription web page
    When The user enter a valid email address in the address field
    And The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see an error message under the password field with reddening of the field frame

  Scenario 6: Sign up with a blank amail address and a valid password
    Given The user is in the inscription web page
    When The user enter his password
    And The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see an error message under the address field

  Scenario 7: Sign in with a valid password and invalid email address
    Given The user is in the inscription web page
    When The user enter an invalid email address in the address field
    And The user enter a valid password in the password field
    And The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see an error message

  Scenario 8: Sign up with invalid email address and password
    Given The user is in the inscription web page
    When The user enter an invalid email address
    And The user enter an invalid password
    And The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see an error message

  Scenario 9: Sign in with invalid email address and password form
    Given The user is in the inscription web page
    When The user enter an email address without a domain name
    And The user enter a password smaller than 8 characters
    And The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see an error message

  Scenario 10:  Sign in with valid email address and invalid password
    Given The user is in the inscription web page
    When The user enter a valid email address
    And The user enter a short password consisting of numbers and lowercase letters
    And The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see an error message

  Scenario 11: Sign in with invalid email address and valid password
    Given The user is in the inscription web page
    When The user enter an invalid email address
    And The user enter a valid password with upper- and lower-case letters, and numbers
    And The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see an error message

  Scenario 12: Sign in with valid email address and password
    Given The user is in the inscription web page
    When The user enter a valid email address
    And The user enter a valid password
    And The user click on the "REGISTRATION" red button in the bottom of the page
    Then The user should see a secsessful message
    And The user should receive a verification email

  Scenario 13: Activate account
    Given The user is in his mailbox
    When The user click on the validation email received in his mailbox
    And The user open the email
    And The user click on the blue button "confirm my account"
    Then The user should see a seccessfull message
    And The user should receive a welcome email
    And The user should be redirected to the login web page
