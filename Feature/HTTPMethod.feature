Feature: HTTP Method

	Background: I open Soap-ui

  Scenario: GET Http Method
    When i call GET "http://httpbin.org/get"
    Then i get receive status code of 200
    And i verify Body Response "args" is "{}"
    And i verify Body Response "headers.Accept" is "*/*"
		And i verify Body Response "headers.Host" is "httpbin.org"
		And i verify Body Response "url" is "https://httpbin.org/get"
		
  Scenario: POST Http Method
    When i call POST "http://httpbin.org/post"
    Then i get receive status code of 200
 		And i verify Body Response "args" is "{}"
    And i verify Body Response "headers.Accept" is "*/*"
		And i verify Body Response "headers.Host" is "httpbin.org"
		And i verify Body Response "url" is "https://httpbin.org/post"