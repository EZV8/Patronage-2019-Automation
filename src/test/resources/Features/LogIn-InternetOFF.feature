Feature: As a user I want to check how ConfR Android app will work when internet is disconnected

  Background:
    Given I open application

  Scenario: I should see message about connection error
    When I sign in using "beth.smith@patronage.onmicrosoft.com" and "@Intive12345678"
    And I click sign in button
    Then I should see warning message