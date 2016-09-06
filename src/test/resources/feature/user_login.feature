
Feature: User Login
  Allow users that are defied in the system to login
  and put them in the context of the company they have been assigned to.

  Scenario: Login to existing user account
    Given a company 'Cartoon Network' with Corporate plan
    And a user with login 'susan@susan.sr.com' and password '3c5x9cfg'
    When the user logs into the system
    Then he is logged into company's account
