package challenge.steps;



import challenge.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class LoginSteps extends ScenarioSteps {
    LoginPage loginPage;


    @Step("Login as a existing customer")
    public void loginAsExistingCustomer(String user,String pass){
        loginPage.loginWithCredentialsDetails(user,pass);
    }

    @Step("SubmitRegisterAction")
    public void submitRegisterEmail(){
        loginPage.submitEmailCreate();
    }

    @Step("open sign in")
    public void goToSignIn(){
        loginPage.accessToLoginPage();
    }

    @Step("open the page")
    public void gotoHomePage(){loginPage.openPage();}
    @Step("Login with credentials")
    public void loginWithCredentials(String user,String pass){
        loginPage.loginWithCredentialsDetails(user,pass);
    }

}
