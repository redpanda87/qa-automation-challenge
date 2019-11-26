package challenge.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;


public class MyStorePage extends BasePage{

    private static String  TSHIRTS ="#block_top_menu>ul>li:nth-child(3)";
    private static String TERMS_OF_SERVICE="#cgv";
    private static String CONFIRM_MY_ORDER="#cart_navigation span";
    private static String CONFIRM_MESSAGE =".cheque-indent>strong";
    private static String EXPECTED_MESSAGE="Your order on My Store is complete.";
    private static String ADD_TO_CART=".ajax_add_to_cart_button>span";
    //Payment
    private static String BANK_WIRE=".bankwire";
    private static String PAYMENT_STEP ="step_end";


    public void AddToCardItem(){

        $(TSHIRTS).click();
        $(TERMS_OF_SERVICE).click();

    }

    public void selectPayment(){
        $(BANK_WIRE).waitUntilPresent().click();
    }

    public boolean isPaymentConfirmed(){
        return $(PAYMENT_STEP).isCurrentlyEnabled();

    }

    public boolean isOrderConfirmed(){
       String value = $(CONFIRM_MESSAGE).getValue().toString();

        return value.equals(EXPECTED_MESSAGE);
    }


    public void confirmOrder(){
        $(CONFIRM_MY_ORDER).waitUntilPresent().click();

    }









}

