#mvn test -Dcucumber.options="--tags @TAG"
Feature: As a trainee I'm testing new source code here

  Background:
    Given I open application

  @left
  Scenario: Testing scrolling to the left
    When  I scroll to the left
    Then I am on the next page

  @right
  Scenario:  Testing scrolling to the right
    When I scroll to the right
    Then I am on previous day

  @down
  Scenario:  Testing scrolling to the down
    When I scroll down
    Then I am going to the top of screen

  @up
  Scenario:  Testing scrolling to the bottom
    When I scroll up
    Then I am going to the bottom of screen

  @in
  Scenario: Zooming in
    When I zoom in
    Then I can see better

  @out
  Scenario: Zooming out
    When I zoom out
    Then I can see more