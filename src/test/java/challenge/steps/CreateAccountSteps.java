package challenge.steps;

import challenge.pages.CreateAccountPage;
import net.thucydides.core.annotations.Step;

public class CreateAccountSteps {

    CreateAccountPage accountPage;

    @Step("Fill up the form")
    public void fillTheForm(){
        accountPage.fillUpAllFields();
    }

    @Step("click on register")
    public void clickOnRegister(){
        accountPage.registerAccount();
    }

    @Step("Is NickName Displayed")
    public boolean isNickNameDisplayed(String name){
        return accountPage.doesNameMatchWithMyUser(name);
    }

    @Step(" Is Logout Displayed")
    public boolean IsLogoutDisplayed(){return accountPage.isLogoutDisplayed();}

    @Step("Is My Account Page Displayed")
    public boolean isMyAccountPageDisplayed(){return accountPage.isMyAccountPageDisplayed();}


}
