Feature: As a user I want to be able to login in ConfR Android app - Internet is connected

  Background:
    Given I open application

  Scenario: I am checking if I am able to enter full data to proper log in
    Then I can see email box
    And I can see password box
    And I can see sign in button

  Scenario Outline: I log in with correct data
    When I sign in using "<email>" and "<password>"
    And I click sign in button
    Then I can see main screen page
    Examples: Correct data for login
      | email                                  | password        |
      | beth.smith@patronage.onmicrosoft.com   | @Intive12345678 |
      | morty.smith@patronage.onmicrosoft.com  | @Intive12345678 |
      | rick.sanchez@patronage.onmicrosoft.com | @Intive12345678 |

  Scenario Outline: I am trying to log in with incorrect data to check if validation works
    When I sign in using "<fakeEmail>" and "<fakePassword>"
    And I click sign in button
    Then I can see warning message
    Examples: Incorrect data for login
      | fakeEmail                           |  | fakePassword  |
      | fakeemail@patronage.onmicrosoft.com |  | @FakePassword |
      | admin@intive.com                    |  | @Admin123     |

  Scenario: I am trying to log in without password to check if validation works
    When I sign in using only email "beth.smith@patronage.onmicrosoft.com"
    And I click sign in button
    Then I can see warning message

  Scenario: I am trying to log in without email to check if validation works
    When I sign in using only password "@Intive12345678"
    And I click sign in button
    Then I can see warning message

  Scenario: I am trying to log in without data to check if validation works
    When I sign in without data
    And I click sign in button
    Then I can see warning message

  Scenario: I am checking if I am able to see main screen menu after closing and reopening application without repeated authorization
    When I sign in using "beth.smith@patronage.onmicrosoft.com" and "@Intive12345678"
    And I click sign in button
    And I close application
    And I return to application again
    Then I will return to current day screen