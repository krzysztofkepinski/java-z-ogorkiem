package kawazogorkiem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions {

    /*
    * TODO have regexes extracted into some external dependency and reuse them across
    * all BDD testing repos. For example, a regex for system logins or allowed passwords.
    */
    @Given("^a company named ([\\w\\s]+)$")
    public void aCompany(String name) throws Throwable {
    }

    @Given("a user with login ([\\w@\\.]+) and password (\\w+)")
    public void aUserWithLoginAndPassword(String login, String password) {

    }

    @When("([\\w@\\.]+) logs into the system with password (\\w+)")
    public void userLogsIntoTheSystemWithPassword(String login, String password) {

    }

    @Then("([\\w@\\.]+) is logged into ([\\w\\s]+)'s account")
    public void userIsLoggedIntoCompanyAccount(String login, String CompanyName) {

    }

}
