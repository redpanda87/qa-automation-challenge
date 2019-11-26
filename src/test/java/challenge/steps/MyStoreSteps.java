package challenge.steps;

import challenge.pages.MyStorePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyStoreSteps extends ScenarioSteps {

    MyStorePage storePage;

    @Step("I add product to cart")
    public void addProductToCart(){
        storePage.AddToCardItem();
    }

    @Step("I confirm the order")
    public void confirmOrder(){
        storePage.confirmOrder();
    }
    @Step("Is payment confirmed")
    public boolean isPaymentConfirmed(){
        return storePage.isPaymentConfirmed();

    }

    @Step("Is order confirmed")
    public boolean isOrderConfirmed(){
        return storePage.isOrderConfirmed();

    }

}
