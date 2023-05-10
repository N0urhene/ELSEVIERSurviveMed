@appium
Feature: Guest sign up to the application

  Scenario: Sign up from the main interface
    Given The user is on the main screen
    When The user click the Use without account button
    And The user see the terms and conditions screen
    And The user click on the Scroll to accept button three times
    And The user see the conditions to be accepted and a Continue button grayed out
    And The user accept the terms condition
    And The user accept the privacy policy
    And The user click on the Continue button
    Then The user should see the home screen

    Scenario: Home screen first item: ANATOMY THE BARE BONES
      Given The user open the Anatomy item
      When The user choose the first element of the screen list
      And The user is in the element screen
      And The user click on the figure to be opened on full screen
      And The user double click the figure to zoom_in
      And The user double click the figure to zoom_out
      And The user click on the exit button to quit the figure
      And The user scroll down to find the table
      And The user click on the table to be opened on full screen
      And The user double click the table to zoom_in
      And The user double click the table to zoom_out
      And The user click on the exit button to quit the table
      And The user click on the previous button to back to list
      And The user choose the second element of the screen list
      And The user double click the figure to zoom_in
      And The user double click the figure to zoom_out
      And The user click on the exit button to quit the figure
      And The user scroll down to find the table
      And The user click on the table to be opened on full screen
      And The user double click the table to zoom_in
      And The user double click the table to zoom_out
      And The user click on the exit button to quit the table
      And The user click on the previous button to back to list
      And The user click on the previous button to back to the home page

