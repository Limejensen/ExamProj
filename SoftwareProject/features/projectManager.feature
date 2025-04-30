#Feature: Project Management
#As a project leader
#I want to create and delete projects
#So that projects can be effectively managed
#
#Scenario: Create a new project
#    Given I am logged in as a project leader
#    When I enter a project name "Time Tracking System"
#    Then the system should generate a project number in the format "YYXXX"
#    And the project should be created with me as project leader
#    And I should receive a confirmation message
##
#Scenario: Delete a project
#    Given I am logged in as a project leader
#    And a project named "Project Alpha" exists
#    When I delete project "Project Alpha"
#    Then the system should remove the project and all associated data
#    And I should receive a confirmation message