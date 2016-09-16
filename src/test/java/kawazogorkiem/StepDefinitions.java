package kawazogorkiem;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.smartrecruiters.testing.configurator.Configurator;


public class StepDefinitions {

    Configurator configurator = new Configurator(this.getClass());

    /*
    * TODO have regexes extracted into some external dependency and reuse them across
    * all BDD testing repos. For example, a regex for system logins or allowed passwords.
    */
//    @Given("^a company named ([\\w\\s]+)$")
    @Given("a company")
    public void aCompany() throws Throwable {
    }

    /*
        I think we should not use explicit names in steps unless they are relevant for test scenario.
        In this case company's name, user's login and password are irrelevant. They should not be mentioned
        explicitly in scenario, but provided by Muchomor underneath.
     */

//    @Given("a user with login ([\\w@\\.]+) and password (\\w+)")
    @Given("a user in the company's context")
    public void aUserWithLoginAndPassword() {

    }

//    @When("([\\w@\\.]+) logs into the system with password (\\w+)")
    @When("the user logs into the system with her password")
    public void userLogsIntoTheSystemWithPassword() {

    }

//    @Then("([\\w@\\.]+) is logged into ([\\w\\s]+)'s account")
    @Then("she is logged into the company's account")
    public void userIsLoggedIntoCompanyAccount() {

    }

}
