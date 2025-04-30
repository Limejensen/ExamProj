Feature: Login
As a user i want to be able to log into the system

Scenario: a user from the list of workers tries to log in
    Given a user tries to log in with credentials "huba"
    Then the user succesfully logs in

Scenario: a user not in the list of workers tries to log in
    Given a user tries to log in with credentials "abe"
    Then the user does not logs in
    And the text changes to "Not Valid Credentials. Try Again."
