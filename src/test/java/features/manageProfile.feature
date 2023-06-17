Feature: Manage user profile

  Scenario: Profile settings
    Given The user is in the profile screen
    When The user click on the list's first element
    And The user is in the Further reading and credits screen
    And The user click on the step-back button to back to the Settings
    And The user click on the list's second item
    And The user is redirected to the Privacy Policy web page
    And The user click to back to the Settings screen
    And The user click on the list's third item
    And The user is in the Terms and Conditions web page
    And The user click to back to the Settings screen
    And TAhe user click on the list's forth element
    And The user is redirected to the About Elsevier screen web page
    And The user click to back to the Settings screen
    And The user click to the list's fifth element
    And The user is redirected to the Support Center web page
    And The user click to back to the Settings screen
    And The user click on the last element in the list
    And The user is in My account screen
    And The user click on Delete my account link
    And The user is redirected to Elsevier Support Center
    And The user click to back to the Settings screen
    And The user click on the sign out link
    And A confirmation pop up appeard
    And The user click on Yes
    And The user is signed out and redirected to the application main screen