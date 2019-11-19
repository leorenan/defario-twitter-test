Feature: sample karate test script
  for help, see: https://github.com/intuit/karate/wiki/IDE-Support

  Background:
    * url 'http://ecs-load-balancer-1863369448.us-east-1.elb.amazonaws.com:8080'

  Scenario: Retorna o top 5 de usuarios com mais seguifores
    Given path '/api/v1/usuarios/top-5-seguidores'
    When method get
    Then status 200
    * assert response.payload.size() <= 5