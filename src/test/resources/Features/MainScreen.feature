Feature: Testing main screen of ConfR app

  Background:
    Given  I open application

  Scenario: Opening application and swiping on screen
    When I scroll view
    Then I can see that date has changed

  Scenario: Changing date to the next day
    When I click next day button
    Then I can see next day

  Scenario: Changing date to the previous day
    When I click previous day button
    Then I can see previous day

  Scenario: Zooming the main screen
    When I zoom out screen
    Then I am able to see full hours view list