Feature: As a user I want to be able to login in ConfR mobile app - Internet isn't connected

  Background:
    Given I open application

  Scenario: I am trying to login without internet connection
    When I sign in using "beth.smith@patronage.onmicrosoft.com" and "@Intive12345678"
    Then I can see warning message