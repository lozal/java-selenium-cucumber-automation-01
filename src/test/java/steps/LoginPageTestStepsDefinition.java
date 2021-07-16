package steps;

import com.herokuapp.theinternet.tests.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTestStepsDefinition extends BaseTest {

    @Before
    public void start(){
        setup();
    }

    @After
    public void finish(){
        tearDown();
    }


    @Given("I go to the login page")
    public void iGoToTheLoginPage() {
        loginPage.goTo();
    }

    @When("I check that the page is correct")
    public void iCheckThatThePageIsCorrect() {
        loginPage.checkPageIsCorrect();
    }

    @And("I login as {string} with password {string}")
    public void iLoginAsWithPassword(String username, String password) {
        loginPage.fillInLogin(username, password);
    }

    @Then("I should see the message You logged into a secure area")
    public void iShouldSeeTheMessage() {
        loginPage.loginVerify();
    }
}
