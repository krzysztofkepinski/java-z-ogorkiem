package kawazogorkiem;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kawazogorkiem.pageobjects.HomePage;
import kawazogorkiem.pageobjects.LoginPage;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StepDefinitions {

    private String login;
    private String password;
    SRSiteNavigator srSite;

    @Before
    public void beforeScenario() {
        srSite = new SRSiteNavigator();
    }

    @After
    public void afterScenario() {
        srSite.close();
    }

    @Given("a company")
    public void aCompany() {
    }

    /*
        I think we should not use explicit names in steps unless they are relevant for test scenario.
        In this case company's name, user's login and password are irrelevant. They should not be mentioned
        explicitly in scenario, but provided by Muchomor underneath.
     */

    @Given("user with login ([\\w@\\.]+) and password (\\w+)")
    public void aUserWithLoginAndPassword(String userLogin, String userPassword) {
        login = userLogin;
        password = userPassword;
    }

//    @When("([\\w@\\.]+) logs into the system with password (\\w+)")
    @When("the user logs into the system with her password")
    public void userLogsIntoTheSystemWithPassword() {
        LoginPage page = srSite.loginPage();
        page.open();
        page.setEmail(login);
        page.setPassword(password);
        page.clickLogin();
    }

//    @Then("([\\w@\\.]+) is logged into ([\\w\\s]+)'s account")
    @Then("she is logged into the company's account")
    public void userIsLoggedIntoCompanyAccount() {
        HomePage page = srSite.homePage();
        assertThat(page.getHomeLink().isDisplayed(), is(true));
    }

}
