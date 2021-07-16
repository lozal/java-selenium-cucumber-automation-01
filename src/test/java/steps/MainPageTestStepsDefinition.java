package steps;

import com.herokuapp.theinternet.tests.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MainPageTestStepsDefinition extends BaseTest {


    @Before
    public void start(){
        setup();
    }

    @After
    public void finish(){
        tearDown();
    }



    @Given("I go to the main page")
    public void iGoToTheMainPage() {
        main.goTo();
    }

    @Then("I check that the main page is correct")
    public void iCheckThatTheMainPageIsCorrect() {
        main.checkPageIsCorrect();
    }
}
