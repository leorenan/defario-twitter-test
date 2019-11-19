Feature: sample karate test script
  for help, see: https://github.com/intuit/karate/wiki/IDE-Support

  Background:
    * url 'http://ecs-load-balancer-1863369448.us-east-1.elb.amazonaws.com:8080'

  Scenario: Efetua a busca por uma hashtag
    Given path '/api/v1/twitts/hashtag'
    And param hashtags = "aws"
    When method get
    Then status 200
    
  Scenario: Efetua a busca por varias hashtag
    Given path '/api/v1/twitts/hashtag'
    And param hashtags = 'aws', 'gcp', 'azure'
    When method get
    Then status 200

  Scenario: Efetua a busca por hashtag vazio
    Given path '/api/v1/twitts/hashtag'
    When method get
    Then status 400