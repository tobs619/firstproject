package orgtk.Stepdefs;

import io.cucumber.java.en.And;
import orgtk.PageObjects.CheckoutPage;
import orgtk.PageObjects.ConfirmationPage;
import orgtk.PageObjects.ShoppingCartPage;

public class CheckoutStepdefs {
    @And("user clicks on checkout button")
    public void userClicksOnCheckoutButton() {
        ShoppingCartPage.clickCheckout();
    }

    @And("user clicks on continue button on billing details")
    public void userClicksOnContinueButtonOnBillingDetails() {
        CheckoutPage.clickBillingAddress();
        CheckoutPage.clickcontinuebilling();

    }

    @And("user clicks on Agree checkbox and delivery details")
    public void userClicksOnAgreeCheckboxAndDeliveryDetails() {
        CheckoutPage.clickcontinuedeliveryaddress();
    }

    @And("user clicks on Continue button on delivery method")
    public void userClicksOnContinueButtonOnDeliveryMethod() {
        CheckoutPage.clickcontinuedeliverymethod();
    }

    @And("user clicks on Terms checkbox on payment method")
    public void userClicksOnTermsCheckboxOnPaymentMethod() {
        CheckoutPage.clickcheckbox();
    }

    @And("user clicks on Continue on payment method")
    public void userClicksOnContinueOnPaymentMethod() {
        CheckoutPage.clickcontinuepaymentmethod();
    }

    @And("user clicks on confirm order button")
    public void userClicksOnConfirmOrderButton() {
        CheckoutPage.validatetotalprice("$205.00");
        CheckoutPage.clickconfirmedorder();
    }

    @And("user gets a confirmation")
    public void userGetsAConfirmation() {
        ConfirmationPage.validateconfirmation("Your order has been placed!");
    }
}
