package hellocucumber.steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dtu.example.ui.Login;
import dtu.example.ui.Project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectManagementSteps {
    Login login = new Login();
    Project project = new Project();

    @Given("a user is logged in")
    public void aUserIsLoggedIn() {
        assertEquals(login.loggedIn(), true);
    }
    @Given("a project named {string} exists")
    public void aProjectNamedExists(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("the user creates a project named {string}")
    public void theUserCreatesAProjectNamed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I delete project {string}")
    public void iDeleteProject(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the system should remove the project and all associated data")
    public void theSystemShouldRemoveTheProjectAndAllAssociatedData() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should receive a confirmation message")
    public void iShouldReceiveAConfirmationMessage() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
