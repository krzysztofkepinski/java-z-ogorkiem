
Feature: User Login
  Allow users that are defied in the system to login
  and put them in the context of the company they have been assigned to.

  Scenario: Login to existing user account
    Given a company named Cartoon Network
    And a user with login susan@susan.sr.com and password 3c5x9cfg
    When susan@susan.sr.com logs into the system with password 3c5x9cfg
    Then susan@susan.sr.com is logged into Cartoon Network's account
