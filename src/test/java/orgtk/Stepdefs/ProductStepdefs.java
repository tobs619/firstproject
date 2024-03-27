package orgtk.Stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orgtk.PageObjects.HomePage;
import orgtk.PageObjects.ProductsPage;
import orgtk.PageObjects.ShoppingCartPage;

public class ProductStepdefs {

    @Given("user clicks on Show all Laptops and Notebooks link")
    public void userClicksOnShowAllLaptopsAndNotebooksLink() {
        HomePage.clickAllLaptopsandNotebooks();
    }
    @And("user clicks on the Macbook Product")
    public void userClicksOnTheMacbookProduct() {
        ProductsPage.clickmacbookProduct();
    }
    @And("user enters quantity of Product")
    public void userEntersQuantityOfProduct() {
        ProductsPage.quantityProduct("2");

    }

    @When("user clicks on Add to cart button for Macbook")
    public void userClicksOnAddToCartButtonForMacbook() {
        ProductsPage.validateProduct("Macbook");
        ProductsPage.validatePrice("$602.00");
        ProductsPage.AddtoCart();

    }
    @When("user clicks on Add to cart button for HP")
    public void userClicksOnAddToCartButtonForHP() {
        ProductsPage.validateProduct("HP LP3065");
        ProductsPage.validatePrice("$100.00");
        ProductsPage.AddtoCart();

    }
    @And("user clicks on Shopping Cart Link")
    public void userClicksOnShoppingCartLink() {
        HomePage.clickShoppinCart();

    }



    @Then("Macbook is added to cart")
    public void macbookIsAddedToCart() {
        ShoppingCartPage.validateProduct("Macbook");
        ShoppingCartPage.productQuantity("2");
        ShoppingCartPage.validateTotalPrice("$1,204.00");


    }

    @And("user clears the shopping cart")
    public void userClearsTheShoppingCart() {
        ShoppingCartPage.clearShoppingCart();
    }

    @And("user clicks on the HP laptop")
    public void userClicksOnTheHPLaptop() {
        ProductsPage.clickhpproduct();

    }

    @And("HP product is added to cart")
    public void Hpproductisaddedtocart(){
        ShoppingCartPage.validateProduct("HP LP3065");
        ShoppingCartPage.validateTotalPrice("$200.00");
    }


}
