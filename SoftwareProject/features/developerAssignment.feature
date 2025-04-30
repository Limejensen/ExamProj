#Feature: Developer Assignment
#As a project leader
#I want to assign and unassign developers
#So that I can manage team workloads
#
#Scenario: Assign a developer
#    Given I am logged in as a project leader
#    When I assign developer "DEI" to activity "Design"
#    Then the developer should be assigned
#
#Scenario: Unassign a developer
#    Given developer "AHO" is assigned to activity "Testing"
#    When I remove the developer
#    Then the system should remove the assignment