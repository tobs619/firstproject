package orgtk.Stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orgtk.BaseClass;
import orgtk.PageObjects.HomePage;
import orgtk.PageObjects.LoginPage;
import orgtk.Utils.PropertiesUtil;

import java.util.Properties;

public class loginStepdefs extends BaseClass {

    Properties properties = PropertiesUtil.loaduserProperties();


    @Given("user enters valid email in the email  field")
    public void userEntersValidUsernameInHeUsernameField() {

        String username = properties.getProperty("username");
        LoginPage.enterUsername(username);

    }

    @And("user enters valid password in the password field")
    public void userEntersValidPasswordInThePasswordField() {
        String password = properties.getProperty("password");
        LoginPage.enterPassword(password);


    }

    @When("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        LoginPage.clickLogin();

    }

    @Then("user is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        HomePage.validateLogin("My Account");
    }

    @Given("^user enters invalid (.*) in the email field$")
    public void userEntersInvalidUsernameInHeUsernameField(String username) {

        LoginPage.enterUsername(username);
    }

    @And("^user enters invalid (.*) in the password field$")
    public void userEntersInvalidPasswordInThePasswordField(String password) {
        LoginPage.enterPassword(password);
    }

    @Then("^error (.*) is displayed$")
    public void errorMessageIsDisplayed(String message) {
        LoginPage.validateInvalidLogin(message);
    }

    @Given("User is Logged in")
    public void userIsLoggedIn() {
        userEntersValidUsernameInHeUsernameField();
        userEntersValidPasswordInThePasswordField();
        userClicksOnTheLoginButton();
        userIsLoggedInSuccessfully();
    }


}
