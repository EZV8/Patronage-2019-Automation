Feature: Testing main screen of ConfR Android app

  Background:
    Given  I open application
    And I sign in using "beth.smith@patronage.onmicrosoft.com" and "@Intive12345678"
    And I click sign in button

  Scenario: I open application and scroll to the left
    When I scroll to the left
    Then I can see that date has changed

  Scenario: I open application and scroll to the right
    When I scroll to the right
    Then I can see that date has changed

  Scenario: I can change date to the next day
    When I click next day button
    Then I can see next day

  Scenario: I can change date to the previous day
    When I click previous day button
    Then I can see previous day