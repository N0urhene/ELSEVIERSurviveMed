@Before
Feature: Reset the password

  Background: Background:
    Given The user is on the main screen
    When The user click on the Register button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    And The user is redirected to the inscription web page

  Scenario: Reset the password
    Given The user is in the login webpage
    When The user click on Forgot Password link
    And The user is in the Reset Password screen
    And The user enter his email address in the address field
    And The user click on the blue button Send email
    Then The user should receive a success message
