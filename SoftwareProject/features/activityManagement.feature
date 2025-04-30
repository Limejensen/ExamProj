#Feature: Activity Management
#As a project leader
#I want to manage activities within projects
#So that project tasks are clearly defined and organized
#
#Scenario: Create a new activity
#    Given I am logged in as a project leader for project "22001"
#    When I create a new activity "Requirements Analysis"
#    And set a budget of 100 hours
#    And set the start date to "2022-10-01" and end date to "2022-10-14"
#    Then the activity should be added to the project
#
#Scenario: Schedule future activity
#    Given I am logged in as a project leader
#    When I create an activity "Implementation"
#    And I set the start date to "2025-06-01" and end date to "2025-07-01"
#    Then the activity should be created with specified dates