package challenge.stepdefinitions;

import challenge.steps.CreateAccountSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import challenge.model.User;
import org.junit.Assert;
import org.omg.PortableInterceptor.USER_EXCEPTION;

public class CreateAccountStepDefs {

    @Steps
    private CreateAccountSteps accountSteps;

    @And("I Fill all fields with correct data")
    public void iFillAllFieldsWithCorrectData() {
        accountSteps.fillTheForm();
    }

    @And("I Click Register button")
    public void iClickRegisterButton() {
        accountSteps.clickOnRegister();
        System.out.println("******** USER IS : " + User.getEmail());
        System.out.println("******** Password IS : " + User.getPassword());
        System.out.println("******** Name IS : " + User.getFullName());

    }

    @Then("I should be able to login and see my username and logout button")
    public void iShouldBeAbleToLoginAndSeeMyUsernameAndLogoutButton() {
        Assert.assertTrue(accountSteps.isMyAccountPageDisplayed());
        Assert.assertTrue(accountSteps.IsLogoutDisplayed());


    }
}
