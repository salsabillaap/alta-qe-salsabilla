@reqresin
Feature: Reqresin

  @get-single-user @positive
  Scenario: Success Get Single User
    When user send GET Single User with id 2
    Then response status code should be 200
    And response body json schema is "get-single-user.json"

  @post-login-successful @positive
  Scenario: Login Valid Data
    When user send POST "login" to reqresin with body json "success-login.json"
    Then response status code should be 200
    And response body json schema is "success-login.json"

  @post-login-unsuccessful @negative
  Scenario: Login Without Password
    When user send POST "login" to reqresin with body json "failed-login.json"
    Then response status code should be 400

  @post-register @positive
  Scenario: Success Register with Valid Data
    When user send POST "register" to reqresin with body json "register.json"
    Then response status code should be 200
    And response body json schema is "register.json"

  @put @positive
  Scenario: Update User Data
    Given user id is 2
    When user send POST "update" to reqresin with body json "update.json"
    Then response status code should be 200
    And response body json schema is "update-user.json"

  @delete
  Scenario: Delete User Data
    When user send DELETE to reqresin with user id is 2
    Then response status code should be 204