Feature: Testing ReqRes API

  @api
  Scenario: Get a list of users
    Given I send a GET request to "https://reqres.in/api/users?page=1"
    Then The response status code should be 200
    And The response should contain a list of users

  Scenario: Get a user by ID
    Given I send a GET request to "https://reqres.in/api/users/2"
    Then The response status code should be 200
    And The response should contain the user with ID 2

  Scenario: Create a new user
    Given I send a POST request to "https://reqres.in/api/users" with body:
      """
      {
        "name": "John",
        "job": "Developer"
      }
      """
    Then The response status code should be 201
    And The response should contain the name "John" and job "Developer"
