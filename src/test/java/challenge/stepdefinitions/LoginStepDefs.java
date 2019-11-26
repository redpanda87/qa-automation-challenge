package challenge.stepdefinitions;

import challenge.model.User;
import challenge.steps.LoginSteps;
import com.github.javafaker.Faker;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.jruby.RubyProcess;

public class LoginStepDefs {

    Faker faker = new Faker();


    @Steps
    private LoginSteps lSteps;

    @Given("I open home page")
    public void iOpenHomePage() {
        lSteps.gotoHomePage();

    }

    @When("I click on sign in button")
    public void iClickOnSignInButton() {
        lSteps.goToSignIn();
    }


    @And("I Click Create an account option")
    public void iClickCreateAnAccountOption() {
        lSteps.submitRegisterEmail();
    }



    @And("I login with credentials (.*),(.*)")
    public void iLoginWithCredentialsUsernamePassword(String user,String pass) {
        lSteps.loginAsExistingCustomer(user,pass);
    }
}
