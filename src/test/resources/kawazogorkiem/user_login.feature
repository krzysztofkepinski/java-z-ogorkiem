
Feature: User Login
  Allow users that are defied in the system to login
  and put them in the context of the company they have been assigned to.

  Scenario: Login to existing user account
    Given a company
    And a user in the company's context
    When the user logs into the system with her password
    Then she is logged into the company's account
