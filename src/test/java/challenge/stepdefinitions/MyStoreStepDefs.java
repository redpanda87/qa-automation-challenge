package challenge.stepdefinitions;

import challenge.steps.MyStoreSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class MyStoreStepDefs {
    @Steps
    private MyStoreSteps steps;

    @And("I add to cart the product")
    public void iAddToCartTheProduct(){
        steps.addProductToCart();
    }

    @And("I confirm the order")
    public void iConfirmTheOrder(){
        steps.confirmOrder();
    }

    @Then("I should see my order confirmed")
    public void iShouldSeeMyOrderConfirmed() {
        Assert.assertTrue(steps.isPaymentConfirmed());
        Assert.assertTrue(steps.isOrderConfirmed());


    }
}
