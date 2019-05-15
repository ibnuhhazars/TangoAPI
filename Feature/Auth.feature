Feature: Auth

  Background: I open Soap-ui

  Scenario: Prompts the user for authorization using HTTP Basic Auth
  	When i set auth with user name "admin" and password "P@ssw0rd"
    And i call GET "http://httpbin.org/basic-auth/admin/P@ssw0rd"
    Then i get receive status code of 200
    And i verify Body Response "authenticated" is "true"
    And i verify Body Response "user" is "admin"

  Scenario: Prompts the user for authorization using bearer authentication
  	When i set header "Authorization" is "Bearer YWRtaW46UEBzc3cwcmQ="
  	And i call GET "http://httpbin.org/bearer"
    Then i get receive status code of 200
    And i verify Body Response "authenticated" is "true"
    And i verify Body Response "token" is "YWRtaW46UEBzc3cwcmQ="