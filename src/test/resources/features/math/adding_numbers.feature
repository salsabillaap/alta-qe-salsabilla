@android
Feature: Calculator Page

  Background: : user already login
    Given user is on login page
    And user input username "admin"
    And user input password "admin"
    And user click button login

  @positive
  Scenario Outline:  operate two numbers
    When fill angka "satu" field with <angka 1>
    And fill angka "dua" field with <angka 2>
    And I operate angka satu and dua use "<operator>"
    And user click equals button
    Then the <hasil> should be appeared
    Examples:
    | angka 1 | angka 2 | operator | hasil |
    | 3       | 4       | +        | 7     |
    | 10      | 4       | -        | 6     |
    | 16      | 4       | /        | 4     |
    | 3       | 4       | *        | 12    |

  @negative
  Scenario: do operate without inputs
    When user not fill all the fields
    Then equals button cant be clicked

  @negative
  Scenario: user input field angka 1 with special character
    When user fill angka "satu" with "@#$%"
    Then field "satu" can't be input with alphabet

  @negative
  Scenario: user input field angka 2 with special character
    When user fill angka "dua" with "@#$%"
    Then field "dua" can't be input with alphabet