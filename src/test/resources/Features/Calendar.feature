Feature: As a user I want to interact with calendar of ConfR Android app

  Background:
    Given I open application
    And I sign in using "beth.smith@patronage.onmicrosoft.com" and "@Intive12345678"
    And I click sign in button

  Scenario: I am able to see calendar component
    When I click today date bar
    Then I can see that calendar component is displayed

  Scenario: I can change current date
    When I click today date bar
    And I switch to another day
    And I click OK button
    Then I can see hours view for this day

  Scenario: I can change current month to next one
    When I click today date bar
    And I click right arrow in calendar
    Then I can see next month

  Scenario: I can change current month to previous one
    When I click today date bar
    And I click left arrow in calendar
    Then I can see previous month

  Scenario: I can change current year
    When I click today date bar
    And I click top left year field
    And I chose another year
    Then I can see that year has changed

  Scenario: I am on today day screen after canceling date pick
    When I click today date bar
    And I switch to another day
    And I click cancel button
    Then I will return to current day screen

  Scenario: I am on today day screen after canceling year pick
    When I click today date bar
    And I click top left year field
    And I chose another year
    And I click cancel button
    Then I will return to current day screen

  Scenario: I am on today day screen after canceling date pick and year pick
    When I click today date bar
    And I switch to another day
    And I click top left year field
    And I chose another year
    And I click cancel button
    Then I will return to current day screen

  Scenario: I am testing "Go to today" function
    When I click today date bar
    And I click top left year field
    And I chose another year
    And I click OK button
    And I click button GO TO TODAY
    Then I will return to current day screen