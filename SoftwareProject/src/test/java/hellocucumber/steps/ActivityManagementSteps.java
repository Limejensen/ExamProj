package hellocucumber.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import dtu.example.ui.Activity;
import dtu.example.ui.Project;
import dtu.example.ui.Schedule;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActivityManagementSteps {
    private Schedule schedule = Schedule.getInstance();
    private Project project;
    private Activity activity;
    private String projectName;

    @Given("a project with projectID {int} exists")
    public void aProjectWithProjectIDExists(int projectID) {
        assertTrue(schedule.projectExistsID(projectID));
    }

    @When("I create a new activity {string} in the project with projectID {string}")
    public void iCreateANewActivityInTheProjectWithProjectID(String string, String string2) {
        
        throw new io.cucumber.java.PendingException();
    }

    @When("set a budget of {int} hours")
    public void setABudgetOfHours(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("set the start date to {string} and end date to {string}")
    public void setTheStartDateToAndEndDateTo(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @Then("the activity should be added to the project")
    public void theActivityShouldBeAddedToTheProject() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
