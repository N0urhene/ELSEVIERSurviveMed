@appium
Feature: Login to the application

  Scenario 1: Log in with blank fields
    Given The user is in the login web page
    When The user click on the "CONNEXION" button
    Then The user should see an error message

  Scenario 2: Log in with invalid email and invalid password
    Given The user is in the login web page
    When The user enter an invalid email address
    And The user enter zn invalid password
    And The user click on the "CONNEXION" button
    Then The user should see an error message

  Scenario 3: Log in with a valid email and password
    Given The user is in the login web page
    When The user enter a valid unverified email address
    And  The user enter a valid unverified password
    And The user click on the "CONNEXION" button
    Then The user should see an error message

  Scenario 4: Log in with a verified email address and unverified password
    Given The user is in the login web page
    When The user enter a valid verified email address
    And The user enter an incorrect password
    And The user click on the "CONNEXION" button
    Then The user should see an error message

  Scenario 5:  Login with an unverified address and correct password
    Given The user is in the login web page
    When The user enter a valid email address
    And The user enter a correct password
    And The user click on the "CONNEXION" button
    Then The user should see an error message

  Scenario 6: Log in with a verified account
    Given The user is in the login web page
    When The user enter a correct email address
    And The user enter a correct password
    And The user click on the "CONNEXION" button
    Then The user should be logged in to the home screen