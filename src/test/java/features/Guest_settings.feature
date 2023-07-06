Feature: Guest settings screen

  Background:
    Given The user is on the main screen
    When The user click the Use without account button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    Then The user should see the home screen

  Scenario: Guest register from the settings screen
    Given The user is in the profile screen
    When The user click on the orange Register button
    Then The user is redirected to the register webpage

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
    And The user click on the list's forth element
    And The user is redirected to the About Elsevier screen web page
    And The user click to back to the Settings screen
    And The user click to the list's fifth element
    And The user is redirected to the Support Center web page
    Then The user click to back to the Settings screen

