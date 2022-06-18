@reqresin
Feature: Reqresin

  @get-single-user @positive
  Scenario: Success Get Single User
    When user send GET Users request to reqresin
    Then response status code should be 200
    And response body "data.id" should be 2
    And response body "data.email" should be "janet.weaver@reqres.in"
    And response body json schema is "get-single-user.json"

  @post-login-successful @positive
  Scenario: Login Valid Data
    When user send POST login request to reqresin with body json "success-login.json"
    Then response status code should be 200
    And response body with jsonPath "token" should have type String

  @post-login-unsuccessful @negative
  Scenario: Login Without Password
    When user send POST login request to reqresin with body json "failed-login.json"
    Then response status code should be 400
    And response body with jsonPath "error" should have type String

  @post-register @positive
  Scenario: Success Register with Valid Data
    When user send POST Register request to reqresin
    Then response status code should be 200
    And response body "data.id" should be 4
    And response body json schema is "register.json"