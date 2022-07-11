@login @android
Feature: List

  Background:
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    And user do scroll

  @test @positive
  Scenario: Verify user can longpress list on recycler view
    And user longpress one of the list

  @test @positive
  Scenario: Verify user can tap multiple times
    And user tap multiple times one of the list

