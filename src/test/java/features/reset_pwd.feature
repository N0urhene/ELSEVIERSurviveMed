Feature: Reset the password

  Scenario: Reset the password
    Given The user is in the login webpage
    When The user click on Forgot Password link
    And The user is in the Reset Password screen
    And The user enter his email address in the address field
    And The user click on the blue button Send email
    Then The user should receive a success message
