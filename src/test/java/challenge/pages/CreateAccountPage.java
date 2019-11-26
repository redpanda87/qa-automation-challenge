package challenge.pages;

import challenge.model.User;
import com.github.javafaker.Faker;

import java.util.Locale;

public class CreateAccountPage extends BasePage {

    private Faker faker = new Faker(new Locale("en-US"));

    private static String MALE_GENDER = "#id_gender1";
    private static String FEMALE_GENDER = "#id_gender2";
    private static String FIRST_NAME = "#customer_firstname";
    private static String LAST_NAME = "#customer_lastname";
   // private static String EMAIL = "#email";
    private static String PASSWORD = "#passwd";
    private static String DAY ="#days";
    private static String MONTH ="#months";
    private static String YEAR ="#years";

    // YOURS ADDRESS
    private static String NAME = "#firstname";
    private static String LAST = "#lastname";
    private static String ADDRESS = "#address1";
    private static String CITY = "#city";
    private static String STATE ="#id_state";
    private static String ZIPCODE = "#postcode";
    private static String MOBILE_PHONE="#phone_mobile";
    private static String ADDRESS2 = "#alias";
    private static String REGISTER_BUTTON="#submitAccount";

    // Header
    private static String MY_ACCOUNT = "#center_column>h1";



    public void fillUpAllFields() {


        $(MALE_GENDER).waitUntilClickable().click();
        $(FIRST_NAME).sendKeys(User.getName());
        $(LAST_NAME).sendKeys(User.getLastName());


        $(PASSWORD).sendKeys(User.getPassword());
        $(DAY).selectByValue("10");
        $(MONTH).selectByIndex(4);
        $(YEAR).selectByValue("1987");
        $(NAME).sendKeys(faker.name().firstName());
        $(LAST).sendKeys(faker.name().lastName());
        $(ADDRESS).sendKeys(faker.address().streetAddress());
        $(CITY).sendKeys(faker.address().city());
        $(STATE).selectByVisibleText("Colorado");
        $(ZIPCODE).sendKeys(faker.address().zipCodeByState("CO"));
        $(MOBILE_PHONE).sendKeys(faker.phoneNumber().cellPhone());
        $(ADDRESS2).sendKeys(faker.address().streetAddress());


    }


    public void registerAccount(){
        $(REGISTER_BUTTON).click();

    }

    public boolean isMyAccountPageDisplayed(){
        $(MY_ACCOUNT).waitUntilPresent();
        return $(MY_ACCOUNT).isDisplayed();
    }

    public boolean doesNameMatchWithMyUser(String nickname){
        if (nickname.equals("")){
            return true;
        }
        else {
            return nickname.equals($(NICKNAME).getText().toString());
        }

    }

    public boolean isLogoutDisplayed(){
        return $(LOGOUT).isDisplayed();

    }

}