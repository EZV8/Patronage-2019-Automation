Feature: As a user I want to be able to login in ConfR mobile app

  Background:
    Given I open application

  Scenario Outline: Login with correct data
    When I sign in using "<email>" and "<password>"
    Then I'm on main screen
    Examples: Correct data for login
      | email                                  | password        |
      | beth.smith@patronage.onmicrosoft.com   | @Intive12345678 |
      | morty.smith@patronage.onmicrosoft.com  | @Intive12345678 |
      | rick.sanchez@patronage.onmicrosoft.com | @Intive12345678 |

  Scenario Outline: Login with incorrect data
    When I sign in using "<fakeEmail>" and "<fakePassword>"
    Then I can see warning message
    Examples: Incorrect data for login
      | fakeEmail            |  | fakePassword |
      | fakeemail@test.pl    |  | fakePassword |
      | testemail@intive.com |  | fakePassword |

  Scenario: Login without password
    When I sign in using only email "rick.sanchez@patronage.onmicrosoft.com"
    Then I can see warning message

  Scenario:  Login without email
    When  I sign in using only password "fakePassword"
    Then I can see warning message

  Scenario: Login without data
    When I sign in without data
    Then I can see warning message