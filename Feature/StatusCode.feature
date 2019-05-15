Feature: Status Code

  Background: I open Soap-ui

  Scenario Outline: GET Return status code or random status code if more than one are given
    When i call GET "<url>"
    Then i get receive status code of <statusCode>
    
    Examples: 
    |url|statusCode|
    |http://httpbin.org/status/200|200|
    |http://httpbin.org/status/300|300|
    |http://httpbin.org/status/400|400|
    |http://httpbin.org/status/500|500|
	
	Scenario Outline: POST Return status code or random status code if more than one are given
    When i call POST "<url>"
    Then i get receive status code of <statusCode>
    
    Examples: 
    |url|statusCode|
    |http://httpbin.org/status/200|200|
    |http://httpbin.org/status/300|300|
    |http://httpbin.org/status/400|400|
    |http://httpbin.org/status/500|500|