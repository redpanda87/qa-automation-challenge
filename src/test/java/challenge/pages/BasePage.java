package challenge.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://automationpractice.com/index.php")

public class BasePage extends PageObject {



private static String SIGN_IN = ".login";
public static String NICKNAME =".header_user_info>a>span";
public static String LOGOUT = ".logout";



    public LoginPage accessToLoginPage() {
        $(SIGN_IN).waitUntilClickable().click();
        return this.switchToPage(LoginPage.class);
    }

    public void openPage(){
        open();


    }


   

}
