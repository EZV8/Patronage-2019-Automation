Feature: As a user, I want to be able to log out from ConfR Android app

  Background:
    Given I open application
    And I sign in using "beth.smith@patronage.onmicrosoft.com" and "@Intive12345678"
    And I click sign in button

  Scenario: I can log out from ConfR Android app
    When I click sign out button
    Then I can see message about successful logout