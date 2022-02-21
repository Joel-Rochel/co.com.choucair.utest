package co.com.choucair.utest.stepdefinitions;

import co.com.choucair.utest.model.UtestData;
import co.com.choucair.utest.questions.Answer;
import co.com.choucair.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class UtestStepDefinitions {

    @Before
    public void setStage (){
        setTheStage(new OnlineCast());
    }

    @Given("^Joel wants to register on the Utest site$")
    public void joelWantsToRegisterOnTheUtestSite() {
        theActorCalled("Joel").wasAbleTo(OpenUp.thePage(), Register.onThePage());
    }


    @When("^start the registration process in Utest$")
    public void startTheRegistrationProcessInUtest(List<UtestData> data) {
        theActorInTheSpotlight().attemptsTo(FillOutThePersonalData.onThePage(data), FillOutTheLocationData.onThePage(data),
                FillOutTheDevicesData.onThePage(data), FillOutTheCredentialsData.onThePage(data));
    }

    @Then("^check the final registration process$")
    public void checkTheFinalRegistrationProcess(List<UtestData> data) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(data)));
    }
}
