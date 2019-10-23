Feature: Test User API
  Background:
    * url apiURL
    * def randomnumber = Math.random()
    * def name = 'hardwareandro-'+randomnumber

  Scenario: Get all employee data
    Given url apiURL
    And path 'employees'
    When method GET
    Then status 200
  Scenario: Create new record in database
    Given url apiURL
    And path 'create'
    And request {"name":"#(name)","salary":"123","age":"24"}
    When method post
    Then status 200
  Scenario: Get a single employee data
    Given url apiURL
    And path 'employee/8386'
    When method get
    Then status 200