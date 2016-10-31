
Feature: User Login
  Allow users that are defied in the system to login
  and put them in the context of the company they have been assigned to.

  Scenario: Login to existing user account
    Given a company
    And user with login susan@susan.sr.com and password 3c5x9cfg
    When the user logs into the system with her password
    Then she is logged into the company's account

  Scenario: Login with invalid password
    Given a company
    And user with login susan@susan.sr.com and password 3c5x9cfg
    When the user logs into the system with her login and password 123456
    Then she gets an invalid email and password message
    And she is not logged into the system