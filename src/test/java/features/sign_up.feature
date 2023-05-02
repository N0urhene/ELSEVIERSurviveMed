Feature: Sign Up to the application

  Scenario: Register from the main interface
    Given The user is in the main screen of the application
    When  The user click on the Register button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    And The user is redirected to the inscription web page
    And The user switch to the Sign Up field
    And The user click on the Sign Up green button in the bottom of the page
    And The user recieves an error messages under the fields with reddening of the field frame
    And The user enter invalid email address in the address field
    And The user click on the Sign Up green button in the bottom of the page
    And The user recieves an error messages under the fields with reddening of the field frame
    And The user enter invalid password in the password field
    And The user click on the Sign Up green button in the bottom of the page
    And The user recieves an error messages under the fields with reddening of the field frame
    And The user enter a valid email address
    And The user enter a valid password
    Then The user should see a seccessful message
    And The user should receive a verification email

  Scenario: Activate account
    Given The user is in his mailbox
    When The user click on the validation email received in his mailbox
    And The user open the email
    And The user click on the blue button "confirm my account"
    Then The user should see a seccessfull message
    And The user should receive a welcome email
    And The user should be redirected to the login web page
