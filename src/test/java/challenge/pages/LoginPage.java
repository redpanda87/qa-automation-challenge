package challenge.pages;

import challenge.model.User;
import com.github.javafaker.Faker;

public class LoginPage extends BasePage {

      User user = new User();
      Faker fake = new Faker();


    //Authentication

    private static String EMAIL_CREATE="#email_create";
    private static String BUTTON_SUBMIT_CREATE ="#SubmitCreate";
    private static String USERNAME = "#email";
    private static String PASSWORD = "#passwd";


    public CreateAccountPage submitEmailCreate(){
        accessToLoginPage();

        user.setEmail(fake.internet().emailAddress());
        user.setPassword(fake.internet().password());
        user.setName(fake.name().firstName());
        user.setLastName(fake.name().lastName());
        $(EMAIL_CREATE).sendKeys(User.getEmail());
        $(BUTTON_SUBMIT_CREATE).waitUntilClickable().click();
        return this.switchToPage(CreateAccountPage.class);

    }

    public MyStorePage loginWithCredentialsDetails(String user, String password) {
        accessToLoginPage();
        $(USERNAME).sendKeys(user);
        $(PASSWORD).typeAndEnter(password);

        return this.switchToPage(MyStorePage.class);
    }



}

	


